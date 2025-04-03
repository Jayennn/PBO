package MODUL_3.VNS_3_4_25;

import static java.lang.Math.sqrt;

public class BilanganPrimaDoWhile {

  public static void main(String[] args) {

    int max = 1000;
    int current = 1;
    int checker = 2;
    do {

      if (current < 2) {
        current++;
      }

      if (checker > sqrt(current)) {
        checker = 2;
        System.out.print(current + " ");
        current++;
      } else if (current % checker == 0) {
        current++;
      } else {
        checker++;
      }

    } while (current < max);
  }

}