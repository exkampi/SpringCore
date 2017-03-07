package home.javabegin.training.spring.impls.toshiba;

import home.javabegin.training.spring.interfaces.Legs;

public class ToshibaLegs implements Legs {
	
	public void go(){
		System.out.println("Go to Toshiba!");
	}

	public void init() {
		System.out.println("Init ToshibaLegs");
	}

	public void destroy() {
		System.out.println("Destroy ToshibaLegs");
	}
}
