package com.example.c4q.inclass0107.builders;

/**
 * Created by c4q on 1/7/18.
 */

public class CarParts {
    private String parts;

    public CarParts(String parts) {
        this.parts = parts;
    }

    public String getParts() {
        return parts;
    }

    public static class CarPartsBuilder {
        private String parts;

        private CarPartsBuilder() {
        }

        public CarPartsBuilder setParts(String parts) {
            this.parts = parts;
            return this;
        }

    }
}
