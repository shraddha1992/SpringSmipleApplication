package com.shra4Java;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience{

	@Pointcut("execution(* com.shra4Java.Performer.perform(..)")
	public void performanace(){}

	@Pointcut("execution(* com.shra4Java.Performer.delete(..)")
	public void delete(){}
	
	@Before("performanace()")
	public void takingSeates()
	{
		System.out.println("Audience are taking their seates..");
	}
	
	@AfterReturning("performanace()")
	public void clap()
	{
		System.out.println("clappinggg");
	}
	
	@AfterThrowing("performanace()")
	public void demandRefund()
	{
		System.out.println("Want money back..");
	}
	
	@Around("performamance()")
	public void watchPerformamance(ProceedingJoinPoint joinPoint) throws Throwable
	{
		System.out.println("before logicc");
		
		joinPoint.proceed();
		
		System.out.println("After logic..");
	}
	
}
