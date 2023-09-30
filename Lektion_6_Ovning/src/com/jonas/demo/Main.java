package com.jonas.demo;

public class Main {

    public static void main(String[] args) {
        testDivition();

        for (int i = 0; i < 0; i++) {

        }

        if (true){{
            System.out.println("inom If-sats");
        }
    }

    public static void testDivition(){
        try {
            System.out.println(2/0);
        } catch (Exception error){
            error.printStackTrace();
        }
    }

}
