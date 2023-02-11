package com.agnieszka;

public enum Topping {
    MUSTARD,
    CHEDDAR,
    TOMATO,
    BACON,
    PICKLES;


    public double getPrice(){
        switch (this){
            case MUSTARD:
                return 0.5;
            case BACON:
                return 1;
            case TOMATO:
                return 0.2;
            default:
                return 0.0;
        }
    }
}
