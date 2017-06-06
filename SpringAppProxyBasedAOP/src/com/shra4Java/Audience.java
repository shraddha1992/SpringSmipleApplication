package com.shra4Java;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;


public class Audience implements MethodBeforeAdvice , ThrowsAdvice , AfterReturningAdvice ,MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation joinpoint) throws Throwable {
		
		long start = System.currentTimeMillis() ;
		
		Object obj = joinpoint.proceed();
		
		long end = System.currentTimeMillis();
		
		System.out.println("The performance took "+(end - start )+"milliseconds");
				
		return obj;
	}

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Audiece are taking their seats");
		
	}

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		
		System.out.println("clapppppp !!!!!");
		
	}
	
	public void afterThrowing(Method method, Object[] data, Object target, PerformanceException e) {
		System.out.println("We want our money back....");
	}
 
	
	
}
