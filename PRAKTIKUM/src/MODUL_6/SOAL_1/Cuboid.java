package MODUL_6.SOAL_1;

public class Cuboid extends Shape {
  private double length;
  private double width;
  private double height;

  public Cuboid(double length, double width, double height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  @Override
  public double calculateVolume() {
    return length * width * height;
  }
}
