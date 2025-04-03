package MODUL_3.PRIME_NUMS;

public class ForLoopExamples {
  public static void main(String[] args) {
    System.out.println("Example For Loop");
    int max = 1000;
    for (int i = 1; i <= max; i++) {
      boolean isPrime = true;

      for (int j = 2; j <= Math.sqrt(i); j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }

      if (isPrime && i > 1) {
        System.out.print(i + " ");
      }
    }
  }
}
