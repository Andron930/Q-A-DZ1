package com.groupqal;

import java.util.Scanner;

public class Main {
    private static final int MIDDLE = 20;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int i = sc.nextInt();
        switch (i) {
            case 1: {

                int row1 = 1;
                while (row1 < 10) {
                    int number1 = row1;
                    while (number1 >= 1) {
                        System.out.print("*");
                        number1--;
                    }
                    row1++;
                    System.out.println();
                }
                int w = 10;
                while (w >= 1) {
                    int number1 = w;
                    while (number1 >= 1) {
                        System.out.print("*");
                        number1--;
                    }
                    w--;
                    System.out.println();
                }
                break;
            }


            case 2: {
                int row2 = 1;
                int number2 = 10;
                while (row2 <= number2) {
                    int space = 1;
                    int column = 1;
                    while (space < row2) {
                        System.out.print(" ");
                        space++;
                    }
                    while (column <= number2 - row2 + 1) {
                        System.out.print("*");
                        column++;
                    }
                    row2++;
                    System.out.println();
                }


                break;
            }
            case 3: {
                int row2 = 1;
                int number2 = 10;
                while (row2 <= number2) {
                    int space = 9;
                    int column = 10;
                    while (space >= row2) {
                        System.out.print(" ");
                        space--;
                    }
                    while (column >= number2 - row2 + 1) {
                        System.out.print("*");
                        column--;
                    }
                    row2++;
                    System.out.println();
                }

                break;
            }
            case 4: {
                int row2 = 1;
                int number2 = 10;
                while (row2 <= number2) {
                    int space = 10;
                    int column = 10;
                    while (space >= row2) {
                        System.out.print(" ");
                        space--;
                    }
                    while (column >= number2 - row2 + 2) {
                        System.out.print("*");
                        column--;
                    }
                    row2++;
                    System.out.println();
                }
                int x = 1;
                int y = 10;
                while (x <= y) {
                    int space = 1;
                    int column = 1;
                    while (space < x) {
                        System.out.print(" ");
                        space++;
                    }
                    while (column <= y - x + 1) {
                        System.out.print("*");
                        column++;
                    }
                    x++;
                    System.out.println();
                }

                break;
            }
            case 5: {
                int a = 0;
                {
                    while (a < MIDDLE) {
                        int z = 0;
                        while (z < MIDDLE - a) {
                            System.out.print(" ");
                            z++;
                        }
                        int j = 0;
                        while (j < a * 2 + 1) {
                            System.out.print("*");
                            j++;
                        }
                        System.out.println();
                        a++;
                        int k = 0;
while (k < MIDDLE - a) {
                            System.out.print(" ");
                            k++;
                        }
                        int l = 0;
                        while (l < a * 2 + 1) {
                            System.out.print("*");
                            l++;
                        }
                        System.out.println();
                        a++;
                    }


                    break;
                }
            }
default:
	System.out.println("Invalid number!");
        }
    }
}
