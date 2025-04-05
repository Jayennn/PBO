package MODUL_10;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");

    new StudentRecord(); // Memanggil constructor StudentRecord

    // try {
    // Connection conn = Koneksi.configDB(); // Memanggil koneksi
    // if (conn != null) {
    // System.out.println("Database Terhubung");
    // } else {
    // System.out.println("Database Tidak Terhubung");
    // }
    // } catch (SQLException e) {
    // System.out.println("Error: " + e.getMessage());
    // }

  }
}
