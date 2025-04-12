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

### Soal. 1

#### `Main.java`

```java
public class Main {
  public static void main(String[] args) {

    // Membuat objek Kubus dengan panjang sisi 5
    Kubus kubus = new Kubus(5);

    // Membuat objek Balok dengan panjang 4, lebar 3, dan tinggi 2
    Balok balok = new Balok(4, 3, 2);

    // Membuat objek Tabung dengan jari-jari 3 dan tinggi 7
    Tabung tabung = new Tabung(3, 7);

    // Membuat objek Kerucut dengan jari-jari 3 dan tinggi 5
    Kerucut kerucut = new Kerucut(3, 5);

    // Membuat objek Limas dengan panjang alas 4, lebar alas 4, dan tinggi 6
    Limas limas = new Limas(4, 4, 6);

    // Membuat objek Prisma dengan panjang alas 3, tinggi segitiga alas 4, dan tinggi prisma 5
    Prisma prisma = new Prisma(3, 4, 5);

    // Membuat objek Bola dengan jari-jari 6
    Bola bola = new Bola(6);

    // Menampilkan volume masing-masing bangun ruang
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
// Kelas Induk (Superclass) untuk semua bangun ruang
class BangunRuang {
  // Method volume default, akan dioverride oleh kelas turunan
  double volume() {
    return 0;
  }
}


// Kelas Turunan: Kubus
class Kubus extends BangunRuang {
  double sisi; // Panjang sisi kubus

  // Konstruktor
  Kubus(double sisi) {
    this.sisi = sisi;
  }

  // Mengoverride method volume untuk menghitung volume kubus
  double volume() {
    return sisi * sisi * sisi;
  }
}


// Kelas Turunan: Balok
class Balok extends BangunRuang {
  double panjang, lebar, tinggi; // Dimensi balok

  // Konstruktor
  Balok(double panjang, double lebar, double tinggi) {
    this.panjang = panjang;
    this.lebar = lebar;
    this.tinggi = tinggi;
  }

  // Mengoverride method volume untuk menghitung volume balok
  double volume() {
    return panjang * lebar * tinggi;
  }
}


// Kelas Turunan: Tabung
class Tabung extends BangunRuang {
  double jariJari, tinggi; // Dimensi tabung

  // Konstruktor
  Tabung(double jariJari, double tinggi) {
    this.jariJari = jariJari;
    this.tinggi = tinggi;
  }

  // Mengoverride method volume untuk menghitung volume tabung
  double volume() {
    return Math.PI * jariJari * jariJari * tinggi;
  }
}

// Kelas Turunan: Kerucut
class Kerucut extends BangunRuang {
  double jariJari, tinggi; // Dimensi kerucut

  // Konstruktor
  Kerucut(double jariJari, double tinggi) {
    this.jariJari = jariJari;
    this.tinggi = tinggi;
  }

  // Mengoverride method volume untuk menghitung volume kerucut
  double volume() {
    return (1.0 / 3) * Math.PI * jariJari * jariJari * tinggi;
  }
}


// Kelas Turunan: Limas Segi Empat
class Limas extends BangunRuang {
  double panjangAlas, lebarAlas, tinggi; // Dimensi limas segi empat

  // Konstruktor
  Limas(double panjangAlas, double lebarAlas, double tinggi) {
    this.panjangAlas = panjangAlas;
    this.lebarAlas = lebarAlas;
    this.tinggi = tinggi;
  }

  // Mengoverride method volume untuk menghitung volume limas
  double volume() {
    return (1.0 / 3) * panjangAlas * lebarAlas * tinggi;
  }
}


// Kelas Turunan: Prisma Segitiga
class Prisma extends BangunRuang {
  double alas, tinggiSegitiga, tinggiPrisma; // Dimensi prisma segitiga

  // Konstruktor
  Prisma(double alas, double tinggiSegitiga, double tinggiPrisma) {
    this.alas = alas;
    this.tinggiSegitiga = tinggiSegitiga;
    this.tinggiPrisma = tinggiPrisma;
  }

  // Mengoverride method volume untuk menghitung volume prisma
  double volume() {
    double luasAlas = 0.5 * alas * tinggiSegitiga; // Luas segitiga sebagai alas
    return luasAlas * tinggiPrisma;
  }
}


// Kelas Turunan: Bola
class Bola extends BangunRuang {
  double jariJari; // Jari-jari bola

  // Konstruktor
  Bola(double jariJari) {
    this.jariJari = jariJari;
  }

  // Mengoverride method volume untuk menghitung volume bola
  double volume() {
    return (4.0 / 3) * Math.PI * Math.pow(jariJari, 3);
  }
}
```

### Polymorphism

#### `Main.java`

```java
// Deklarasi kelas utama
public class Main {

    // Metode main sebagai titik awal program
  public static void main(String[] args) {
    // Membuat array dari objek Instruments, masing-masing berisi objek alat musik yang berbeda
    Instruments[] instruments = {
        new Piano(),       // Membuat objek Piano
        new Violin(),      // Membuat objek Violin
        new Guitar(),      // Membuat objek Guitar
        new Drums(),       // Membuat objek Drums
        new Saxophone(),   // Membuat objek Saxophone
        new Trumpet()      // Membuat objek Trumpet
    };

    // Melakukan iterasi untuk setiap objek dalam array instruments
    for (Instruments instrument : instruments) {
      // Memanggil method play() dari setiap objek dan mencetak hasilnya ke layar
      System.out.println(instrument.play());
    }
  }
}
```

#### `Instruments.java`

```java
// Kelas induk Instruments
class Instruments {
  // Method play() yang akan dioverride oleh subclass
  public String play() {
    return ("Instrument is playing"); // Pesan default jika subclass tidak mengoverride
  }
}

// Subclass Piano mewarisi dari Instruments
class Piano extends Instruments {
  // Override method play() khusus untuk Piano
  public String play() {
    return ("Piano is playing"); // Menampilkan pesan saat piano dimainkan
  }
}

// Subclass Violin mewarisi dari Instruments
class Violin extends Instruments {
  // Override method play() khusus untuk Violin
  public String play() {
    return ("Violin is playing"); // Menampilkan pesan saat biola dimainkan
  }
}

// Subclass Guitar mewarisi dari Instruments
class Guitar extends Instruments {
  // Override method play() khusus untuk Guitar
  public String play() {
    return ("Guitar is strumming"); // Menampilkan pesan khas gitar
  }
}

// Subclass Drums mewarisi dari Instruments
class Drums extends Instruments {
  // Override method play() khusus untuk Drums
  public String play() {
    return ("Drums are beating"); // Menampilkan pesan khas drum
  }
}

// Subclass Saxophone mewarisi dari Instruments
class Saxophone extends Instruments {
  // Override method play() khusus untuk Saxophone
  public String play() {
    return ("Saxophone is playing"); // Menampilkan pesan saat saxophone dimainkan
  }
}

// Subclass Trumpet mewarisi dari Instruments
class Trumpet extends Instruments {
  // Override method play() khusus untuk Trumpet
  public String play() {
    return ("Trumpet is playing"); // Menampilkan pesan saat trumpet dimainkan
  }
}
```
