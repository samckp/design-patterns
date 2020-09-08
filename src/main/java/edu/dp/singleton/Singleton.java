package edu.dp.singleton;

public class Singleton {

    private static Singleton singleton;

    //Constructor
    private Singleton(){
        // prevent to instantiate using Reflection
        if(singleton!=null){
            throw new IllegalStateException("Already Initialized !!");
        }
    }

    public static Singleton getInstance(){

        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }
}
