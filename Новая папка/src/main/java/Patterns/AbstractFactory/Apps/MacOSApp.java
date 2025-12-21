package Patterns.AbstractFactory.Apps;

import Patterns.AbstractFactory.Model.App;

public class MacOSApp implements App {
    @Override
    public void run() {
        System.out.println("MacOS app go running");
    }
}
