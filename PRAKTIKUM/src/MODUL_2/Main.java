package MODUL_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {
      // 1. Keliling Lingkaran
      System.out.println("Enter the radius of the circle: ");
      double radius = scanner.nextDouble();
      Circle circle = new Circle(radius);
      System.out.println("Circumference of the circle: " + circle.calculateCircumference());


      // 2. Luas Trapesium  
      System.out.println("Masukkan panjang alas atas trapesium: ");
      double upperBase = Double.parseDouble(reader.readLine());
      System.out.println("Masukkan panjang alas bawah trapesium: ");
      double lowerBase = Double.parseDouble(reader.readLine());
      System.out.println("Masukkan tinggi trapesium: ");
      double height = Double.parseDouble(reader.readLine());
      Trapezoid trapezoid = new Trapezoid(upperBase, lowerBase, height);
      System.out.println("Luas trapesium: " + trapezoid.calculateArea());

      // 3. Luas Prisma Segitiga
      double baseTriangle = Double.parseDouble(JOptionPane.showInputDialog("Masukkan alas segitiga: "));  
      double triangleHeight = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi segitiga: "));
      double prismHeight = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi prisma segitiga: "));

      TriangularPrism triangularPrism = new TriangularPrism(baseTriangle, triangleHeight, prismHeight);
      JOptionPane.showMessageDialog(null, "Luas prisma segitiga: " + triangularPrism.calculateSurfaceArea());


    
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      scanner.close();
    }

  }
}
