package com.example.c4q.inclass0107.DifferentClasses;

/**
 * Created by c4q on 1/7/18.
 */

public class ClassCinco {
    private static ClassCinco instanceOfClassCinco;
    private ClassCinco(){

    }
    public static ClassCinco getInstanceOfClassCinco(){
        if (instanceOfClassCinco!=null){
            return instanceOfClassCinco;

        }
        instanceOfClassCinco=new ClassCinco();
        return instanceOfClassCinco;
    }
}
