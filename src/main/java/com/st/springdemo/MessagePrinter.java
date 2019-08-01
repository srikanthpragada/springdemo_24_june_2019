package com.st.springdemo;

import org.springframework.stereotype.Component;

@Component 
public class MessagePrinter {
  
	 public MessagePrinter() {
	    System.out.println("MessagePrinter()");
	}		
}
