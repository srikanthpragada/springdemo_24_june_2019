package com.st.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// @Component 
public class InjectionDemo  implements CommandLineRunner{
	
	Books books;
	MessagePrinter printer;
	
	@Autowired 
	public InjectionDemo(Books books) {
		this.books =  books;
		System.out.println("Books object : " + this.books);
	}
	
	@Autowired
	public void setPrinter(MessagePrinter printer) {
		this.printer = printer;
		System.out.println("Printer object : " + this.printer);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Injection Demo!");
	}
	
	@PostConstruct
	public void afterConstruction()
	{ 
		System.out.println("After construction");
	}
	@PreDestroy
	public void beforeDestroyed()
	{ 
		System.out.println("Before destoryed");
	}

}
