package com.config;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@Configuration
@EnableTransactionManagement
@PropertySource("classpath:applocation.properties")
@EntityScan("com")

public class MysqlConfig {
	@Value("${app.datasource.driverClassName}") String driverClassName;
	@Value("${app.datasource.url}") String url;
	@Value("${app.datasource.username}") String us;
	@Value("${app.datasource.password}") String ps;
	
	@Bean(name="dataSource")
	public DataSource getDataSource() {
		DataSource ds = DataSourceBuilder.create().driverClassName(driverClassName).url(url).username(us).password(ps).build();
		return ds;
	}
			
	@Bean(name="sessionFactory")
	public SessionFactory getLocalSession(DataSource ds) {
		LocalSessionFactoryBuilder sb = new LocalSessionFactoryBuilder(ds);
		sb.scanPackages("com");
		return sb.buildSessionFactory();
	}
	
	@Bean(name="transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory s) {
		HibernateTransactionManager hm = new HibernateTransactionManager(s);
		return hm;
	}
	
	@Bean
	public DataSourceInitializer getDataSourceInitializer(final DataSource ds) {
		final DataSourceInitializer di = new DataSourceInitializer();
		di.setDataSource(ds);
		return di;
	}
}
