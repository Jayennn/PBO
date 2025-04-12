# Pemrograman Berorientasi Objek

## Praktikum Modul 6

**Disusun oleh:**  
**Nama:** Gian Alharitz Ueldy Secondri  
**NIM:** 11241033

---

### Tugas dan Deskripsi Singkat

1. Buatlah program **abstraksi** sederhana yang dapat menghitung :
   a. Volume Balok
   b. Volemu Bola
2. Buatlah program **enkapsulasi** sederhana yang dapat menampilkan biodata anda,
   seperti : nama, nim, jurusan, fakultas, universitas, alamat, email, pekerjaan, hobi,
   keahlian, dan karya.

---

## Pembahasam

### Soal. 1

#### `Main.java`

```java
// Deklarasi kelas utama
public class Main {

    // Metode main sebagai titik awal program
  public static void main(String[] args) {
    // Membuat objek Sphere (bola) dengan jari-jari 5, dan menyimpannya dalam variabel bertipe Shape
    Shape sphere = new Sphere(5);

    // Menampilkan volume dari objek Sphere dengan memanggil method calculateVolume()
    System.out.println("Volume of Sphere: " + sphere.calculateVolume());

    // Membuat objek Cuboid (balok) dengan panjang 4, lebar 5, tinggi 6, dan menyimpannya dalam variabel bertipe Shape
    Shape cuboid = new Cuboid(4, 5, 6);

    // Menampilkan volume dari objek Cuboid dengan memanggil method calculateVolume()
    System.out.println("Volume of Cuboid: " + cuboid.calculateVolume());
  }
}
```

#### `Shape.java`

```java
// Mendeklarasikan kelas abstrak bernama Shape
public abstract class Shape {

  // Method abstrak untuk menghitung volume.
  // Kelas turunan wajib mengimplementasikan method ini.
  public abstract double calculateVolume();
}
```

#### `Bola.java`

```java
// Kelas Sphere adalah turunan dari kelas abstrak Shape
public class Sphere extends Shape {

  // Variabel instance untuk menyimpan jari-jari bola
  private double radius;

  // Konstruktor untuk menginisialisasi nilai radius saat objek Sphere dibuat
  public Sphere(double radius) {
    this.radius = radius;
  }

  // Override method calculateVolume dari kelas Shape
  @Override
  public double calculateVolume() {
    // Rumus volume bola: (4/3) * π * r^3
    return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
  }
}
```

#### `Balok.java`

```java
// Kelas Cuboid (balok) merupakan turunan dari kelas abstrak Shape
public class Cuboid extends Shape {

  // Variabel instance untuk menyimpan dimensi balok: panjang, lebar, dan tinggi
  private double length;
  private double width;
  private double height;

  // Konstruktor untuk menginisialisasi panjang, lebar, dan tinggi balok
  public Cuboid(double length, double width, double height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  // Override method calculateVolume dari kelas Shape
  @Override
  public double calculateVolume() {
    // Rumus volume balok: panjang × lebar × tinggi
    return length * width * height;
  }
}

```

## Soal. 2

#### `Main.java`

```java
// Deklarasi kelas utama
public class Main {

    // Metode main sebagai titik awal program
  public static void main(String[] args) {
    // Membuat objek dari class Biodata dan langsung mengisi datanya melalui konstruktor
    Biodata biodata = new Biodata("John Doe", "A11.2018.11111", "Computer Science", "Faculty of Computer Science",
        "Universitas Brawijaya", "Jl. Veteran No. 1", "jhondoe@gmail.com", "Software Engineer", "Ngoding",
        "Java, Python, Javascript", "Dicoding Certificate");

    // Menampilkan nama
    System.out.println(biodata.getName());

    // Menampilkan NIM
    System.out.println(biodata.getStudentId());

    // Menampilkan jurusan
    System.out.println(biodata.getMajor());

    // Menampilkan fakultas
    System.out.println(biodata.getFaculty());

    // Menampilkan universitas
    System.out.println(biodata.getUniversity());

    // Menampilkan alamat
    System.out.println(biodata.getAddress());

    // Menampilkan email
    System.out.println(biodata.getEmail());

    // Menampilkan pekerjaan
    System.out.println(biodata.getWork());

    // Menampilkan hobi
    System.out.println(biodata.getHobbies());

    // Menampilkan skill
    System.out.println(biodata.getSkills());

    // Menampilkan prestasi atau pencapaian
    System.out.println(biodata.getAchievements());
  }
}

```

