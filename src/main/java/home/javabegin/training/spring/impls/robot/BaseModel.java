package home.javabegin.training.spring.impls.robot;

import home.javabegin.training.spring.interfaces.Hands;
import home.javabegin.training.spring.interfaces.Head;
import home.javabegin.training.spring.interfaces.Legs;
import home.javabegin.training.spring.interfaces.Robot;

public abstract class BaseModel implements Robot {

    private Hands hands;
    private Legs legs;
    private Head head;

    public BaseModel() {
        System.out.println(this + " - BaseModel constructor");
    }

    public BaseModel(Hands hands, Legs legs, Head head) {
        this();
        this.hands = hands;
        this.legs = legs;
        this.head = head;
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
}
