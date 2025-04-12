# Pemrograman Berorientasi Objek

## Praktikum Modul 5

**Disusun oleh:**  
**Nama:** Gian Alharitz Ueldy Secondri  
**NIM:** 11241033

---

### Tugas dan Deskripsi Singkat

1. Buatlah program overloading method yang dapat menampilkan identitas mahasiswa
   dan prestasi akademiknya, seperti gambaran berikut :
   | Identitas Mahasiswa | Prestasi Akademik |
   | ------------------- | ----------------- |
   | Nama | Nama |
   | Nim | IP Semester |
   | Jurusan | IP Kumulatif |
   | Fakultas | Riwayat Beasiswa |

2. Buatlah Program **_overloading constructor_** yang dapat menampilkan identitas mahasiswa seperti gambaran berikut:
   | Identitas Mahasiswa |
   | ------------------- |
   | Nama |
   | Nim |
   | Jurusan |
   | Fakultas |
   | IP Semester |
   | IP Kumulatif |

---

## Pembahasan

#### `Main.java`

```java
public class Main {
  public static void main(String[] args) {

    // Membuat objek baru dari kelas StudentRecord
    StudentRecord student1 = new StudentRecord();

    System.out.println("=====================");

    /// Memanggil method display() untuk menampilkan informasi dasar (nama, NIM, jurusan, fakultas)
    student1.display();
    System.out.println("=====================");

     // Memanggil method display dengan parameter untuk menampilkan nilai dan riwayat beasiswa
    student1.display(3.5, 3.6, "KNB Scholarship");

    System.out.println("=====================");

    // Memanggil method displayAll untuk menampilkan semua informasi secara lengkap dari objek student1
    student1.displayAll();

    System.out.println("=====================");

  }
}
```

#### `StudentRecord.java`

```java
// Deklarasi kelas publik bernama StudentRecord
public class StudentRecord {

  // Deklarasi variabel instance (atribut) dengan access modifier private (hanya bisa diakses dalam kelas ini)
  private String name;                  // Nama mahasiswa
  private String studentId;             // NIM atau ID mahasiswa
  private String major;                 // Jurusan mahasiswa
  private String faculty;               // Fakultas tempat mahasiswa belajar
  private double semesterGPA;           // IP Semester mahasiswa (IPS)
  private double cumulativeGPA;         // IP Kumulatif mahasiswa (IPK)
  private String scholarshipHistory;    // Riwayat beasiswa yang pernah diterima mahasiswa

  // Konstruktor tanpa parameter (default constructor)
  // Digunakan untuk membuat objek StudentRecord dengan nilai default
  public StudentRecord() {
    this.name = "John Doe";                    // Nilai default nama
    this.studentId = "123456";                 // Nilai default student ID
    this.major = "Computer Science";           // Nilai default jurusan
    this.faculty = "Engineering";              // Nilai default fakultas
    this.semesterGPA = 3.5;                    // Nilai default IP Semester
    this.cumulativeGPA = 3.6;                  // Nilai default IP Kumulatif
    this.scholarshipHistory = "KKB Scholarship"; // Nilai default riwayat beasiswa
  }

  // Konstruktor dengan parameter
  // Digunakan untuk membuat objek StudentRecord dengan nilai yang ditentukan saat instansiasi
  public StudentRecord(String name, String studentId, String major, String faculty, double semesterGPA,
      double cumulativeGPA, String scholarshipHistory) {
    this.name = name;                         // Mengisi atribut name dengan parameter name
    this.studentId = studentId;               // Mengisi atribut studentId
    this.major = major;                       // Mengisi atribut major
    this.faculty = faculty;                   // Mengisi atribut faculty
    this.semesterGPA = semesterGPA;           // Mengisi atribut semesterGPA
    this.cumulativeGPA = cumulativeGPA;       // Mengisi atribut cumulativeGPA
    this.scholarshipHistory = scholarshipHistory; // Mengisi atribut scholarshipHistory
  }

  // Method display tanpa parameter
  // Menampilkan informasi dasar mahasiswa (tanpa IPS/IPK dan beasiswa)
  public void display() {
    System.out.println("Name: " + name);
    System.out.println("Student ID: " + studentId);
    System.out.println("Major: " + major);
    System.out.println("Faculty: " + faculty);
  }

  // Overload method display dengan parameter
  // Menampilkan data dasar + parameter IPS, IPK, dan beasiswa
  // Tidak menggunakan nilai dari atribut instance, tapi dari parameter yang dikirimkan
  public void display(double semesterGPA, double cumulativeGPA, String scholarshipHistory) {
    System.out.println("Name: " + name);
    System.out.println("Student ID: " + studentId);
    System.out.println("Major: " + major);
    System.out.println("Faculty: " + faculty);
    System.out.println("Semester GPA: " + semesterGPA);
    System.out.println("Cumulative GPA: " + cumulativeGPA);
    System.out.println("Scholarship History: " + scholarshipHistory);
  }

  // Method displayAll
  // Menampilkan semua informasi mahasiswa menggunakan nilai atribut instance
  public void displayAll() {
    System.out.println("Name: " + name);
    System.out.println("Student ID: " + studentId);
    System.out.println("Major: " + major);
    System.out.println("Faculty: " + faculty);
    System.out.println("Semester GPA: " + semesterGPA);
    System.out.println("Cumulative GPA: " + cumulativeGPA);
    System.out.println("Scholarship History: " + scholarshipHistory);
  }

}

```
