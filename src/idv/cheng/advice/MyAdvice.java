package idv.cheng.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.ietf.jgss.Oid;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

	@Before("idv.cheng.test.Demo.demo1()")
	public void mybefore() {
		System.out.println("前置");
	}

	@After("idv.cheng.test.Demo.demo1()")
	public void myafter() {
		System.out.println("後置通知");
	}

	@AfterThrowing("idv.cheng.test.Demo.demo1()")
	public void mythrow() {
		System.out.println("異常通知");
	}

	@Around("idv.cheng.test.Demo.demo1()")
	public Object myarround(ProceedingJoinPoint p) throws Throwable {
		System.out.println("環繞-前置");
		Object result = p.proceed();
		System.out.println("環繞-後置");
		return result;
	}

	// public void mybefore(String name1, int age1) {
	// System.out.println("前置" + name1 + " " + age1);
	// }
	//
	// public void mybefore1(String name1) {
	// System.out.println("前置" + name1);
	// }
	//
	// public void myafter() {
	// System.out.println("後置");
	// }
	//
	// public void myaftering() {
	// System.out.println("後置ing");
	// }
	//
	// public void mythrow() {
	// System.out.println("異常");
	// }
	//
	// public Object myarround(ProceedingJoinPoint p) throws Throwable {
	// System.out.println("執行環繞");
	// System.out.println("環繞-前置");
	// Object result = p.proceed();
	// System.out.println("環繞-後置");
	// return result;
	// }
}
