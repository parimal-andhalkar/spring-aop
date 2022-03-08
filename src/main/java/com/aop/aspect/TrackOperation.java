package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {

	@Pointcut("execution(* com.aop.service.Operation.*(..))")
	public void k() {
	}                      // pointcut name

	@Before("k()") 							// applying pointcut on before advice
	public void myadvice(JoinPoint jp)     // it is advice (before advice)
	{
		System.out.println("additional concern");
	
	}

}
