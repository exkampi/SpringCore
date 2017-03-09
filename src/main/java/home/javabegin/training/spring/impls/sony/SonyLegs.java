package home.javabegin.training.spring.impls.sony;

import home.javabegin.training.spring.interfaces.Legs;
import org.springframework.stereotype.Component;

@Component
public class SonyLegs implements Legs {
	
	public void go(){
		System.out.println("Go to Sony!");
	}

	public void init() {
		System.out.println("Init SonyLegs");
	}

	public void destroy() {
		System.out.println("Destroy SonyLegs");
	}
}
