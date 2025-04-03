package MODUL_3.ODD_EVEN_NUMS;

public class WhileLoopExamples {
  public static void main(String[] args) {
    System.out.println("Example While Loop");

    int max = 1000;
    int current = 1;
    while (current <= max) {
      if (current % 2 == 0) {
        System.out.print(current + " ");
      }
      current++;
    }

  }
}
