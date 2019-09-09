package com.zhangkai.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.mchange.v2.c3p0.ComboPooledDataSource;

//@Configuration
public class C3p0Config {
	@Bean(name="dataSource")
	@Qualifier(value="dataSource")
	@Primary
	@ConfigurationProperties(prefix="c3p0")
	public ComboPooledDataSource dataSource() {
		ComboPooledDataSource build = DataSourceBuilder.create().type(com.mchange.v2.c3p0.ComboPooledDataSource.class).build();
		return build; 
	}
}
