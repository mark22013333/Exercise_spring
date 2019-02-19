package idv.cheng.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyArround implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("前置環繞");
		Object result = invocation.proceed();// 放行，調用切點方式
		System.out.println("後置環繞");
		return result;
	}

}
