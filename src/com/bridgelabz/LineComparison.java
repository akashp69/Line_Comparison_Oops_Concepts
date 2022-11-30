package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    /**
     * Using Static Keywords For calcualte lengths of two points
     */
    static double length1;
    static double length2;
    /**
     *This is Static Method Used For getting the lengths of two lines
     */
    public static void TwoLineComparison() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a1: ");
        int a1 = scanner.nextInt();
        System.out.println("Enter the value of a2: ");
        int a2 = scanner.nextInt();
        System.out.println("Enter the value of b1: ");
        int b1 = scanner.nextInt();
        System.out.println("Enter the value of b2: ");
        int b2 = scanner.nextInt();
        System.out.println("Enter the value of x1: ");
        int x1 = scanner.nextInt();
        System.out.println("Enter the value of x2: ");
        int x2 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Enter the value of y2: ");
        int y2 = scanner.nextInt();
        length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of the line1 is: " + length1);
        length2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
        System.out.println("Length of the line2 is: " + length2);
    }
    /**
     *This is Static Method Used For Comparing the lengths of two lines
     */
    public static void checkingEqualsLine() {
        if(length1==length2){
            System.out.println("Two Lines are equal");
        } else if (length1>=length2) {
            System.out.println("Line 1 length is Greater than Line 2 length ");
        }
        else
            System.out.println("Line 1 length is smaller than Line 2 length");
    }
    }
