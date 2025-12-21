package Patterns.AbstractFactory.Utils;

import Patterns.AbstractFactory.Model.AbstractFactory;
import Patterns.AbstractFactory.Model.App;
import Patterns.AbstractFactory.Model.Widget;

public class Application {
    private App app;
    private Widget widget;

    public Application(AbstractFactory factory) {
        app = factory.createApp();
        widget = factory.createWidget();
    }

    public void paint() {
        app.run();
        widget.run();
    }
}
