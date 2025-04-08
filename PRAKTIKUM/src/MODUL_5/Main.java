package MODUL_5;

public class Main {
  public static void main(String[] args) {
    StudentRecord student1 = new StudentRecord();
    System.out.println("=====================");

    student1.display();
    System.out.println("=====================");

    student1.display(3.5, 3.6, "KNB Scholarship");

    System.out.println("=====================");
    student1.displayAll();

    System.out.println("=====================");

  }
}
