package com.example.gentalella;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceTransactionManagerAutoConfiguration.class,
								DataSourceAutoConfiguration.class,
								HibernateJpaAutoConfiguration.class})
public class GentalellaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GentalellaApplication.class, args);
	}
}
