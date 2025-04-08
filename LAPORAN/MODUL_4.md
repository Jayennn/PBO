# Pemrograman Berorientasi Objek

## Praktikum Modul 4

**Disusun oleh:**  
**Nama:** Gian Alharitz Ueldy Secondri  
**NIM:** 11241033

---

### Tugas dan Deskripsi Singkat

1. Buatlah program Java sederhana yang dapat menghitung perkalian dan pengurangan
   antara matriks X dan Y yang memiliki ordo 2x2. Gunakan switch-case dalam pemilihan
   perkalian dan pengurangan matriks.

---

## Pembahasan

#### `MatrixMultiplication.java`

```java
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
```
