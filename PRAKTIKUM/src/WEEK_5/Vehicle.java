package WEEK_5;

// Kelas abstrak Vehicle sebagai dasar untuk kendaraan lain
public abstract class Vehicle {
  // Atribut private untuk menyimpan data kendaraan
  private String name; // Nama kendaraan
  private int speed; // Kecepatan kendaraan dalam km/jam
  private double fuelLevel; // Level bahan bakar dalam persen (%)

  // Konstruktor untuk menginisialisasi kendaraan
  public Vehicle(String name, int speed, double fuelLevel) {
    this.name = name;
    this.speed = speed;
    this.fuelLevel = fuelLevel;
  }

  // Metode getter untuk mendapatkan nama kendaraan
  public String getName() {
    return name;
  }

  // Metode getter untuk mendapatkan kecepatan kendaraan
  public int getSpeed() {
    return speed;
  }

  // Metode getter untuk mendapatkan level bahan bakar kendaraan
  public double getFuelLevel() {
    return fuelLevel;
  }

  // Metode setter untuk mengubah level bahan bakar kendaraan
  public double setFuelLevel(double fuelLevel) {
    return this.fuelLevel = fuelLevel;
  }

  // Metode abstrak untuk menggerakkan kendaraan, harus diimplementasikan oleh
  // subclass
  public abstract void move();

  // Metode abstrak untuk menghitung konsumsi bahan bakar berdasarkan jarak tempuh
  public abstract double calculateFuelConsumption(int distance);
}
