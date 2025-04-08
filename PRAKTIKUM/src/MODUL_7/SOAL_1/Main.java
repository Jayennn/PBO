package MODUL_7.SOAL_1;

// Program Utama
public class Main {
  public static void main(String[] args) {
    Kubus kubus = new Kubus(5);
    Balok balok = new Balok(4, 3, 2);
    Tabung tabung = new Tabung(3, 7);
    Kerucut kerucut = new Kerucut(3, 5);
    Limas limas = new Limas(4, 4, 6);
    Prisma prisma = new Prisma(3, 4, 5);
    Bola bola = new Bola(6);

    System.out.println("Volume Kubus: " + kubus.volume());
    System.out.println("Volume Balok: " + balok.volume());
    System.out.println("Volume Tabung: " + tabung.volume());
    System.out.println("Volume Kerucut: " + kerucut.volume());
    System.out.println("Volume Limas: " + limas.volume());
    System.out.println("Volume Prisma: " + prisma.volume());
    System.out.println("Volume Bola: " + bola.volume());
  }
}
