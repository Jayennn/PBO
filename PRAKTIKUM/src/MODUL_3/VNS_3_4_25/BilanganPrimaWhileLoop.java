package MODUL_3.VNS_3_4_25;

import static java.lang.Math.sqrt;

public class BilanganPrimaWhileLoop {

  public static void main(String[] args) {

    int x = 2;
    System.out.println("Bilangan prima dari 1 hingga 1000:");

    while (x <= 1000) {
      boolean prima = true;
      int i = 2;

      while (i <= sqrt(x)) {
        if (x % i == 0) {
          prima = false;
          break;
        }
        i++;
      }

      if (prima) {
        System.out.print(x + " ");
      }

      x++;

    }

  }

}