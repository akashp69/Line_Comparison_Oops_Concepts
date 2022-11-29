package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    /**
     * This Static Method is Used For Calculate the length
     */
    public static void LineComparision() {
        Scanner scanner = new Scanner(System.in);
    /**
    *Using x1,x2,y1 and y2 variables for calulate the length of line
    */
        System.out.println("Enter the value of x1: ");
        int x1 = scanner.nextInt();
        System.out.println("Enter the value of x2: ");
        int x2 = scanner.nextInt();
        System.out.println("Enter the value of y1: ");
        int y1 = scanner.nextInt();
        System.out.println("Enter the value of y2: ");
        int y2 = scanner.nextInt();
        double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of the line is: " + length1);
    }
    /**
     * This Main Method is Used For Calling the Method Line Comaprison
     */
    public static void main(String[] args) {
        LineComparision();
    }
}
