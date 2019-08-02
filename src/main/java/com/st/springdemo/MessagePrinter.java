package com.st.springdemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component 
@Lazy
public class MessagePrinter {
  
	 public MessagePrinter() {
	    System.out.println("MessagePrinter()");
	}		
}
