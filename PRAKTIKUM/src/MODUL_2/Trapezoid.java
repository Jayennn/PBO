package MODUL_2;

public class Trapezoid {
  private double upperBase;
  private double lowerBase;
  private double height;

  public Trapezoid(double upperBase, double lowerBase, double height){
    this.upperBase = upperBase;
    this.lowerBase = lowerBase;
    this.height = height;
  }   

  public double calculateArea(){
    return 0.5 * (upperBase + lowerBase) * height;
  }
  
}
