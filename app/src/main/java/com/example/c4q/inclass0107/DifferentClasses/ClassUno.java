package com.example.c4q.inclass0107.DifferentClasses;

/**
 * Created by c4q on 1/7/18.
 */

public class ClassUno {
    private static ClassUno instanceOfClassuno;

    private ClassUno() {

    }

    private static ClassUno getInstanceOfClassuno() {
        if (instanceOfClassuno != null) {
            return instanceOfClassuno;

        }
        instanceOfClassuno = new ClassUno();
        return instanceOfClassuno;
    }
}
