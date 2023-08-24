package ru.pevnenko;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static ru.pevnenko.LogicFruit.*;

//TODO Стукрутироваить класс - вынести все, что отвечает за меню в отдельный класс
public class Arena extends JFrame{
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


        //Добавить отображение стартового лого для первого фрейма
        ImageIcon logo = new ImageIcon(HelperClass.getProperty("logoPath"));

        //Добавить фрукт
        ImageIcon fruit = new ImageIcon(HelperClass.getProperty("fruitPath"));
        JLabel fruitLabel = new JLabel(fruit);



        JButton startButton = new JButton("Start", logo);
        startButton.setVerticalTextPosition(AbstractButton.BOTTOM);
        startButton.setHorizontalTextPosition(AbstractButton.CENTER);
        startButton.setActionCommand("disable");

        JFrame startFrame = new JFrame(HelperClass.getProperty("nameProject"));
        startFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        startFrame.setSize(Integer.parseInt(HelperClass.getProperty("width")),Integer.parseInt(HelperClass.getProperty("height")));
        startFrame.add(startButton).setBounds(30,30,30,30);
        startFrame.setVisible(Boolean.TRUE);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO - добавить логику при нажати на  стартовую кнопку
                startFrame.setVisible(Boolean.FALSE);
            }
        });

    }
}
