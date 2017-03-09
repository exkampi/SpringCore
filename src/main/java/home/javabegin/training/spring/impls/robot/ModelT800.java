package home.javabegin.training.spring.impls.robot;

import home.javabegin.training.spring.interfaces.Hands;
import home.javabegin.training.spring.interfaces.Head;
import home.javabegin.training.spring.interfaces.Legs;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ModelT800 implements InitializingBean, DisposableBean{

    @Autowired
    @Qualifier("toshibaHand")
    private Hands hands;

    @Autowired
    @Qualifier("toshibaLeg")
    private Legs legs;

    @Autowired
    @Qualifier("toshibaHead")
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

    public void action() {
        head.calc();
        hands.catchSomething();
        legs.go();
    }

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
