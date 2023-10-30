package org.example;

import org.example.Pacadge.Task1;
import org.example.Pacadge.Task_class_;
import org.example.Pacadge.Task_ordinal_;
import org.example.Pacadge.Task_values_;

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
}}