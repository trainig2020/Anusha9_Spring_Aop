package org.abc.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("allGetters() && allCircleMethods()")
	public void LoggingAdvice() {
		System.out.println("Advice run. Get Method called");
	}

	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second Advice executed");

	}
	@Pointcut("execution(* get*())")
	public void allGetters(){}
	
	//@Pointcut("execution(* * org.abc.aop.model.Circle.*(..))")
	@Pointcut("within(org.abc.aop.model.Circle)")
	public void allCircleMethods(){}



}
