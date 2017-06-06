package com.shra4Java;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience  
{

	public void takingSeats()
	{
		System.out.println("audience are taking their seats..");
	}
	
	public void clap()
	{
		System.out.println("clap clappp");
	}
	
	public void demandMoney()
	{
		System.out.println("Want money back!!");
	}
	
	public void watchPerformance(ProceedingJoinPoint joinPoint) throws Throwable
	{
		System.out.println("Before buisness logic");
		
		joinPoint.proceed();
		
		System.out.println("After Buisness logic");
		
	}
}
