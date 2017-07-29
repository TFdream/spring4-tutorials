package orange.spring4.aop.xml;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;
import java.util.List;

public class ValidationAspect {

	/**
	 * 前置通知：在方法执行前执行的代码
	 * @param joinPoint
	 */
	public void validateArgs(JoinPoint joinPoint){
		
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		
		System.out.println("-->vlidation method "+methodName+ " begin with "+args);
	}
	
}
