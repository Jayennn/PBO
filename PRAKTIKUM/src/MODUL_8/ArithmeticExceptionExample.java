package MODUL_8;

public class ArithmeticExceptionExample {
  public static void main(String[] args) {
    try {
      int a = 10;
      int b = 0;

      // This will throw an ArithmeticException
      int c = a / b;

      System.out.println(c);
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
