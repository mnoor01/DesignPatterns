package com.example.c4q.inclass0107.enumClasses;

/**
 * Created by c4q on 1/7/18.
 */

public enum MonthsOfTheYear {
    JANUARY("January"),
    FEBURUARY("Feburuary"),
    MARCH("march"),
    APRIL("april"),
    MAY("may"),
    JUNE("june"),
    JULY("July"),
    AUGUST("august"),
    SEPTEMBER("september"),
    OCTOBER("october"),
    NOVEMBER("November"),
    DECEMBER("december")
    ;
    private String text;

    private MonthsOfTheYear(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "MonthsOfTheYear{" +
                "text='" + text + '\'' +
                '}';
    }
}
