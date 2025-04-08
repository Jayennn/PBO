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
public class Main {
  public static void main(String[] args) {
    // Create a Sphere object
    Shape sphere = new Sphere(5);
    System.out.println("Volume of Sphere: " + sphere.calculateVolume());

    // Create a Cuboid object
    Shape cuboid = new Cuboid(4, 5, 6);
    System.out.println("Volume of Cuboid: " + cuboid.calculateVolume());
  }
}
```

#### `Shape.java`

```java
public abstract class Shape {
  public abstract double calculateVolume();
}
```

#### `Bola.java`

```java
public class Sphere extends Shape {
  private double radius;

  public Sphere(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculateVolume() {
    return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
  }
}
```

#### `Balok.java`

```java
public class Cuboid extends Shape {
  private double length;
  private double width;
  private double height;

  public Cuboid(double length, double width, double height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  @Override
  public double calculateVolume() {
    return length * width * height;
  }
}
```

## Soal. 2

#### `Main.java`

```java
public class Main {

  public static void main(String[] args) {
    Biodata biodata = new Biodata("John Doe", "A11.2018.11111", "Computer Science", "Faculty of Computer Science",
        "Universitas Brawijaya", "Jl. Veteran No. 1", "jhondoe@gmail.com", "Software Engineer", "Ngoding",
        "Java, Python, Javascript", "Dicoding Certificate");

    System.out.println(biodata.getName());
    System.out.println(biodata.getStudentId());
    System.out.println(biodata.getMajor());
    System.out.println(biodata.getFaculty());
    System.out.println(biodata.getUniversity());
    System.out.println(biodata.getAddress());
    System.out.println(biodata.getEmail());
    System.out.println(biodata.getWork());
    System.out.println(biodata.getHobbies());
    System.out.println(biodata.getSkills());
    System.out.println(biodata.getAchievements());
  }
}
```

#### `Biodata.java`

```java
package MODUL_6.SOAL_2;

public class Biodata {
  private String name;
  private String studentId;
  private String major;
  private String faculty;
  private String university;
  private String address;
  private String email;
  private String work;
  private String hobbies;
  private String skills;
  private String achievements;

  public Biodata(String name, String studentId, String major, String faculty, String university, String address,
      String email, String work, String hobbies, String skills, String achievements) {
    this.name = name;
    this.studentId = studentId;
    this.major = major;
    this.faculty = faculty;
    this.university = university;
    this.address = address;
    this.email = email;
    this.work = work;
    this.hobbies = hobbies;
    this.skills = skills;
    this.achievements = achievements;
  }

  public String getName() {
    return this.name;
  }

  public String setName(String name) {
    return this.name = name;
  }

  public String getStudentId() {
    return this.studentId;
  }

  public String setStudentId(String studentId) {
    return this.studentId = studentId;
  }

  public String getMajor() {
    return this.major;
  }

  public String getFaculty() {
    return this.faculty;
  }

  public String setFaculty(String faculty) {
    return this.faculty = faculty;
  }

  public String getUniversity() {
    return this.university;
  }

  public String setUniversity(String university) {
    return this.university = university;
  }

  public String getAddress() {
    return this.address;
  }

  public String setAddress(String address) {
    return this.address = address;
  }

  public String getEmail() {
    return this.email;
  }

  public String setEmail(String email) {
    return this.email = email;
  }

  public String getWork() {
    return this.work;
  }

  public String setWork(String work) {
    return this.work = work;
  }

  public String getHobbies() {
    return this.hobbies;
  }

  public String setHobbies(String hobbies) {
    return this.hobbies = hobbies;
  }

  public String getSkills() {
    return this.skills;
  }

  public String setSkills(String skills) {
    return this.skills = skills;
  }

  public String getAchievements() {
    return this.achievements;
  }

  public String setAchivements(String achievements) {
    return this.achievements = achievements;
  }

}
```
