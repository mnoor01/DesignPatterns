package com.example.c4q.inclass0107.DifferentClasses;

/**
 * Created by c4q on 1/7/18.
 */

public class ClassQuatro {
    private static ClassQuatro instanceOfClassQuatro;

    private ClassQuatro() {

    }

    private static ClassQuatro getInstanceOfClassQuatro() {
        if (!(instanceOfClassQuatro == null)){
            return instanceOfClassQuatro;
        }
        instanceOfClassQuatro=new ClassQuatro();
        return instanceOfClassQuatro;
    }
}
