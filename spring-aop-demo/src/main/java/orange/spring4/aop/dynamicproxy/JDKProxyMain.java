package orange.spring4.aop.dynamicproxy;

public class JDKProxyMain {

	public static void main(String[] args) {
		
		ArithmeticCalculator target = new ArithmeticCalculatorImpl();
		
		ArithmeticCalculator proxy = new ArithmeticCalculatorProxy(target).getProxy();
		
		int result = proxy.add(2, 3);
		System.out.println("--"+result);
		
		result = proxy.mul(3, 5);
		System.out.println("--"+result);
		
	}

}
