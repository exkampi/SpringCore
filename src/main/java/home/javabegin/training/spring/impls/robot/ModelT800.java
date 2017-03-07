package home.javabegin.training.spring.impls.robot;

import home.javabegin.training.spring.interfaces.Hands;
import home.javabegin.training.spring.interfaces.Head;
import home.javabegin.training.spring.interfaces.Legs;
import home.javabegin.training.spring.interfaces.Robot;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ModelT800 implements Robot, InitializingBean, DisposableBean{

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

    public ModelT800() {
    }

    public ModelT800(Hands hands, Legs legs, Head head) {

        this.hands = hands;
        this.legs = legs;
        this.head = head;
    }

    @Override
    public void action() {
        hands.catchSomething();
        legs.go();
        head.calc();
    }

    @Override
    public void dance() {
        System.out.println("T800 is dancing!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("T800 destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("T800 afterPropertiesSet");
    }
}
