package home.javabegin.training.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");

		System.out.println("TERMINATOR #1: " + context.getBean("modelT800"));
		System.out.println("TERMINATOR #2: " + context.getBean("modelT800"));
		System.out.println("TERMINATOR #3: " + context.getBean("model1"));
		System.out.println("TERMINATOR #4: " + context.getBean("model1"));
	}
}
