package com.jgasystems.proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jgasystems.proxy.config.AppConfig;
import com.jgasystems.proxy.info.SystemInfo;

public class ProxyMain {

	public static void main(String[] args) {
		
		 ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		 SystemInfo  systemInfo = (SystemInfo) context.getBean("systemInfo");
		 systemInfo.getSystemInfo();

	}

}
