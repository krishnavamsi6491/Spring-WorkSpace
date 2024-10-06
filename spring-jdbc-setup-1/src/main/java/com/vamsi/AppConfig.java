package com.vamsi;



import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@ComponentScan(basePackages = "com.vamsi")
public class AppConfig {
	
	@Bean
	 
	public DataSource ds() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/my_own");
		ds.setUsername("root");
		ds.setPassword("root");
		
		return ds;
	}
		
	@Bean
	public JdbcTemplate jt(DataSource ds) {
		JdbcTemplate jt=new JdbcTemplate(ds);
		return jt;
	}
	}
	


