package MODUL_3;

public class ForLoopExamples {
  public static void main(String[] args) {
    System.out.println("Example For Loop");

    int n = 1000;

    for (int i = 1; i <= n; i++) {
      boolean isPrime = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        System.out.println(i + " adalah bilangan prima");
      }
    }

    for(int i = 1; i <= n; i++){
      if(i % 2 == 0){
        System.out.println(i + " adalah bilangan genap");
      } else {
        System.out.println(i + " adalah bilangan ganjil");
      }
    }
  }
}
