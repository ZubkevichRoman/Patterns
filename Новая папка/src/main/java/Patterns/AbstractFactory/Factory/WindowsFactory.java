package Patterns.AbstractFactory.Factory;

import Patterns.AbstractFactory.Apps.WindowsApp;
import Patterns.AbstractFactory.Model.AbstractFactory;
import Patterns.AbstractFactory.Model.App;
import Patterns.AbstractFactory.Model.Widget;
import Patterns.AbstractFactory.Widgets.WindowsWidget;

public class WindowsFactory implements AbstractFactory {

    @Override
    public App createApp() {
        return new WindowsApp();
    }

    @Override
    public Widget createWidget() {
        return new WindowsWidget();
    }
}
