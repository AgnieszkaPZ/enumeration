package com.agnieszka;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        DaysOfTheWeek weekDay = DaysOfTheWeek.TUES;
        System.out.println(weekDay);

        System.out.printf("Name is %s", weekDay.name());
        System.out.println();
        System.out.printf("Order number = %d%n", weekDay.ordinal());
    }

    public static DaysOfTheWeek randomDay(){
        int randomNumber  = new Random().nextInt(7);

        DaysOfTheWeek allDays[] = DaysOfTheWeek.values();

        return allDays[randomNumber];
    }
}
