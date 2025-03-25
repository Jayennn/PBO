package MODUL_1;

public class Main {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(5, 10);
    System.out.println("Rectangle Area: " + rectangle.calculateArea());

    Trapezium trapezium = new Trapezium(5, 10, 15);
    System.out.println("Trapezium Area: " + trapezium.calculateArea());

    Cylinder cylinder = new Cylinder(5, 10);
    System.out.println("Cylinder Area: " + cylinder.calculateArea());
  }
}
