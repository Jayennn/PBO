package MODUL_3;

public class DoWhileLoopExamples {
  public static void main(String[] args) {
    System.out.println("Example Do While Loop");

    int n = 1000;

    do {
      boolean isPrime = true;
      int i = 2;
      do {
        if (n % i == 0) {
          isPrime = false;
          break;
        }
        i++;
      } while (i < n);
      if (isPrime) {
        System.out.println(n + " adalah bilangan prima");
      }
      n--;
    } while (n > 0);


    do {
      if (n % 2 == 0) {
        System.out.println(n + " adalah bilangan genap");
      } else {
        System.out.println(n + " adalah bilangan ganjil");
      }
      n--;
    } while (n > 0);
  }
}
