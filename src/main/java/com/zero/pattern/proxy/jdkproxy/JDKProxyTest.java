package main.java.com.zero.pattern.proxy.jdkproxy;

import java.lang.reflect.Proxy;

/**
 * @author zero
 * @description ProxyTest
 * @date 2022/5/9 10:42
 */
public class JDKProxyTest {
	public static void main(String[] args) {
		Calculator calculator = (Calculator) Proxy.newProxyInstance(
				MyCalculator.class.getClassLoader(),
				new Class[]{Calculator.class},
				new MyInvocationHandler(new MyCalculator()));
		calculator.add(1,1);

	}
}
