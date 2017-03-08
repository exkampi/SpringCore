package home.javabegin.training.spring.impls.robot;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class ActionReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        System.err.println("Kill all humans!!!");
        return null;
    }
}
