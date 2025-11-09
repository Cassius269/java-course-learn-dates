package com.fahami.cda;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Date date = new Date(1762704343003l);
        IO.println(date);

        Calendar currentDate = Calendar.getInstance();
        IO.println(currentDate.getTime());
        currentDate.set(currentDate.YEAR,  2022);// changer l'année
        currentDate.set(currentDate.HOUR_OF_DAY, 00); // changer l'heure de la journée
        IO.println(currentDate.getTime());
    }
}