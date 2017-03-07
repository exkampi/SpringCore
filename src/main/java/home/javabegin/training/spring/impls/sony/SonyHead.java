package home.javabegin.training.spring.impls.sony;

import home.javabegin.training.spring.interfaces.Head;

public class SonyHead implements Head{
	
	public void calc(){
		System.out.println("Thinking about Sony...");
	}

	public void init() {
		System.out.println("Init SonyHead");
	}

	public void destroy() {
		System.out.println("Destroy SonyHead");
	}
}
