package idv.cheng.advice;

public class MyThrowAdvice {
	public void myexeception(Exception e) {
		System.out.println("\"execute exception\" error message:" + e.getMessage());
	}

}
