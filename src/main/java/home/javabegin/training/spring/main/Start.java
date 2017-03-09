package home.javabegin.training.spring.main;

import home.javabegin.training.spring.impls.robot.ModelT800;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");

		ModelT800 t800 = (ModelT800) context.getBean("t800");
		t800.action();
	}
}
