package MODUL_7.SOAL_2;

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

  public Biodata(String name, String studentId, String major, String faculty, String university, String address, String email, String work, String hobbies, String skills, String achievements) {
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

  public String setWork(String work){
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
