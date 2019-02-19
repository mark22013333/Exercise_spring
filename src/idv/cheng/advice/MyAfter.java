package idv.cheng.advice;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

import idv.cheng.pojo.Users;

public class MyAfter implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger(MyAfter.class);
		Users users = (Users) args[0];
		if (returnValue != null) {
			logger.info(users.getUsername() + "登入成功");
		}else {
			logger.info(users.getUsername() + "登入失敗");
		}
	}

}
