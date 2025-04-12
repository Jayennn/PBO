package MODUL_6.SOAL_2;

/*
 * Kelas Biodata digunakan untuk menyimpan dan mengelola data pribadi seorang mahasiswa.
 * Mengimplementasikan encapsulation dengan proper access modifier dan method getter/setter standar.
 */
public class Biodata {
  // Deklarasi variabel instance (atribut kelas)
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

  /*
   * Konstruktor untuk inisialisasi objek Biodata dengan parameter lengkap.
   */
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

  // Name
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // Student ID
  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  // Major
  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  // Faculty
  public String getFaculty() {
    return faculty;
  }

  public void setFaculty(String faculty) {
    this.faculty = faculty;
  }

  // University
  public String getUniversity() {
    return university;
  }

  public void setUniversity(String university) {
    this.university = university;
  }

  // Address
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  // Email
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  // Work
  public String getWork() {
    return work;
  }

  public void setWork(String work) {
    this.work = work;
  }

  // Hobbies
  public String getHobbies() {
    return hobbies;
  }

  public void setHobbies(String hobbies) {
    this.hobbies = hobbies;
  }

  // Skills
  public String getSkills() {
    return skills;
  }

  public void setSkills(String skills) {
    this.skills = skills;
  }

  // Achievements
  public String getAchievements() {
    return achievements;
  }

  public void setAchievements(String achievements) {
    this.achievements = achievements;
  }
}