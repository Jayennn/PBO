package MODUL_3.PRIME_NUMS;

public class WhileLoopExamples {
  public static void main(String[] args) {
    System.out.println("Example While Loop");

    int max = 1000;
    int current = 1;
    int checker = 2;
    while (current < max) {

      if (current < 2) {
        current++;
      }

      if (checker > Math.sqrt(current)) {
        checker = 2;
        System.out.print(current + " ");
        current++;
      } else if (current % checker == 0) {
        current++;
      } else {
        checker++;
      }
    }

  }
}
