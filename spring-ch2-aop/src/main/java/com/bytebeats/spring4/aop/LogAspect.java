package com.bytebeats.spring4.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Order(1)
@Aspect
@Component
public class LogAspect {

	/**
	 * 前置通知：在方法执行前执行的代码
	 * @param joinpoint
	 */
	@Before("execution(String com.ricky.codelab.spring.aop.service.UserService.login(String,String))")
	public void beforeExecute(JoinPoint joinPoint){
		
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		
		System.out.println("The method "+methodName+ " begin with "+args);
	}
	
	/**
	 * 后置通知：在方法执行后执行的代码(无论该方法是否发生异常),注意后置通知拿不到执行的结果
	 * @param joinpoint
	 */
	@After("execution(String com.ricky.codelab.spring.aop.service.UserService.login(String,String))")
	public void afterExecute(JoinPoint joinPoint){
		
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The method "+methodName+" end!");
	}
	
	/**
	 * 返回通知：在方法正常执行后执行的代码,可以获取到方法的返回值
	 * @param joinpoint
	 */
	@AfterReturning(value="execution(String com.ricky.codelab.spring.aop.service.UserService.login(String,String))",
			returning="result")
	public void afterReturning(JoinPoint joinPoint, Object result){
		
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The method "+methodName+" end with result:"+result);
	}
	
	/**
	 * 异常通知：在方法抛出异常之后执行,可以访问到异常信息,且可以指定出现特定异常信息时执行代码
	 * @param joinpoint
	 */
	@AfterThrowing(value="execution(String com.ricky.codelab.spring.aop.service.UserService.login(String,String))",
			throwing="exception")
	public void afterThrowing(JoinPoint joinPoint, Exception /**NullPointerException*/ exception){
		
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The method "+methodName+" occurs exception:"+exception);
	}
	
	/**
	 * 环绕通知, 围绕着方法执行
	 */
	@Around("execution(String com.ricky.codelab.spring.aop.service.UserService.login(String,String))")
	public Object aroundMethod(ProceedingJoinPoint joinPoint){
		
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The method "+methodName+" around");
		
		Object result = null;
		try {
			result = joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
