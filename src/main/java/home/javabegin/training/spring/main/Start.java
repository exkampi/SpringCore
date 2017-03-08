package home.javabegin.training.spring.main;

import home.javabegin.training.spring.interfaces.Robot;
import home.javabegin.training.spring.interfaces.RobotConveyor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");

		RobotConveyor t1000Conveyor;
		t1000Conveyor = (RobotConveyor) context.getBean("t1000Conveyor");

		Robot terminator1 = t1000Conveyor.createRobot();
		Robot terminator2 = t1000Conveyor.createRobot();
		Robot terminator3 = t1000Conveyor.createRobot();

		System.out.println("terminator1 " + terminator1);
		System.out.println("terminator2 " + terminator2);
		System.out.println("terminator3 " + terminator3);

		terminator1.action();
		terminator2.action();
		terminator3.action();
	}
}
