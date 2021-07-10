package com.hp.test;

public class AAA {
    public static void main(String[] args) {
        AA AA1 = AA.getInstance();
        AA AA2 = AA.getInstance();
        System.out.println(AA1==AA2);
    }
}
