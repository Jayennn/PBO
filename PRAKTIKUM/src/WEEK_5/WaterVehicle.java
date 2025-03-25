package WEEK_5;

// Kelas WaterVehicle adalah turunan dari kelas Vehicle dan mengimplementasikan interface IRefuelable
public class WaterVehicle extends Vehicle implements IRefuelable {
  private boolean hasPropeller; // Menyimpan informasi apakah kendaraan air memiliki baling-baling atau tidak

  // Konstruktor untuk membuat objek WaterVehicle
  public WaterVehicle(String name, int speed, double fuelLevel, boolean hasPropeller) {
    super(name, speed, fuelLevel); // Memanggil konstruktor dari kelas induk (Vehicle)
    this.hasPropeller = hasPropeller;
  }

  // Override metode move() untuk menampilkan cara kendaraan air bergerak
  @Override
  public void move() {
    System.out.println(getName() + " bergerak di air dengan kecepatan: " + getSpeed()
        + " km/jam, menggunakan baling-baling: " + hasPropeller);
  }

  // Override metode calculateFuelConsumption() untuk menghitung konsumsi bahan
  // bakar
  @Override
  public double calculateFuelConsumption(int distance) {
    double fuelUsed = distance / 8.0; // Menggunakan bahan bakar 1 liter per 8 km
    double currentFuelLevel = getFuelLevel();

    // Jika bahan bakar yang digunakan lebih besar dari yang tersedia
    if (fuelUsed > currentFuelLevel) {
      double actualFuelUsed = currentFuelLevel;
      setFuelLevel(0); // Bahan bakar habis
      System.out.println(getName() + " kehabisan bahan bakar setelah menggunakan " + actualFuelUsed + "% bahan bakar.");
      return actualFuelUsed;
    }

    // Jika bahan bakar cukup
    double remainingFuel = currentFuelLevel - fuelUsed;
    setFuelLevel(remainingFuel);
    System.out
        .println(getName() + " menggunakan " + fuelUsed + "% bahan bakar. Sisa bahan bakar: " + remainingFuel + "%");
    return fuelUsed;
  }

  // Metode untuk mengecek apakah bahan bakar rendah
  @Override
  public boolean isFuelLow() {
    return getFuelLevel() < 20; // Jika bahan bakar kurang dari 20%, maka dianggap rendah
  }

  // Override metode refuel() untuk mengisi bahan bakar
  @Override
  public void refuel(double amount) {
    double fuelLevel = getFuelLevel();

    // Jika bahan bakar sudah penuh, tidak perlu diisi lagi
    if (fuelLevel == 100) {
      System.out.println("Bahan bakar " + getName() + " sudah penuh");
      return;
    }

    double newFuelLevel = fuelLevel + amount; // Menambah bahan bakar

    // Jika pengisian melebihi kapasitas maksimum (100%)
    if (newFuelLevel > 100) {
      setFuelLevel(100);
      System.out.println("Bahan bakar telah diisi penuh");
    } else {
      setFuelLevel(newFuelLevel);
      System.out.println("Bahan bakar ditambahkan. Level sekarang: " + newFuelLevel + "%");
    }
  }
}