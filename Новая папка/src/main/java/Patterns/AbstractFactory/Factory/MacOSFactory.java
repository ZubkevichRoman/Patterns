package Patterns.AbstractFactory.Factory;

import Patterns.AbstractFactory.Apps.MacOSApp;
import Patterns.AbstractFactory.Model.AbstractFactory;
import Patterns.AbstractFactory.Model.App;
import Patterns.AbstractFactory.Model.Widget;
import Patterns.AbstractFactory.Widgets.MacOSWidgets;

public class MacOSFactory implements AbstractFactory {

    @Override
    public App createApp() {
        return new MacOSApp();
    }

    @Override
    public Widget createWidget() {
        return new MacOSWidgets();
    }
}
