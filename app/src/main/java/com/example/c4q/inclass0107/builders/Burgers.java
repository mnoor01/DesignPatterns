package com.example.c4q.inclass0107.builders;

/**
 * Created by c4q on 1/7/18.
 */

public class Burgers {
    private String toppings;
    private String cheese;
    private String bun;

    private Burgers(String toppings, String cheese, String bun) {
        this.toppings = toppings;
        this.cheese = cheese;
        this.bun = bun;
    }

    public String getToppings() {
        return toppings;
    }

    public String getCheese() {
        return cheese;
    }

    public String getBun() {
        return bun;
    }

    public static class BurgerBuilder{
        private String toppings;
        private String cheese;
        private String bun;

        public BurgerBuilder() {
        }
        public BurgerBuilder setToppings(String toppings){
            this.toppings=toppings;
            return this;
        }
        public BurgerBuilder setCheese(String cheese){
            this.cheese=cheese;
            return this;
        }
        public BurgerBuilder setBun(String bun){
            this.bun=bun;
            return this;
        }

        public Burgers builder(){
            return new Burgers(toppings,cheese,bun);

        }
    }
}
