package com.hp.test;

public class aaa {
    public static void main(String[] args) {
        aa aa1 = aa.getInstance();
        aa aa2 = aa.getInstance();
        System.out.println(aa1==aa2);
    }
}