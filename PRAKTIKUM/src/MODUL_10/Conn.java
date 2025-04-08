package MODUL_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {

  private static Connection mysqlconfig;

  public static Connection db() throws SQLException {
    try {
      // Load MySQL JDBC Driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      String url = "jdbc:mysql://localhost:3306/db_mahasiswa"; // Sesuaikan nama database
      String user = "root"; // Sesuaikan dengan user MySQL
      String password = "root"; // Jika ada password, masukkan di sini

      mysqlconfig = DriverManager.getConnection(url, user, password);
      System.out.println("Koneksi Berhasil");

    } catch (SQLException e) {
      System.err.println("Koneksi Gagal: " + e.getMessage());
    } catch (ClassNotFoundException e) {
      System.err.println("Driver tidak ditemukan: " + e.getMessage());
    }

    return mysqlconfig;
  }
}
