package home.javabegin.training.spring.impls.conveyor;

import home.javabegin.training.spring.interfaces.Robot;
import home.javabegin.training.spring.interfaces.RobotConveyor;

public abstract class T1000Conveyor implements RobotConveyor {

    @Override
    public abstract Robot createRobot();
}
