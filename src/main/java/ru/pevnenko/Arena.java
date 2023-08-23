package ru.pevnenko;

import javax.swing.*;
import java.awt.*;

import static ru.pevnenko.LogicFruit.*;

public class Arena {

    /**
     * Метод для отрисовки поля игры и все, что связано с полем
     */
    public void drawMap() {
        class DrawCircle extends JPanel {
            @Override
            public void paintComponent(Graphics g) {
                g.drawOval((int)getPointFruit().getX(), (int)getPointFruit().getY(), 30, 30);
                g.setColor(Color.RED);
            }
        }
        DrawCircle circle = new DrawCircle();

        JFrame frame = new JFrame(HelperClass.getProperty("nameProject"));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(Integer.parseInt(HelperClass.getProperty("width")),Integer.parseInt(HelperClass.getProperty("height")));
        frame.getContentPane().add(BorderLayout.CENTER, circle);
        frame.setVisible(Boolean.TRUE);

    }
}
