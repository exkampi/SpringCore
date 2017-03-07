package home.javabegin.training.spring.impls.robot;

import home.javabegin.training.spring.interfaces.Hands;
import home.javabegin.training.spring.interfaces.Head;
import home.javabegin.training.spring.interfaces.Legs;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ModelT800 extends BaseModel implements InitializingBean, DisposableBean{

    private String color;
    private int year;
    private boolean soundEnabled;

    public ModelT800() {
    }

    public ModelT800(Hands hands, Legs legs, Head head) {
        super(hands, legs, head);
    }

    public ModelT800(String color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public ModelT800(Hands hands, Legs legs, Head head, String color, int year, boolean soundEnabled) {

        super(hands, legs, head);
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    @Override
    public void action() {
        getHead().calc();
        getHands().catchSomething();
        getLegs().go();
        System.out.println("color: " + color);
        System.out.println("year: " + year);
        System.out.println("can play sound: " + soundEnabled);
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
