package com.bytebeats.spring4.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Aspect
@Component
public class LogDeclareAspect {

	/**
	 * 使用@Pointcut来声明切入点表达式
	 * 定义一个方法用来声明切入点表达式,一般地,该方法中不需要填入其它代码
	 */
	@Pointcut("execution(String com.ricky.codelab.spring.aop.service.UserService.login(String,String))")
	public void declareJoinPointExpression(){
	}
	
	/**
	 * 前置通知：在方法执行前执行的代码
	 * @param joinpoint
	 */
	@Before("declareJoinPointExpression()")
	public void beforeExecute(JoinPoint joinPoint){
		
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		
		System.out.println("The method "+methodName+ " begin with "+args);
	}
}
