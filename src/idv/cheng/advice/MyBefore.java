package idv.cheng.advice;

import java.lang.reflect.Method;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

import idv.cheng.pojo.Users;

public class MyBefore implements MethodBeforeAdvice {

	@SuppressWarnings("deprecation")
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		Users users = (Users) args[0];
		Logger logger = Logger.getLogger(MyBefore.class);
		logger.info(users.getUsername() + "在" + new Date().toLocaleString() + "進行登入");
	}

}
