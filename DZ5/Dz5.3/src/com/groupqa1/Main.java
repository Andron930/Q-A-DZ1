package com.groupqa1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the length of random array: ");
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] first = arrayFirst(len);
        int[] second = arraySecond(len);
        int[] third = arrayThird(len, first, second);
        int i = 0;
        System.out.println("First array: " + Arrays.toString(first));
        System.out.println("Second array: " + Arrays.toString(second));
        System.out.print("Third array: " + Arrays.toString(third));
    }
    public static int[] arrayFirst(int len) {
        int[] first = new int[len];

        for (int i = 0; i < first.length; i++) {
            first[i] = (int) (Math.random() * 30) - 15;
        }
        return first;
    }
    public static int[] arraySecond(int len) {
        int[] second = new int[len];

        for (int i = 0; i < second.length; i++) {
            second[i] = (int) (Math.random() * 30) - 15;
        }
        return second;
    }
    public static int[] arrayThird(int len, int[] first, int[] second) {
        int[] third = new int[len];
        for(int i = 0; i < third.length; i++){
            third[i] = first[i] + second[i];
        }
        return third;
    }
}
