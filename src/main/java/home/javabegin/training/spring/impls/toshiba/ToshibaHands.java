package home.javabegin.training.spring.impls.toshiba;

import home.javabegin.training.spring.interfaces.Hands;

public class ToshibaHands implements Hands {
	
	public void catchSomething(){
		System.out.println("Catched from Toshiba!");
	}

	public void init() {
		System.out.println("Init ToshibaHands");
	}

	public void destroy() {
		System.out.println("Destroy ToshibaHands");
	}
}
