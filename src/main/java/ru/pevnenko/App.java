package ru.pevnenko;

public class App {
    public static void main(String[] args) {
        //Создали арену для змейки
        Arena arena = new Arena();

        while (Boolean.TRUE.equals(HelperClass.getStart())){
            System.out.println("game start");
        }
    }
}
