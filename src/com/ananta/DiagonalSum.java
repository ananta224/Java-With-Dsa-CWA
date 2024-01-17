package com.ananta;

public class DiagonalSum {
    public static int diagonalSum(int[][] matrics){
        int sum=0;
        for(int i=0;i<matrics[0].length;i++){
            //Primary Diagonal
            sum+=matrics[i][i];
            //Secondary Diagonal
            if(i!=matrics[0].length-1-i)//i!=j    i+j=n-1    j=n-1-i j=matrics[0].length-1-i
                sum+=matrics[i][matrics.length-i-1];
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrics[][] = { { 8, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(diagonalSum(matrics));
    }
}
