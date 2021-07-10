package com.hp.test;

public class AA {

    private static AA ourInstance = new AA();

    public static AA getInstance() {
        return ourInstance;
    }

    private AA() {
    }
}
