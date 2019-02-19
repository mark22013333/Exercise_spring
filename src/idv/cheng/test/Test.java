package idv.cheng.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import idv.cheng.SingleTon;
import idv.cheng.pojo.People;

public class Test {
	public static void main(String[] args) {
		SingleTon singleton = SingleTon.getInstance();
		SingleTon singleTon1 = SingleTon.getInstance();
		System.out.println(singleton == singleTon1);
	}
	// People peo = new People();
	// ApplicationContext ac = new
	// ClassPathXmlApplicationContext("applicationContext.xml");
	// People people = ac.getBean("peo02", People.class);
	// System.out.println(people);
	// System.out.println("set.Size()=" + people.getSets().size());
	// System.out.println("list.Size()=" + people.getList().size());
	// System.out.println("map.Size()=" + people.getMaps().size());
	//
	// String[] names = ac.getBeanDefinitionNames();
	// for (String string : names) {
	// System.out.println("目前有的Bean:" + string);
	// }
	// }
}
