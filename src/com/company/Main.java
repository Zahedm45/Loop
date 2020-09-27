package com.company;

public class Main {

    public static void main(String[] args) {


        // Counts from 0 to 100
        int count = 0;
        while (count <= 100) {
            System.out.println(count);

            count++;


        }

        // All the numbers that are dividible by 2.
        System.out.println("Numbers that are dividible by 2:");

        int count2 = 0;
        while (count2 <= 100) {

            count2++;

            if (count2 % 2 == 0) {
                System.out.println(count2);
            }
        }

        // Sum of all numbers from 1 to 100.
        System.out.println("Sum of all the numbers from 1 to 100.");

        int count3 = 0;
        int count4 = 0;

        while (count3<=100){
            count4 = count4 + count3;
            count3++;
        }

        System.out.println(count4);

    }
}
