package com.xjgv5.datetime.ejemplos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class EjemploLocalDate {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        System.out.println(fechaActual);

        fechaActual = LocalDate.of(2023, 7, 2);
        System.out.println(fechaActual);
        
        fechaActual = LocalDate.of(2023, Month.DECEMBER, 20);
        System.out.println("fechaActual = " + fechaActual);
        
        fechaActual = LocalDate.parse("2020-02-01");
        System.out.println("fechaActual = " + fechaActual);

        LocalDate diaDeManana = LocalDate.now().plusDays(1);
        System.out.println("diaDeManana = " + diaDeManana);
        
        LocalDate mesAnterior = LocalDate.now().minusMonths(1);
        System.out.println("mesAnterior = " + mesAnterior);

        DayOfWeek lunes = LocalDate.parse("2023-11-11").getDayOfWeek();
        System.out.println("lunes = " + lunes);
    }
}
