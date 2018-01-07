package com.example.c4q.inclass0107.enumClasses;

/**
 * Created by c4q on 1/7/18.
 */

public enum ColorsOfTheRainbow {
    RED("red"),
    GREEN("green"),
    YELLOW("yellow"),
    ORANGE("orange"),
    BLUE("blue"),
    PURPLE("purple"),
    VIOLET("violet")
    ;

    private String text;

   private ColorsOfTheRainbow(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "ColorsOfTheRainbow{" +
                "text='" + text + '\'' +
                '}';
    }
}
