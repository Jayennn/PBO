package MODUL_1;

public class Cylinder extends Shape {
  private double radius;
  private double height;

  public Cylinder(double radius, double height){
    this.radius = radius;
    this.height = height;
  }

  @Override
  public double calculateArea(){
    return 2 * Math.PI * radius * (radius + height);
  }
}
