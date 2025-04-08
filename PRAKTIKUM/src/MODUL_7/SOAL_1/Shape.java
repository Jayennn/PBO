package MODUL_7.SOAL_1;

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
