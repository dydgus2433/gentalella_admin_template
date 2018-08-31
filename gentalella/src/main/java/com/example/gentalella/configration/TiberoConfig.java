package com.example.gentalella.configration;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@PropertySource("classpath:application.properties")
@MapperScan(value="com.kt.membership.tibero.dao",
sqlSessionFactoryRef = "tiberoSqlSessionFactory")
public class TiberoConfig {
	
	@Value("${tibero.datasource.jndi-name}")
	private String tiberoJndiName;
	
	@Bean(name="tiberoDataSource")
	public DataSource tiberoDataSource() {
		return new JndiDataSourceLookup().getDataSource(tiberoJndiName);
	}
	
	@Bean(name="tiberoTranscationManager")
	public PlatformTransactionManager tiberoTransactionManager() {
		return new DataSourceTransactionManager(tiberoDataSource());
	}
	

	@Bean(name="tiberoSqlSessionFactory")
	public SqlSessionFactory tiberoSqlSessionFactory(@Qualifier("tiberoDataSource") DataSource tiberoDataSource, ApplicationContext applicationContext) throws Exception {
		
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(tiberoDataSource);
		sqlSessionFactoryBean.setTypeAliasesPackage("com.kt.membership.tibero.domain.entity");
		sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:mapper/*/*.xml"));
		
		
		return sqlSessionFactoryBean.getObject();
	}

	
	@Bean(name="tiberoSqlSessionTemplate")
	public SqlSessionTemplate tiberoSqlSessionTemplate(@Qualifier("tiberoSqlSessionFactory") SqlSessionFactory tiberoSqlSessionFactory) {
		return new SqlSessionTemplate(tiberoSqlSessionFactory);
	}

}
