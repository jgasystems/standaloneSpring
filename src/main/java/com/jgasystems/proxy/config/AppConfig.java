package com.jgasystems.proxy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.jgasystems.proxy.info.SystemInfo;

@Configuration
@PropertySource("classpath:proxy.properties")
public class AppConfig {
	
	@Autowired
	Environment env;
	
	@Bean
	public SystemInfo systemInfo () {
		SystemInfo systemInfo = new SystemInfo();
		System.out.println(env.getProperty("version"));
		//saludator.setMensaje(env.getProperty("mensaje"));
		return systemInfo;
	}

}
