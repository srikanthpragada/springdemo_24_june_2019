package com.st.springdemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

	@Pointcut("execution (* print*(..))")
	public void allPrintMethods() {

	}
	
	@Before(value = "execution (* print(..))")
	public void beforeAdviceMethod(JoinPoint jp) {
		System.out.println("Before Advice --> " + jp.getSignature());
	}

	@After("allPrintMethods()")
	public void afterAdviceMethod(JoinPoint jp) {
		System.out.println("After Advice --> " + jp.getSignature());
	}
}
