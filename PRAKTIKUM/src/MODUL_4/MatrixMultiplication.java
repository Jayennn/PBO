package MODUL_4;

import java.util.Scanner;

public class MatrixMultiplication {

  public static void main(String[] args) {
    int[][] matrixX = {
        { 1, 2 },
        { 3, 4 },
    };

    int[][] matrixY = {
        { 1, 2 },
        { 3, 4 },
    };

    System.err.print("Enter the operation you want to perform (multiply/subtraction): ");
    Scanner input = new Scanner(System.in);

    switch (input.nextLine()) {
      case "multiply":
        int[][] resultMultiply = new int[matrixX.length][matrixY.length];
        for (int i = 0; i < matrixX.length; i++) {
          for (int j = 0; j < matrixY[i].length; j++) {
            for (int k = 0; k < matrixX[i].length; k++) {
              resultMultiply[i][j] += matrixX[i][k] * matrixY[k][j];
            }
          }
        }
        System.out.println("Result of multiplication:");
        for (int i = 0; i < resultMultiply.length; i++) {
          for (int j = 0; j < resultMultiply[i].length; j++) {
            System.out.print(resultMultiply[i][j] + " ");
          }
          System.out.println();
        }
        break;

      case "subtraction":
        int[][] resultSubstraction = new int[matrixX.length][matrixY.length];
        for (int i = 0; i < matrixX.length; i++) {
          for (int j = 0; j < matrixY[i].length; j++) {
            resultSubstraction[i][j] = matrixX[i][j] - matrixY[i][j];
          }
        }
        System.out.println("Result of subtraction:");
        for (int i = 0; i < resultSubstraction.length; i++) {
          for (int j = 0; j < resultSubstraction[i].length; j++) {
            System.out.print(resultSubstraction[i][j] + " ");
          }
          System.out.println();
        }
    }

    input.close();
  }
}