#### `Biodata.java`

```java
// Deklarasi kelas publik bernama 'Biodata'
public class Biodata {

  // Variabel instance bertipe String (hanya dapat diakses di dalam kelas ini karena private)
  private String name;           // Menyimpan nama mahasiswa
  private String studentId;      // Menyimpan NIM atau nomor induk mahasiswa
  private String major;          // Menyimpan jurusan/program studi
  private String faculty;        // Menyimpan nama fakultas
  private String university;     // Menyimpan nama universitas
  private String address;        // Menyimpan alamat tempat tinggal
  private String email;          // Menyimpan alamat email aktif
  private String work;           // Menyimpan pekerjaan (jika ada)
  private String hobbies;        // Menyimpan hobi
  private String skills;         // Menyimpan skill/keahlian
  private String achievements;   // Menyimpan daftar prestasi

  // Konstruktor Biodata dengan parameter lengkap
  // Digunakan untuk mengisi semua atribut saat objek dibuat
  public Biodata(String name, String studentId, String major, String faculty, String university, String address,
      String email, String work, String hobbies, String skills, String achievements) {
    this.name = name;                     // Menyimpan nilai parameter ke atribut name
    this.studentId = studentId;           // Menyimpan NIM ke atribut studentId
    this.major = major;                   // Menyimpan jurusan
    this.faculty = faculty;               // Menyimpan fakultas
    this.university = university;         // Menyimpan universitas
    this.address = address;               // Menyimpan alamat
    this.email = email;                   // Menyimpan email
    this.work = work;                     // Menyimpan pekerjaan
    this.hobbies = hobbies;               // Menyimpan hobi
    this.skills = skills;                 // Menyimpan skill
    this.achievements = achievements;     // Menyimpan prestasi
  }

  // Fungsi getter untuk mendapatkan nama dari instance
  public String getName() {
    return name;
  }

  // Fungsi setter untuk mengubah nama dari instance
  public void setName(String name) {
    this.name = name;
  }

  // Fungsi getter untuk mendapatkan student ID dari instance
  public String getStudentId() {
    return studentId;
  }

  // Fungsi setter untuk mengubah student ID dari instance
  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  // Fungsi getter untuk mendapatkan jurusan dari instance
  public String getMajor() {
    return major;
  }

  // Fungsi setter untuk mengubah jurusan dari instance
  public void setMajor(String major) {
    this.major = major;
  }

  // Fungsi getter untuk mendapatkan fakultas dari instance
  public String getFaculty() {
    return faculty;
  }

  // Fungsi setter untuk mengubah fakultas dari instance
  public void setFaculty(String faculty) {
    this.faculty = faculty;
  }

  // Fungsi getter untuk mendapatkan universitas dari instance
  public String getUniversity() {
    return university;
  }

  // Fungsi setter untuk mengubah universitas dari instance
  public void setUniversity(String university) {
    this.university = university;
  }

  // Fungsi getter untuk mendapatkan alamat dari instance
  public String getAddress() {
    return address;
  }

  // Fungsi setter untuk mengubah alamat dari instance
  public void setAddress(String address) {
    this.address = address;
  }

  // Fungsi getter untuk mendapatkan email dari instance
  public String getEmail() {
    return email;
  }

  // Fungsi setter untuk mengubah email dari instance
  public void setEmail(String email) {
    this.email = email;
  }

  // Fungsi getter untuk mendapatkan pekerjaan dari instance
  public String getWork() {
    return work;
  }

  // Fungsi setter untuk mengubah pekerjaan dari instance
  public void setWork(String work) {
    this.work = work;
  }

  // Fungsi getter untuk mendapatkan hobi dari instance
  public String getHobbies() {
    return hobbies;
  }

  // Fungsi setter untuk mengubah hobi dari instance
  public void setHobbies(String hobbies) {
    this.hobbies = hobbies;
  }

  // Fungsi getter untuk mendapatkan keahlian dari instance
  public String getSkills() {
    return skills;
  }

  // Fungsi setter untuk mengubah keahlian dari instance
  public void setSkills(String skills) {
    this.skills = skills;
  }

  // Fungsi getter untuk mendapatkan pencapaian dari instance
  public String getAchievements() {
    return achievements;
  }

  // Fungsi setter untuk mengubah pencapaian dari instance
  public void setAchievements(String achievements) {
    this.achievements = achievements;
  }
}
```
