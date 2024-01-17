package com.ananta;

public class Spiral_Matrix {
    public static void Spiral_matixs(int matrics[][]) {
        int startRow = 0;
        int endRow = matrics.length - 1;
        int startCol = 0;
        int endCol = matrics[0].length - 1;
        while (startCol <= endCol && startRow <= endRow) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrics[startRow][j] + " ");
            }
            // Right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrics[i][endCol] + " ");
            }
            // Button
            for (int j = endCol - 1; j >= startRow; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrics[endRow][j] + " ");
            }
            // Left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrics[i][startCol] + " ");

            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String[] args) {
        int matrics[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        Spiral_matixs(matrics);
    }
}
