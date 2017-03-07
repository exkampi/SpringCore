package home.javabegin.training.spring.impls.sony;

import home.javabegin.training.spring.interfaces.Hands;

public class SonyHands implements Hands {
	
	public void catchSomething(){
		System.out.println("Catched from Sony!!");
	}

	public void init() {
		System.out.println("Init SonyHands");
	}

	public void destroy() {
		System.out.println("Destroy SonyHands");
	}

}
