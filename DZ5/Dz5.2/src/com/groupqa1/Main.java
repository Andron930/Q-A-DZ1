package com.groupqa1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of your array: ");
        int len = input.nextInt();
        int[] arr = array(len);
        int counter = 0;

        System.out.println("Your random array: " + Arrays.toString(arr));
        System.out.println("The amount of odd numbers: " + amount(arr, len, counter));
        System.out.println("Sum of odd numbers: " + sum(arr, len, counter));
    }
    static int[] array (int len){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 40) - 20;
        }
        return arr;
    }
    public static int amount(int[] arr, int len, int counter) {
        for(int i = 0; i < len; i++) {
            if(arr[i] % 2 != 0){
                counter++;
            }
        }
        return counter;
    }
    public static int sum(int[] arr, int len, int counter) {
        for(int i = 0; i < len; i++) {
            if(arr[i] % 2 != 0){
                counter += arr[i];
            }
        }
        return counter;
    }
}
