package MODUL_8;

public class IndexOutOfBoundsException {
  public static void main(String[] args) {
    try {
      int[] arr = new int[5];
      arr[5] = 10; // This will throw an ArrayIndexOutOfBoundsException
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
