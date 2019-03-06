package com.groupqal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Binary -> " + numStr(num));

    }
    public static String numStr(int num) {

        String a = "";
        int b;
        while(num != 0){
            b = num % 2;
            a = b + a;
            num = num / 2;
        }
        return a;
    }

}