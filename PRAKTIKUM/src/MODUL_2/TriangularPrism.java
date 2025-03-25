package MODUL_2;

public class TriangularPrism {
  private double triangleBase;
  private double triangleHeight;
  private double prismHeight;

  public TriangularPrism(double triangleBase, double triangleHeight, double prismHeight){
    this.triangleBase = triangleBase;
    this.triangleHeight = triangleHeight;
    this.prismHeight = prismHeight;
  }

  public double calculateTriangleArea(){
    return 0.5 * triangleBase * triangleHeight;
  }

  public double calculateSurfaceArea(){
    double triangleArea = calculateTriangleArea();

    return 2 * triangleArea + (3 * triangleBase * prismHeight);
  }
  

}
