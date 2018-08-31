package com.example.gentalella.configration;

import java.util.HashMap;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@PropertySource({"classpath:application.properties"})
@EnableJpaRepositories(entityManagerFactoryRef="mysqlEntityManager",
transactionManagerRef="mysqlTransactionManager",
basePackages= "com.kt.membership.dao")
public class MySqlDBConfig {

	@Value("${mysql.datasource.jndi-name}")
	private String mySqlJndiName;
	
	@Autowired
	private Environment env;
	
	@Primary
	@Bean(name="mySqlDataSource")
	public DataSource mySqlDataSource() {
		return new JndiDataSourceLookup().getDataSource(mySqlJndiName);
	}
	
	
	@Primary
	@Bean(name="mysqlEntityManager")
	public LocalContainerEntityManagerFactoryBean mysqlEntityManagerFactoryBean() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		
		em.setDataSource(mySqlDataSource());
		em.setPackagesToScan(new String[] {"com.kt.membership.domain.entity"});
		
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setPersistenceUnitName("mysqlJPA");
		
		HashMap<String, Object> properties = new HashMap<String, Object>();
		properties.put("hibernate.show_sql", env.getProperty("mysql.jpa.show_sql"));
		properties.put("hibernate.dialect", env.getProperty("mysql.jpa.properties.hibernate.dialect"));
		properties.put("hibernate.ddl-auto", env.getProperty("mysql.jpa.properties.hibernate.auto"));
		properties.put("hibernate.naming-strategy", env.getProperty("org.hibernate.cfg.ImprovedNamingStrategy"));
		
		em.setJpaPropertyMap(properties);
		return em;
		
	}
	
	
	@Primary
	@Bean(name="mysqlTransactionManager")
	public PlatformTransactionManager mysqlTransactionManager(@Qualifier("mysqlEntityManager") EntityManagerFactory mysqlEntityManager) {
		return new JpaTransactionManager(mysqlEntityManager);
	}
	
}
