package WEEK_5;

public class Main {
  public static void main(String[] args) throws Exception {
    Vehicle vehicles[] = {
        new LandVehicle("Mobil", 90, 100, 4),
        new WaterVehicle("Kapal", 80, 100, true),
        new LandVehicle("Truk", 120, 20, 6), // bahan bakar rendah
        new WaterVehicle("Perahu", 60, 50, false) // bahan bakar rendah
    };

    for (Vehicle vehicle : vehicles) {
      System.out.println("\n");
      vehicle.move();

      double fuelUsed = vehicle.calculateFuelConsumption(50);
      System.out.println(
          "Konsumsi bahan bakar untuk 50 km: " + fuelUsed + "%, Sisa bahan bakar: " + vehicle.getFuelLevel() + "%");

      if (vehicle instanceof IRefuelable) {
        IRefuelable refuelable = (IRefuelable) vehicle;
        if (refuelable.isFuelLow()) {
          System.out.println("bahan bakar " + vehicle.getName() + " rendah. Melakukan isi ulang 30%...");

          refuelable.refuel(90);
          System.out.println("Sisa bahan bakar setelah diisi: " + vehicle.getFuelLevel() + "%");
        }
      }

      System.err.println("\n");

    }
  }
}
