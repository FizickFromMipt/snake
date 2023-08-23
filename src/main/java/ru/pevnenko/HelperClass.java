package ru.pevnenko;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HelperClass {
    private static FileInputStream fis;
    private static Properties property = new Properties();

    public static String getProperty(String propertyName) {
        try {
            fis = new FileInputStream("src/main/resources/application.properties");
            property.load(fis);

            return property.getProperty(propertyName);

        } catch (IOException e) {
            return "Файл свойств отстуствует";
        }
    }

}
