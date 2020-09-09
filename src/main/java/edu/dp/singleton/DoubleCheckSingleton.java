package edu.dp.singleton;

public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton instance;

    private DoubleCheckSingleton(){

        if(instance!=null){
            throw new IllegalStateException("Already Initalized !!");
        }
    }

    public static DoubleCheckSingleton getInstance(){

        DoubleCheckSingleton result = instance; // if it is already initialized then return same

        if (result==null){

            synchronized (DoubleCheckSingleton.class){

                // Again assign the instance to local variable to check if it was initialized by some other thread
                // while current thread was blocked to enter the locked zone. If it was initialized then we can
                // return the previously created instance
                result=instance;

                if (result==null){

                    // The instance is still not initialized so we can safely create new instance
                    instance = result = new DoubleCheckSingleton();
                }
            }
        }
        return result;
    }
}
