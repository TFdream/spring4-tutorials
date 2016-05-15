package com.ricky.codelab.spring.aop.xml;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;

public class VlidationAspect {

	/**
	 * 前置通知：在方法执行前执行的代码
	 * @param joinpoint
	 */
	public void validateArgs(JoinPoint joinPoint){
		
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		
		System.out.println("-->vlidation method "+methodName+ " begin with "+args);
	}
	
}
