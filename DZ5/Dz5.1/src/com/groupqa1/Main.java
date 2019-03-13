package com.groupqal;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the length of your array: ");
            int len = input.nextInt();
            int[] arr = array(len);
            System.out.println("Your random array: " + Arrays.toString(arr));

            System.out.print("\nArray of reversed elements: ");
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
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
