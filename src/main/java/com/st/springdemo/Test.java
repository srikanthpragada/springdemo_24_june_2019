package com.st.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component 
public class Test implements CommandLineRunner {
	@Autowired 
    Catalog cat;
    
	public Test() {
		System.out.println("Test()");
	}
	@Override
	public void run(String... args) throws Exception {
		cat.print(); 
	}
  
}
