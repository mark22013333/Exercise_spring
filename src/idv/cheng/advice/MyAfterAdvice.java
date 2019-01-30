package idv.cheng.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("returnValue:" + returnValue);
		System.out.println("method:" + method);
		System.out.println("args:" + args);
		System.out.println("target:" + target);
		System.out.println("execution after advice");
	}

}
