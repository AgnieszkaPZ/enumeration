package com.agnieszka;

import java.util.Locale;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        DaysOfTheWeek weekDay = DaysOfTheWeek.TUES;
        System.out.println(weekDay);

        //System.out.println();
        //System.out.printf("Order number = %d%n", weekDay.ordinal());

        for (int i =0 ; i < 10; i++) {
            weekDay = randomDay();
           // System.out.printf("Name is %s, Order number = %d%n", weekDay.name(), weekDay.ordinal());

            //if (weekDay == weekDay.FRI) {
            //    System.out.println("Friday found !!!");
            //}*/

            switchDayOfWeek(weekDay);
        }

        System.out.println("===============================================");

        for (Topping toppingType: Topping.values()) {
            System.out.println(toppingType.name() + ": " + toppingType.getPrice());
        }

    }

    public static DaysOfTheWeek randomDay(){
        int randomNumber  = new Random().nextInt(7);

        DaysOfTheWeek allDays[] = DaysOfTheWeek.values();

        return allDays[randomNumber];
    }

    public static void switchDayOfWeek(DaysOfTheWeek weekDay){
        int weekDayInteger = weekDay.ordinal() + 1;

        switch (weekDay){
            case WED:
                System.out.println("Wednesday is day:" + weekDayInteger );
            case SAT:
                System.out.println("Saturday is day:" + weekDayInteger);
            default:
                System.out.println(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() + "day is day:" + weekDayInteger);

        }
    }
}
