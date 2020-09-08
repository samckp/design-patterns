package edu.dp.singleton;

public class SingletonPattern {

    public static void main(String[] args) {

        Singleton sig ;

        sig= Singleton.getInstance();
        System.out.println(sig);

        sig= Singleton.getInstance();
        System.out.println(sig);

    }
}
