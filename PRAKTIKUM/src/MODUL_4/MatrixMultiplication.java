package MODUL_4;

public class MatrixMultiplication {
  public static void main(String[] args) {
    int[][] matrixA = {
      {1, 2},
      {3, 4},
    };

    int[][] matrixB = {
      {1, 2},
      {3, 4}, 
    };
    
 
    int result[][] = new int[matrixA.length][matrixB.length];


    for(int i = 0; i < matrixA.length; i++){
      for(int j = 0; j < matrixA[i].length; j++){

        for(int k = 0; k < matrixA[i].length; k++){

          result[i][j] += matrixA[i][k] * matrixB[k][j];
          
        }
        System.out.print(result[i][j] + " ");
      }
      System.out.println();
    }


  }
}
