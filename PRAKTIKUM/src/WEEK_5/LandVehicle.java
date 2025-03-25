package WEEK_5;

// Kelas LandVehicle adalah turunan dari Vehicle dan mengimplementasikan IRefuelable
public class LandVehicle extends Vehicle implements IRefuelable {
  private int numberOfWheels; // Menyimpan jumlah roda kendaraan

  // Konstruktor untuk menginisialisasi LandVehicle
  public LandVehicle(String name, int speed, double fuelLevel, int numberOfWheels) {
    super(name, speed, fuelLevel); // Memanggil konstruktor superclass
    this.numberOfWheels = numberOfWheels;
  }

  // Implementasi metode move() dari Vehicle
  @Override
  public void move() {
    System.out.println(
        getName() + " bergerak di darat dengan " + numberOfWheels + " roda pada kecepatan " + getSpeed() + " km/jam");
  }

  // Menghitung konsumsi bahan bakar berdasarkan jarak tempuh
  @Override
  public double calculateFuelConsumption(int distance) {
    double fuelUsed = distance / 10.0; // Konsumsi bahan bakar: 1 liter per 10 km
    double currentFuelLevel = getFuelLevel();

    // Jika bahan bakar tidak cukup untuk menempuh jarak yang diminta
    if (fuelUsed > currentFuelLevel) {
      double actualFuelUsed = currentFuelLevel; // Gunakan sisa bahan bakar yang ada
      setFuelLevel(0); // Bahan bakar habis
      System.out.println(getName() + " kehabisan bahan bakar setelah menggunakan " + actualFuelUsed + "% bahan bakar.");
      return actualFuelUsed;
    }

    // Jika bahan bakar cukup, lakukan pengurangan bahan bakar
    double remainingFuel = currentFuelLevel - fuelUsed;
    setFuelLevel(remainingFuel);
    System.out
        .println(getName() + " menggunakan " + fuelUsed + "% bahan bakar. Sisa bahan bakar: " + remainingFuel + "%");
    return fuelUsed;
  }

  // Mengecek apakah bahan bakar rendah (kurang dari 20%)
  @Override
  public boolean isFuelLow() {
    return getFuelLevel() < 20;
  }

  // Mengisi ulang bahan bakar kendaraan
  @Override
  public void refuel(double amount) {
    double fuelLevel = getFuelLevel();

    // Jika bahan bakar sudah penuh, tidak perlu diisi lagi
    if (fuelLevel == 100) {
      System.out.println("Bahan bakar " + getName() + " sudah penuh");
      return;
    }

    double newFuelLevel = fuelLevel + amount; // Tambahkan jumlah bahan bakar yang diisi

    // Pastikan bahan bakar tidak melebihi kapasitas maksimum (100%)
    if (newFuelLevel > 100) {
      setFuelLevel(100);
    } else {
      setFuelLevel(newFuelLevel);
    }
  }
}
