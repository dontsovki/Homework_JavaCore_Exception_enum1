package org.example;

import org.example.Pacadge.Task1;

public class Main {
    public static void main(String[] args) {
        Task1.DayOfWeek[] days = Task1.DayOfWeek.values();
        for (Task1.DayOfWeek s : days){
            System.out.printf("%s", s);
    }
}}