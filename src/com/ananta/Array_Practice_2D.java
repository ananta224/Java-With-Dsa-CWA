package com.ananta;

public class Array_Practice_2D {
    //Solution 1
    public static void count7s(int[][] matrix){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println("Count 7s is : "+count);
    }
    //Solution 2
    public static void Sum2Row(int matrix[][]){
        int sum=0;
            for (int j=0;j<matrix[0].length;j++){
                sum+=matrix[1][j];
        }
        System.out.println(sum);
    }
    //Solution 3
    public static void transposeMatrix(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;
        int transpose[][] = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        printMatrix(transpose);
    }

    //Printing 2D Array
    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        int matix[][] = {{ 1,2,3 },
                          { 4,5,6 }};
        transposeMatrix(matix);
    }
}
