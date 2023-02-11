package com.agnieszka;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        DaysOfTheWeek weekDay = DaysOfTheWeek.TUES;
        System.out.println(weekDay);

        //System.out.println();
        //System.out.printf("Order number = %d%n", weekDay.ordinal());

        for (int i =0 ; i < 10; i++){
            weekDay = randomDay();
            System.out.printf("Name is %s, Order number = %d%n", weekDay.name(), weekDay.ordinal());

            if(weekDay == weekDay.FRI){
                System.out.println("Friday found !!!");
            }

        }

    }

    public static DaysOfTheWeek randomDay(){
        int randomNumber  = new Random().nextInt(7);

        DaysOfTheWeek allDays[] = DaysOfTheWeek.values();

        return allDays[randomNumber];
    }
}
