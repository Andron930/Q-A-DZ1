package com.groupqa1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of random array: ");
        int len = input.nextInt();
        int[] arr = array(len);
        int[] negative = new int[arr.length];
        int[] positive = new int[arr.length];
        boolean positiveNum = true;
        int counterNegative = 0;
        int counterPositive = 0;


        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                positiveNum = true;
                positive[counterPositive++] = arr[i];
            }
            else{
                negative[counterNegative++] = arr[i];
            }
        }
        System.out.print("Your array: " + Arrays.toString(arr));
        System.out.print("\nPositive array: ");
        for (int i = 0; i < positive.length & positive[i] != 0; i++) {
            System.out.print(positive[i] + " ");
        }
        System.out.print("\nNegative array: ");
        for (int i = 0; i < negative.length & negative[i] != 0; i++) {
            System.out.print(negative[i] + " ");
        }
    }
    static int[] array (int len){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 40) - 20;
        }
        return arr;
    }
}
