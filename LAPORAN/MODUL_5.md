# Pemrograman Berorientasi Objek

## Praktikum Modul 5

**Disusun oleh:**  
**Nama:** Gian Alharitz Ueldy Secondri  
**NIM:** 11241033

---

### Tugas dan Deskripsi Singkat

1. Buatlah program Java sederhana yang dapat menghitung perkalian dan pengurangan
   antara matriks X dan Y yang memiliki ordo 2x2. Gunakan switch-case dalam pemilihan
   perkalian dan pengurangan matriks.

---

## Pembahasan

#### `Main.java`

```java
public class Main {
  public static void main(String[] args) {
    StudentRecord student1 = new StudentRecord();
    System.out.println("=====================");

    student1.display();
    System.out.println("=====================");

    student1.display(3.5, 3.6, "KNB Scholarship");

    System.out.println("=====================");
    student1.displayAll();

    System.out.println("=====================");

  }
}
```

#### `StudentRecord.java`

```java
public class StudentRecord {
  private String name;
  private String studentId;
  private String major;
  private String faculty;
  private double semesterGPA;
  private double cumulativeGPA;
  private String scholarshipHistory;

  public StudentRecord() {
    // Default Constructor
    this.name = "John Doe";
    this.studentId = "123456";
    this.major = "Computer Science";
    this.faculty = "Engineering";
    this.semesterGPA = 3.5;
    this.cumulativeGPA = 3.6;
    this.scholarshipHistory = "KKB Scholarship";
  }

  public StudentRecord(String name, String studentId, String major, String faculty, double semesterGPA,
      double cumulativeGPA, String scholarshipHistory) {
    this.name = name;
    this.studentId = studentId;
    this.major = major;
    this.faculty = faculty;
    this.semesterGPA = semesterGPA;
    this.cumulativeGPA = cumulativeGPA;
    this.scholarshipHistory = scholarshipHistory;
  }

  public void display() {
    System.out.println("Name: " + name);
    System.out.println("Student ID: " + studentId);
    System.out.println("Major: " + major);
    System.out.println("Faculty: " + faculty);
  }

  public void display(double semesterGPA, double cumulativeGPA, String scholarshipHistory) {
    System.out.println("Name: " + name);
    System.out.println("Student ID: " + studentId);
    System.out.println("Major: " + major);
    System.out.println("Faculty: " + faculty);
    System.out.println("Semester GPA: " + semesterGPA);
    System.out.println("Cumulative GPA: " + cumulativeGPA);
    System.out.println("Scholarship History: " + scholarshipHistory);
  }

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
