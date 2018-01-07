package com.example.c4q.inclass0107.DifferentClasses;

/**
 * Created by c4q on 1/7/18.
 */

public class ClassDos {
    private static ClassDos instanceOfClassDos;
    private ClassDos(){

    }
    private static ClassDos getInstanceOfClassDos(){
        if(!(instanceOfClassDos==null)){
            return instanceOfClassDos;
        }
        instanceOfClassDos= new ClassDos();
        return instanceOfClassDos;
    }

}
