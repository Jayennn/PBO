package MODUL_5;

public class StudentRecord {
    private String name;
    private String studentId;
    private String major;
    private String faculty;
    private double semesterGPA;
    private double cumulativeGPA;
    private String scholarshipHistory;

    
    public StudentRecord(){
        // Default Constructor
        this.name = "John Doe";
        this.studentId = "123456";
        this.major = "Computer Science";
        this.faculty = "Engineering";
        this.semesterGPA = 3.5;
        this.cumulativeGPA = 3.6;
        this.scholarshipHistory = "KNB Scholarship";
    }

    public StudentRecord(String name, String studentId, String major, String faculty, double semesterGPA, double cumulativeGPA, String scholarshipHistory) {
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

}