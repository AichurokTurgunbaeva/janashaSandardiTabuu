package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random run = new Random();
        int[] numbers = new int[6];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = run.nextInt(5);
            System.out.print(numbers[i] + " ");
        }
        boolean x = false;
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                System.out.println("\nyes :"+numbers[i+1]);
                x = true;
                break;
            }

        }if(x == false) {
            System.out.println("\nNo");
        }
    }
}
