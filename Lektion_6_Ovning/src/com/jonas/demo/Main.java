package com.jonas.demo;

public class Main {

    public static void main(String[] args) {
        testDivition();
    }

    public static void testDivition(){
        try {
            System.out.println(2/0);
        } catch (Exception error){
            error.printStackTrace();
        }
    }

}
