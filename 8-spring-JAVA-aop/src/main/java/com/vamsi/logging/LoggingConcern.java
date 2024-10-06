package com.vamsi.logging;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingConcern {

	@Before(value = "within(com.vamsi.servive.HelloServiceImpl)")
	public void logBefore() {
		System.out.println("Log Before");
	}
	
	@AfterReturning(value = "within(com.vamsi.servive.HelloServiceImpl)",returning = "rt")
	public void afterReturnning() {
		System.out.println("After Returnning"  );
	}
	
	@AfterThrowing(value = "within(com.vamsi.servive.HelloServiceImpl)",throwing = "rv")
	public void afterThrowing() {
		System.out.println("After Throwing"  );
	}
	
	@After(value = "within(com.vamsi.servive.HelloServiceImpl)")
	public void after() {
		System.out.println("after");
	}
}
