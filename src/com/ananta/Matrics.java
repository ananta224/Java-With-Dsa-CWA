package com.ananta;

import java.util.Scanner;

public class Matrics {
    public static boolean Search(int matrix[][],int key){
        for (int i = 0;i< matrix.length;i++){
            for (int j=0;j< matrix[0].length;j++){
            if (matrix[i][j]==key){
                System.out.println("Element found at index ("+i+","+j +")");
                return true;
                }
            }
        }
        System.out.println("Element Not Found.");
        return false;
    }
    public static void main(String[] args) {
        int matrics [][]=new int[3][3];
        int n=matrics.length , m= matrics[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 9 elements :");
        for (int i = 0;i<n;i++){
            for (int j=0;j<m;j++){
            matrics[i][j]=sc.nextInt();
            }
        }
        //Output
        for (int i = 0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(matrics[i][j]+" ");
            }
            System.out.println();
        }
        //Calling The Search Function
        Search(matrics,10);
    }
}
