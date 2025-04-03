package MODUL_3.ODD_EVEN_NUMS;

public class ForLoopExamples {
  public static void main(String[] args) {
    System.out.println("Example For Loop");

    int max = 1000;
    for (int current = 1; current <= max; current++) {
      if (current % 2 == 0) {
        System.out.print(current + " ");
      }
    }
  }
}
