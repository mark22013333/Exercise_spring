package idv.cheng.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("切點方法對象：" + method + "，方法名：" + method.getName());
		if (args != null && args.length > 0) {
			System.out.println("切點方法參數：" + args[0]);
		} else {
			System.out.println("切點沒有參數");
		}
		System.out.println("切點方法參數：" + args);
		System.out.println("對象：" + target);
		System.out.println("execution before advice");
	}
}
