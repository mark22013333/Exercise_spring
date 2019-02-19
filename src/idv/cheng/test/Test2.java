package idv.cheng.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		String[] names = ac.getBeanDefinitionNames();
		System.out.println(Arrays.toString(names));
		
		Demo demo = ac.getBean("demo", Demo.class);
		try {
			demo.demo1();
			// demo.demo1("andy", 22);
			// demo.demo1("HOHO");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		// demo.demo2();
		// demo.demo3();
		// demo.demo4("傳遞的參數");
		// demo.demo5("demo5的參數");
		// Demo1 demo1 = ac.getBean("demo1", Demo1.class);
		// demo1.demo11();
	}

}
