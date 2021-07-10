package com.hp.test;

public class aa {

    private static aa ourInstance = new aa();

    public static aa getInstance() {
        return ourInstance;
    }

    private aa() {
    }
}
