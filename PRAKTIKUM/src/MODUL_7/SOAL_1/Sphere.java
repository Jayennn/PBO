package MODUL_7.SOAL_1;

public class Sphere extends Shape {
  private double radius;

  public Sphere(double radius) {
    this.radius = radius;
  }

  @Override
  public double volume() {
    return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
  }

}
