package MODUL_6.SOAL_2;

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