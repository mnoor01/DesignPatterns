package com.example.c4q.inclass0107.enumClasses;

/**
 * Created by c4q on 1/7/18.
 */

public enum DeckOfCards {
    ACE("big card"),
    KING("king of word"),
    QUEEN("queen of cards"),
    JACK("jack of cards"),
    ONE("one"),
    TWO("two"),
    THREE("three"),
    FOUR("four"),
    FIVE("FIVE"),
    SIX("six"),
    SEVEN("seven"),
    EIGHT("eight"),
    NINE("nine"),
    TEN("ten");



    private String text;
private DeckOfCards(String text){
    this.text=text;
}

    @Override
    public String toString() {
        return "DeckOfCards{" +
                "text='" + text + '\'' +
                '}';
    }
}
