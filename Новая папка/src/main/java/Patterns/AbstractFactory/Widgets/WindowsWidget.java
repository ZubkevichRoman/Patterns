package Patterns.AbstractFactory.Widgets;

import Patterns.AbstractFactory.Model.Widget;

public class WindowsWidget implements Widget {
    @Override
    public void run() {
        System.out.println("Windows widget go running");
    }
}
