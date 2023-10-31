package org.example;

import org.example.Pacadge.*;

public class Main {
    public static void main(String[] args) {
        Task_values_.DayOfWeek[] days = Task_values_.DayOfWeek.values();
        for (Task_values_.DayOfWeek s : days){
            System.out.printf("%s", s); // Вывод всех полей перечесления
        }
        Task_ordinal_.DayOfWeeker current = Task_ordinal_.DayOfWeeker.FRIDAY;
        System.out.println(current);
        System.out.println(current.ordinal()); //Возвращает индекс элемента
        System.out.println(Task_class_.Color.Red.getCod());//Через конструктор передается значение пользовательского поля
        System.out.println(Task_class_.Color.Green.getCod());//Через конструктор передается значение пользовательского поля

        Task_class_.Color[] pound = Task_class_.Color.values();
        for (Task_class_.Color d : pound){
            System.out.printf(d.getCod()); // Вывод всех полей перечесления

        }

        Task_internal_class orange = new Task_internal_class();// Вывод внутрениго класса
        Task_internal_class.Juice juice = orange.new Juice();
        orange.squuzeJuice();
        juice.flow();

        Task_internal_class_two peugeot = new Task_internal_class_two("Peugeot", 120,40);
//        // Мы создали объект велосипеда. Создали два его «подобъекта» — руль и сиденье.
//        Подняли сиденье повыше для удобства — и поехали: катимся и рулим, куда надо! :)
//        Нужные нам методы вызываются у нужных объектов. Все просто и удобно.
        Task_internal_class_two.HandleBar handleBar = peugeot.new HandleBar();
        Task_internal_class_two.Seat seat = peugeot.new Seat();

        seat.up();
        peugeot.start();
        handleBar.left();
        handleBar.right();
        seat.getSeatParam();
    }
}