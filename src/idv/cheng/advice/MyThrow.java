package idv.cheng.advice;

import java.lang.reflect.Method;
import java.rmi.RemoteException;

import javax.servlet.ServletException;

import org.springframework.aop.ThrowsAdvice;

public class MyThrow implements ThrowsAdvice {

	public void afterThrowing(Method m, Object[] args, Object target, Exception ex) {
		// Do something with all arguments
		System.out.println("execute exception advice");
	}
	public void afterThrowing(Exception ex) throws Throwable {
		// Do something with remote exception
		System.out.println("execute exception pass-schema-base method");
	}
}
