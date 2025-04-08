package MODUL_7.SOAL_2;

public class Main {
  public static void main(String[] args) {
    Instruments[] instruments = {
        new Piano(),
        new Violin(),
        new Guitar(),
        new Drums(),
        new Saxophone(),
        new Trumpet()
    };

    for (Instruments instrument : instruments) {
      System.out.println(instrument.play());
    }
  }
}
