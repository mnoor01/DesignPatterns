package com.example.c4q.inclass0107.builders;

/**
 * Created by c4q on 1/7/18.
 */

public class ThanksGivingParty {
    private String sides;

    public ThanksGivingParty(String sides) {
        this.sides = sides;
    }

    public String getSides() {
        return sides;
    }
    public static class ThanksGivingPartyBuilder{
        private String sides;
        public ThanksGivingPartyBuilder(){

        }
        public ThanksGivingPartyBuilder setSides(String sides){
            this.sides=sides;
            return this;
        }
        public ThanksGivingParty builder(){
            return new ThanksGivingParty(sides);
        }
    }
}
