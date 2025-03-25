package MODUL_7.SOAL_1;

public class Main {

  public static void main(String[] args) {
    Sphere sphere = new Sphere(5.0);
    RectangularPrism rectangularPrism = new RectangularPrism(3.0, 4.0, 5.0);

    System.err.println("Sphere volume: " + sphere.volume());
    System.err.println("Rectangular prism volume: " + rectangularPrism.volume());
  }
}
