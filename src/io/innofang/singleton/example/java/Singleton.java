package io.innofang.singleton.example.java;

/**
 * Created by InnF on 2017/2/18.
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }

}
