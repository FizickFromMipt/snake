package ru.pevnenko;

import java.awt.*;

public class LogicFruit {

    public static Point getPointFruit() {
        return new Point((int) (Math.random()*Integer.parseInt(HelperClass.getProperty("width"))), (int) (Math.random()*Integer.parseInt(HelperClass.getProperty("height"))));
    }
}
