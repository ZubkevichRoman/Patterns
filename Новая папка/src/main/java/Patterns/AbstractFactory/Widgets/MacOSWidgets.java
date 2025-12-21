package Patterns.AbstractFactory.Widgets;

import Patterns.AbstractFactory.Model.Widget;

public class MacOSWidgets implements Widget {
    @Override
    public void run() {
        System.out.println("MacOS widget go running");
    }

}
