package com.example.c4q.inclass0107.enumClasses;

/**
 * Created by c4q on 1/7/18.
 */

public enum PhasesOfTheMoon {
    FULL_MOON("full moon"),
    NEW_MOON("new Moon"),
    HALF_MOON("half moon")

    ;
    private String text;

    private PhasesOfTheMoon(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "PhasesOfTheMoon{" +
                "text='" + text + '\'' +
                '}';
    }
}
