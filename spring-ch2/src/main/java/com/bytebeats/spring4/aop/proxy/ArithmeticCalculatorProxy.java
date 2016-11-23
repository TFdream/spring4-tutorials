package com.bytebeats.spring4.aop.proxy;

import com.ricky.codelab.spring.aop.ArithmeticCalculator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ArithmeticCalculatorProxy {
	
	private ArithmeticCalculator target;
	
	public ArithmeticCalculatorProxy(ArithmeticCalculator target){
		this.target = target;
	}
	
	public ArithmeticCalculator getProxy(){
		
		ArithmeticCalculator proxy = null;
		
		proxy = (ArithmeticCalculator) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces() , new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				
				System.out.println("The method "+method.getName()+" begin with "+Arrays.toString(args));
				
				Object result = method.invoke(target, args);
				
				System.out.println("The method "+method.getName()+" end with "+result);
				
				return result;
			}
		});
		
		return proxy;
	}
}
