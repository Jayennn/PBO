package MODUL_8;

public class ExceptionHandling {

  public ArithmeticException arithmeticException() {
    try {
      int a = 10;
      int b = 0;

      // attempt to divide by zero
      int c = a / b;
      System.out.println(c);
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    }

    return new ArithmeticException();
  }

  public ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException() {
    try {
      int[] arr = new int[5];
      arr[5] = 10;
      System.err.println(arr[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: " + e.getMessage());
    }

    return new ArrayIndexOutOfBoundsException();
  }


  public static void main(String[] args) {
    
    ExceptionHandling exceptionHandling = new ExceptionHandling();
    
    exceptionHandling.arithmeticException();
    exceptionHandling.arrayIndexOutOfBoundsException();
  }
}
