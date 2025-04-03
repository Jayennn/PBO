package MODUL_3.ODD_EVEN_NUMS;

public class DoWhileLoopExamples {
  public static void main(String[] args) {
    System.out.println("Example Do While Loop");

    int max = 1000;
    int current = 1;
    do {
      if (current % 2 == 0) {
        System.out.print(current + " ");
      }
      current++;
    } while (current < max);
  }
}
