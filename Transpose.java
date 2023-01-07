package com.bridgelabz.ArraysProblems;

import java.util.Scanner;

public class Transpose {
        public static void main(String[] args) {
            int[][] matrix = {{1, 2, 3}, {6, 4, 5}, { 7, 8, 9}};
            Scanner scanner = new Scanner(System.in);
         //   for (int i = 0; i < 3; i++) {
           //     for (int j = 0; j < 3; j++) {
           //         System.out.print("Enter value for (" + i + "  , " + j + " ) :");
           //         matrix[i][j] = scanner.nextInt();
           //     }
           // }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("After transposing the elements are...");
            for(int i = 0;i < 3; i++)
            {
                for(int j = 0;j < 3; j++ )
                {
                    System.out.print(matrix[j][i]+" ");
                }
                System.out.println();
            }
        }
    }
