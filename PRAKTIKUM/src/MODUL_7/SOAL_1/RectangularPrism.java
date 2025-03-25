package MODUL_7.SOAL_1;

public class RectangularPrism extends Shape {
  private double length;
  private double width;
  private double height;

  public RectangularPrism(double length, double width, double height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  @Override
  public double volume() {
    return length * width * height;
  }

}
