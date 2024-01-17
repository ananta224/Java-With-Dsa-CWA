package com.ananta;                           /*  Veriables and Data Types  */

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Take the fast number : ");
        double a = sc.nextDouble();
        System.out.print("Take the second number : ");
        double b = sc.nextDouble();
        System.out.print("Enter the thard number : ");
        double c = sc.nextDouble();
        double avg = (a + b + c) / 3;
        System.out.println("The average is : " + avg);
    }

}

/* import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enthe Side of the Square :");
        int side = sc.nextInt();
        double area = side*side;
        System.out.print("The area of the square is : "+area);
    }
}
 */

// Question - 3

/* public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pencil price");
        float Pencil = sc.nextFloat();
        System.out.println("Enter the pen price ");
        float Pen = sc.nextFloat();
        System.out.println("Enter the Eraser price ");
        float Eraser = sc.nextFloat();
        float total = Pencil + Pen + Eraser;
        float GST = total + ((0.18f)*total);
        System.out.println("The total is " + total);
        System.out.println("The total with GST is " + GST);
    }
}
 */

//  Q-2
//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
