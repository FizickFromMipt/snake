package ru.pevnenko;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Logger;

//TODO Стукрутироваить класс - вынести все, что отвечает за меню в отдельный класс
public class Arena extends JFrame{


    /**
     * Метод для отрисовки поля игры и все, что связано с полем
     */
    public Arena() {
        Gamer gamer = new Gamer();

        //Добавить фрукт
        ImageIcon fruit = new ImageIcon(HelperClass.getProperty("fruitPath"));

        JFrame frame = new JFrame(HelperClass.getProperty("nameProject"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(Integer.parseInt(HelperClass.getProperty("width")),Integer.parseInt(HelperClass.getProperty("height")));

        //Создание панели меню
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu(HelperClass.getProperty("menuFile"));
        JMenu menuHelp = new JMenu(HelperClass.getProperty("menuHelp"));
        JMenu menuAbout = new JMenu(HelperClass.getProperty("menuAbout"));
        //Добавление в панель меню кнопок
        menuBar.add(menuFile);
        menuBar.add(menuHelp);
        menuBar.add(menuAbout);

        // TODO - Добавить раздели в кнопки меню
        JMenuItem menuItemAboutAuthor = new JMenuItem(HelperClass.getProperty("author"));
        JMenuItem menuItemAboutGame = new JMenuItem(HelperClass.getProperty("game"));
        menuAbout.add(menuItemAboutAuthor);
        menuAbout.add(menuItemAboutGame);

        //Все слои приложения
        JPanel sysPanel = new JPanel();
        JPanel panelSnake = new JPanel();

        JLabel aboutGamer = new JLabel(HelperClass.getProperty("aboutGamer"));
        //Создание области для ввода ника игрока (Максимум 20 символов)
        JTextField nameGamer = new JTextField(20);
        JButton startButton = new JButton(HelperClass.getProperty("start"));
        startButton.addActionListener(action -> {
            gamer.setNameGamer(nameGamer.getText());
            sysPanel.removeAll();
            sysPanel.revalidate();
            panelSnake.removeAll();
            panelSnake.revalidate();
            //Начало игры при нажатии кнопки старт
            HelperClass.setStart(Boolean.TRUE);
            // TODO - Возможно стоит добавить логировании
            // для дебага - System.out.println(gamer.getNameGamer());
        });
        sysPanel.add(aboutGamer);
        sysPanel.add(nameGamer);
        sysPanel.add(startButton);

        //Панель для картинки по центру
        ImageIcon logo = new ImageIcon(HelperClass.getProperty("logoPath"));
        panelSnake.add(new JLabel(logo));

        frame.getContentPane().add(BorderLayout.SOUTH, sysPanel);
        frame.getContentPane().add(BorderLayout.NORTH,menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, panelSnake);

        frame.setVisible(Boolean.TRUE);
    }
}
