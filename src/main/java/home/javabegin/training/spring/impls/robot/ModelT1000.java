package home.javabegin.training.spring.impls.robot;

import home.javabegin.training.spring.interfaces.Hands;
import home.javabegin.training.spring.interfaces.Head;
import home.javabegin.training.spring.interfaces.Legs;
import home.javabegin.training.spring.interfaces.Robot;

public class ModelT1000 implements Robot {

	private Hands hands;
	private Legs legs;
	private Head head;

	private String color;
	private int year;
	private boolean soundEnable;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isSoundEnable() {
		return soundEnable;
	}

	public void setSoundEnable(boolean soundEnable) {
		this.soundEnable = soundEnable;
	}

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

	public ModelT1000(String color, int year, boolean soundEnable) {
		this.color = color;
		this.year = year;
		this.soundEnable = soundEnable;
	}

	public ModelT1000(Hands hands, Legs legs, Head head, String color, int year, boolean soundEnable) {
		this.hands = hands;
		this.legs = legs;
		this.head = head;
		this.color = color;
		this.year = year;
		this.soundEnable = soundEnable;
	}

	@Override
	public void action() {
		head.calc();
		hands.catchSomething();
		legs.go();
		System.out.println("color: " + color);
		System.out.println("year: " + year);
		System.out.println("can play sound: " + soundEnable);
	}

	@Override
	public void dance() {
		System.out.println("T1000 is dancing!");
	}

}
