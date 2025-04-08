# Pemrograman Berorientasi Objek

## Praktikum Modul 1

**Disusun oleh:**  
**Nama:** Gian Alharitz Ueldy Secondri  
**NIM:** 11241033

---

### Tugas dan Deskripsi Singkat

1. Dengan menerapkan _object_ dan _method_, buatlah program Java untuk menghitung:

   - Luas isi tabung
   - Luas persegi panjang
   - Luas trapesium

2. Buatlah dua program, yaitu:

   - Program **prosedural**
   - Program **Berorientasi Objek (OOP)**

   Keduanya harus dapat menghitung **volume tabung**.  
   Tunjukkan perbedaan antara pemrograman prosedural dan OOP.

---

## Pembahasan

#### `Main.java`

```java
public class Main {
  public static void main(String[] args) {

    // Membuat objek Rectangle (persegi panjang) dengan lebar 5 dan tinggi 10
    Rectangle rectangle = new Rectangle(5, 10);

    // Menghitung dan mencetak luas persegi panjang menggunakan method calculateArea()
    System.out.println("Rectangle Area: " + rectangle.calculateArea());

    // Membuat objek Trapezium (trapesium) dengan alas bawah 5, alas atas 10, dan tinggi 15
    Trapezium trapezium = new Trapezium(5, 10, 15);

    // Menghitung dan mencetak luas trapesium
    System.out.println("Trapezium Area: " + trapezium.calculateArea());

    // Membuat objek Cylinder (tabung) dengan jari-jari 5 dan tinggi 10
    Cylinder cylinder = new Cylinder(5, 10);

    // Menghitung dan mencetak luas permukaan tabung
    System.out.println("Cylinder Area: " + cylinder.calculateArea());

    // Menghitung dan mencetak volume tabung menggunakan method khusus calculateVolume()
    System.out.println("Cylinder Volume (OOP): " + cylinder.calculateVolume());
  }
}

```

#### `Shape.java`

```java
// Kelas abstrak Shape berfungsi sebagai "kerangka dasar" untuk semua bentuk (shape)
public abstract class Shape {

  // Method abstrak calculateArea() wajib diimplementasikan oleh semua class turunan
  public abstract double calculateArea();
}

```

#### `Rectangle.java`

```java
// Kelas Rectangle merupakan turunan dari kelas abstrak Shape
public class Rectangle extends Shape {

  // Variabel untuk menyimpan lebar dan tinggi persegi panjang
  private double width;
  private double height;

  // Constructor: digunakan untuk menginisialisasi nilai lebar dan tinggi saat objek dibuat
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  // Override method calculateArea dari class Shape
  // Mengembalikan hasil perkalian width * height sebagai luas persegi panjang
  @Override
  public double calculateArea() {
    return width * height;
  }
}

```

#### `Trapezium.java`

```java
// Kelas Trapezium merupakan turunan dari kelas abstrak Shape
public class Trapezium extends Shape {

  // Variabel instance untuk menyimpan alas bawah, alas atas, dan tinggi trapesium
  private double base1;
  private double base2;
  private double height;

  // Constructor: digunakan untuk menginisialisasi nilai base1, base2, dan height saat objek dibuat
  public Trapezium(double base1, double base2, double height) {
    this.base1 = base1;
    this.base2 = base2;
    this.height = height;
  }

  // Override method calculateArea dari class Shape
  // Menghitung luas trapesium dengan rumus: ½ × (base1 + base2) × height
  @Override
  public double calculateArea() {
    return 0.5 * (base1 + base2) * height;
  }
}
```

#### `Cylinder.java`

```java
// Kelas Cylinder merupakan turunan dari kelas abstrak Shape
public class Cylinder extends Shape {

  // Variabel instance untuk menyimpan jari-jari dan tinggi tabung
  private double radius;
  private double height;

  // Constructor: digunakan untuk menginisialisasi radius dan height saat objek dibuat
  public Cylinder(double radius, double height) {
    this.radius = radius;
    this.height = height;
  }

  // Override method calculateArea dari class Shape
  // Menghitung luas permukaan tabung dengan rumus: 2πr(r + t)
  @Override
  public double calculateArea() {
    return 2 * Math.PI * radius * (radius + height);
  }

  // Method tambahan khusus class Cylinder untuk menghitung volume
  // Rumus volume tabung: πr²t
  public double calculateVolume() {
    return Math.PI * radius * radius * height;
  }
}
```

---

## Versi Prosedural (Untuk Perbandingan)

### `ProceduralVolume.java`

```java
public class ProceduralVolume {
  public static void main(String[] args) {
    double radius = 5;
    double height = 10;

    double volume = calculateCylinderVolume(radius, height);
    System.out.println("Cylinder Volume (Procedural): " + volume);
  }

  public static double calculateCylinderVolume(double r, double h) {
    return Math.PI * r * r * h;
  }
}
```

---

## Perbandingan Prosedural vs OOP

| Aspek                         | Prosedural                  | OOP (Object-Oriented Programming)         |
| ----------------------------- | --------------------------- | ----------------------------------------- |
| Struktur Program              | Fungsi berdiri sendiri      | Tersusun atas class dan object            |
| Reusability (Pemakaian Ulang) | Sulit karena tidak modular  | Mudah dengan inheritance & polymorphism   |
| Data dan Logika               | Terpisah                    | Dikelompokkan dalam class (encapsulation) |
| Contoh                        | `calculateCylinderVolume()` | `cylinder.calculateVolume()`              |
| Cocok Untuk                   | Program sederhana           | Program besar dan kompleks                |
