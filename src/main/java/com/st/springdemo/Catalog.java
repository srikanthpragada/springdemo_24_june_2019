package com.st.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component 
public class Catalog {
	@Autowired
	@Qualifier("springBooks")
	private Books catalog;
	
	@Autowired
	private MessagePrinter printer;
	

	public Catalog() {
		System.out.println("Catalog()");
	}
	
	public Books getCatalog() {
		return catalog;
	}

	public void setCatalog(Books catalog) {
		this.catalog = catalog;
	}

	public void print() {
		for(String b : catalog.getBooks())
			System.out.println(b);
	}
}
