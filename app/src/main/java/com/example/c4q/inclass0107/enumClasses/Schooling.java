package com.example.c4q.inclass0107.enumClasses;

/**
 * Created by c4q on 1/7/18.
 */

public enum Schooling {
    FIRST_GRADE("first grade"),
    SECOND_GRADE("Secong Grade"),
    THIRD_GRADE("third grade"),
    FOURTH_GRADE("fourth grade"),
    FIFTH_GRADE("fifth grade"),
    SIXTH_GRADE("sixth grade"),
    SEVENTH_GRADE("seventh grade"),
    EIGHT_GRADE("eight grade"),
    NINTH_GRADE("ninth grade"),
    TENTH_GRADE("tenth grade"),
    ELEVENTH_GRADE("elevent grade"),
    TWELVETH_GRADE("twelveth grade"),
    FIRST_YEAR_COLLEGE("first year college"),
    SECOND_YEAR_COLLEGE("second year college"),
    THIRD_YEAR_COLLEGE("third year college"),
    SENIOR_YEAR_COLLEGE("senior year college")
    ;
    private String text;

    Schooling(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Schooling{" +
                "text='" + text + '\'' +
                '}';
    }
}
