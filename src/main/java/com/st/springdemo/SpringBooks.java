package com.st.springdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

// @Component 
public class SpringBooks implements Books {

	public SpringBooks() {
		System.out.println("SpringBooks()");
	}
	
	@Override
	public List<String> getBooks() {
         ArrayList<String> books = new ArrayList<>();
         books.add("Spring in Action");
         books.add("Spring Data");
         return books;
	}

}
