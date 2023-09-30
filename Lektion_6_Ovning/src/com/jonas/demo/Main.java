package com.jonas.demo;

public class Main {

    public static void main(String[] args) {
        testDivition();


        try {
            for (int i = 0; i < 0; i++) {

            }

            int i = 0;
            if (i < 5) {
                i++;
                System.out.println("inom If-sats");
                (());
                                        
            }
        } catch (Exception error) {
            error.printStackTrace();
        }


    }

    public static void testDivition() {
        try {
            System.out.println(2 / 0);
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

}
