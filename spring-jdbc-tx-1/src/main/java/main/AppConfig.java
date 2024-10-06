package main;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@ComponentScan(basePackages = "com.vamsi")
public class AppConfig {
	
	@Bean
	public DataSource  dataSource() {
		DriverManagerDataSource  ds = new DriverManagerDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/my-own");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean
	public JdbcTemplate  template() {
		return new JdbcTemplate(dataSource());
	}
	
	@Bean
	public PlatformTransactionManager  transactionManager() {
		return new DataSourceTransactionManager(dataSource());
		
	}
}


