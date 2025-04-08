package MODUL_6.SOAL_1;

public class Main {
  public static void main(String[] args) {
    // Create a Sphere object
    Shape sphere = new Sphere(5);
    System.out.println("Volume of Sphere: " + sphere.calculateVolume());

    // Create a Cuboid object
    Shape cuboid = new Cuboid(4, 5, 6);
    System.out.println("Volume of Cuboid: " + cuboid.calculateVolume());
  }
}
