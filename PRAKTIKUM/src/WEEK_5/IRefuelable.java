package WEEK_5;

// Interface IRefuelable mendefinisikan perilaku untuk kendaraan yang dapat diisi bahan bakar
public interface IRefuelable {

  // Metode untuk mengisi bahan bakar kendaraan dengan jumlah tertentu
  void refuel(double amount);

  // Metode untuk memeriksa apakah bahan bakar kendaraan sudah rendah
  boolean isFuelLow();
}
