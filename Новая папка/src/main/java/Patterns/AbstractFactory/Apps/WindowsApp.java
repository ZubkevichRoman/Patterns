package Patterns.AbstractFactory.Apps;

import Patterns.AbstractFactory.Model.App;

public class WindowsApp implements App {
    @Override
    public void run() {
        System.out.println("Windows app go running");
    }
}
