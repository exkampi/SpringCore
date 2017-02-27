package home.javabegin.training.spring.impls.robot;

import home.javabegin.training.spring.interfaces.Hands;
import home.javabegin.training.spring.interfaces.Head;
import home.javabegin.training.spring.interfaces.Legs;
import home.javabegin.training.spring.interfaces.Robot;

public class ModelT1000 implements Robot {

	private Hands hands;
	private Legs legs;
	private Head head;

    public Hands getHands() {
        return hands;
    }

    public void setHands(Hands hands) {
        this.hands = hands;
    }

    public Legs getLegs() {
        return legs;
    }

    public void setLegs(Legs legs) {
        this.legs = legs;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public ModelT1000() {
	}

	public ModelT1000(Hands hands, Legs legs, Head head) {
		super();
		this.hands = hands;
		this.legs = legs;
		this.head = head;
	}

	@Override
	public void action() {
		head.calc();
		hands.catchSomething();
		legs.go();
	}

	@Override
	public void dance() {
		System.out.println("T1000 is dancing!");
	}

}
