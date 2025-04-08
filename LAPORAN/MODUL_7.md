# Pemrograman Berorientasi Objek

## Praktikum Modul 7

**Disusun oleh:**  
**Nama:** Gian Alharitz Ueldy Secondri  
**NIM:** 11241033

---

### Tugas dan Deskripsi Singkat

1. Buatlah program pewarisan **(inheritance)** sederhana. Buatlah sebuah kelas induk yang
   bernama bangun ruang, dimana kelas induk ini memiliki turunan beberapa kelas
   sederhana seperti : kubus, balok, tabung, kerucut, limas, prisma, dan bola.
   Gunakanlah variabel-variabel yang tepat, serta cari dan tampilkanlah nilai volume
   tujuh bangun ruang tersebut.
2. Buatlah program polimorfisme **(polymorphism)** sederhana yang dapat menampilkan
   jenis-jenis alat musik seperti : piano, biola, gitar, drum, saxophone, dan trumpet.
   Gunakanlah variabel dan method yang tepat, agar konsep polimorfisme dapat
   diterapkan dengan baik

---

## Pembahasan

### Inheritance

#### `Main.java`

```java
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
```

#### `BangunRuang.java`

```java
// Kelas Induk
class BangunRuang {
  double volume() {
    return 0;
  }
}

// Kelas Turunan: Kubus
class Kubus extends BangunRuang {
  double sisi;

  Kubus(double sisi) {
    this.sisi = sisi;
  }

  double volume() {
    return sisi * sisi * sisi;
  }
}

// Kelas Turunan: Balok
class Balok extends BangunRuang {
  double panjang, lebar, tinggi;

  Balok(double panjang, double lebar, double tinggi) {
    this.panjang = panjang;
    this.lebar = lebar;
    this.tinggi = tinggi;
  }

  double volume() {
    return panjang * lebar * tinggi;
  }
}

// Kelas Turunan: Tabung
class Tabung extends BangunRuang {
  double jariJari, tinggi;

  Tabung(double jariJari, double tinggi) {
    this.jariJari = jariJari;
    this.tinggi = tinggi;
  }

  double volume() {
    return Math.PI * jariJari * jariJari * tinggi;
  }
}

// Kelas Turunan: Kerucut
class Kerucut extends BangunRuang {
  double jariJari, tinggi;

  Kerucut(double jariJari, double tinggi) {
    this.jariJari = jariJari;
    this.tinggi = tinggi;
  }

  double volume() {
    return (1.0 / 3) * Math.PI * jariJari * jariJari * tinggi;
  }
}

// Kelas Turunan: Limas Segi Empat
class Limas extends BangunRuang {
  double panjangAlas, lebarAlas, tinggi;

  Limas(double panjangAlas, double lebarAlas, double tinggi) {
    this.panjangAlas = panjangAlas;
    this.lebarAlas = lebarAlas;
    this.tinggi = tinggi;
  }

  double volume() {
    return (1.0 / 3) * panjangAlas * lebarAlas * tinggi;
  }
}

// Kelas Turunan: Prisma Segitiga
class Prisma extends BangunRuang {
  double alas, tinggiSegitiga, tinggiPrisma;

  Prisma(double alas, double tinggiSegitiga, double tinggiPrisma) {
    this.alas = alas;
    this.tinggiSegitiga = tinggiSegitiga;
    this.tinggiPrisma = tinggiPrisma;
  }

  double volume() {
    double luasAlas = 0.5 * alas * tinggiSegitiga;
    return luasAlas * tinggiPrisma;
  }
}

// Kelas Turunan: Bola
class Bola extends BangunRuang {
  double jariJari;

  Bola(double jariJari) {
    this.jariJari = jariJari;
  }

  double volume() {
    return (4.0 / 3) * Math.PI * Math.pow(jariJari, 3);
  }
}

```

### Polymorphism

#### `Main.java`

```java
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
```

#### `Instruments.java`

```java
class Instruments {
  public String play() {
    return ("Instrument is playing");
  }
}

class Piano extends Instruments {
  public String play() {
    return ("Piano is playing");
  }
}

class Violin extends Instruments {
  public String play() {
    return ("Violin is playing");
  }
}

class Guitar extends Instruments {
  public String play() {
    return ("Guitar is strumming");
  }
}

class Drums extends Instruments {
  public String play() {
    return ("Drums are beating");
  }
}

class Saxophone extends Instruments {
  public String play() {
    return ("Saxophone is playing");
  }
}

class Trumpet extends Instruments {
  public String play() {
    return ("Trumpet is playing");
  }
}
```
