package com.bytebeats.spring4.aop.annotation;

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
public class TransferLogAdvice {

	@Pointcut("execution(* com.bytebeats.spring4.aop.annotation.service.BankServiceImpl.*(..))")
	public void pointcut1() {
	}

	@Pointcut("execution(* com.bytebeats.spring4.aop.annotation.service.*ServiceImpl.*(..))")
	public void myPointcut() {
	}

	/**
	 * 前置通知：在方法执行前执行的代码
	 * @param joinPoint
	 */
	@Before(value = "pointcut1() || myPointcut()")
	//@Before("execution(* com.bytebeats.spring4.aop.annotation.service.BankServiceImpl.*(..))")
	public void beforeExecute(JoinPoint joinPoint){
		
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		
		System.out.println(this.getClass().getSimpleName()+ " before execute:"+methodName+ " begin with "+args);
	}
	
	/**
	 * 后置通知：在方法执行后执行的代码(无论该方法是否发生异常),注意后置通知拿不到执行的结果
	 * @param joinPoint
	 */
	@After(value = "pointcut1()")
	public void afterExecute(JoinPoint joinPoint){
		
		String methodName = joinPoint.getSignature().getName();
		System.out.println(this.getClass().getSimpleName()+ " after execute:"+methodName+" end!");
	}
	
	/**
	 * 后置返回通知：在方法正常执行后执行的代码,可以获取到方法的返回值
	 * @param joinPoint
	 */
	@AfterReturning(value = "pointcut1()",
			returning="result")
	public void afterReturning(JoinPoint joinPoint, Object result){
		
		String methodName = joinPoint.getSignature().getName();
		System.out.println(this.getClass().getSimpleName()+ " afterReturning execute:"+methodName+" end with result:"+result);
	}
	
	/**
	 * 后置异常通知：在方法抛出异常之后执行,可以访问到异常信息,且可以指定出现特定异常信息时执行代码
	 * @param joinPoint
	 */
	@AfterThrowing(value = "pointcut1()",
			throwing="exception")
	public void afterThrowing(JoinPoint joinPoint, Exception /**NullPointerException*/ exception){
		
		String methodName = joinPoint.getSignature().getName();
		System.out.println(this.getClass().getSimpleName()+ " afterThrowing execute:"+methodName+" occurs exception:"+exception);
	}
	
	/**
	 * 环绕通知, 围绕着方法执行
	 */
	@Around(value = "pointcut1()")
	public Object around(ProceedingJoinPoint joinPoint){
		
		String methodName = joinPoint.getSignature().getName();
		System.out.println(this.getClass().getSimpleName()+ " around:"+methodName+" execute start");
		
		Object result = null;
		try {
			result = joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println(this.getClass().getSimpleName()+ " around:"+methodName+" execute end");
		return result;
	}
}
