package com.example.c4q.inclass0107.DifferentClasses;

/**
 * Created by c4q on 1/7/18.
 */

public class ClassTres {
    private static ClassTres instanceOfClassTres;
     private ClassTres(){

     }
     private static ClassTres getinstanceOfClassTres(){
         if(!(instanceOfClassTres==null)){
             return instanceOfClassTres;
         }
         instanceOfClassTres= new ClassTres();
         return instanceOfClassTres;
     }
}
