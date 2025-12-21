package Patterns.AbstractFactory;

import Patterns.AbstractFactory.Factory.MacOSFactory;
import Patterns.AbstractFactory.Factory.WindowsFactory;
import Patterns.AbstractFactory.Model.AbstractFactory;
import Patterns.AbstractFactory.Utils.Application;

public class main {
    public static void main(String[] args) {
        String requestParam = "Windows";
        AbstractFactory factory;
        if (requestParam.equals("Mac")) {
            factory = new MacOSFactory();
        } else if (requestParam.equals("Windows")) {
            factory = new WindowsFactory();
        } else {
            throw new IllegalArgumentException("Unknown request parameter: " + requestParam);
        }
        Application application = new Application(factory);
        application.paint();

    }
}


