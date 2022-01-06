package com.jgasystems.proxy.info;

import org.springframework.stereotype.Component;

@Component
public class SystemInfo {
	
	public void getSystemInfo() {
		System.out.println("Informacion del sistema:");
		System.out.println("Usuario: "+System.getProperty("user.name"));
		System.out.println("Home: "+System.getProperty("user.home"));
		System.out.println("Directorio: "+System.getProperty("user.dir"));
		System.out.println("Arch OS: "+System.getProperty("os.arch"));
		System.out.println("Name OS: "+System.getProperty("os.name"));
		System.out.println("OS version: "+System.getProperty("os.version"));
		System.out.println("Java home: "+System.getProperty("java.home"));
		System.out.println("Java vendor: "+System.getProperty("java.vendor.url"));
		System.out.println("Java version: "+System.getProperty("java.version"));
	}

}
