package MODUL_3;

public class WhileLoopExamples {
  public static void main(String[] args) {
    System.out.println("Example While Loop");

    int n = 1000;

    while (n > 0) {
      boolean isPrime = true;
      int i = 2;
      while (i < n) {
        if (n % i == 0) {
          isPrime = false;
          break;
        }
        i++;
      }
      if (isPrime) {
        System.out.println(n + " adalah bilangan prima");
      }
      n--;
    }

    while(n > 0){
      if(n % 2 == 0){
        System.out.println(n + " adalah bilangan genap");
      } else {
        System.out.println(n + " adalah bilangan ganjil");
      }
      n--;
    }
  }
}
