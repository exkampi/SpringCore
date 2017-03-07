package home.javabegin.training.spring.main;

import home.javabegin.training.spring.impls.robot.ModelT800;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import home.javabegin.training.spring.impls.robot.ModelT1000;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");

		ModelT1000 t1000;
		ModelT800 t800;

		t800 = (ModelT800) context.getBean("t800");

		t1000 = (ModelT1000) context.getBean("t1000");
		System.out.println(t1000);

//		t1000 = (ModelT1000) context.getBean("t1000Empty");
//		System.out.println(t1000);

//		t1000 = (ModelT1000) context.getBean("t1000");
//		System.out.println(t1000);

//		t1000 = (ModelT1000) context.getBean("t1000");
//		System.out.println(t1000);
	}
}
