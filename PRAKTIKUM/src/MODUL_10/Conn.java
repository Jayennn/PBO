package MODUL_10;

// Import statement untuk kelas-kelas yang diperlukan
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Kelas Conn digunakan untuk mengatur koneksi ke database MySQL
public class Conn {

  // Variabel statis untuk menyimpan objek koneksi
  private static Connection mysqlconfig;

  // Method statis untuk mendapatkan koneksi database
  public static Connection db() throws SQLException {
    try {
      // Memuat (load) driver JDBC MySQL
      Class.forName("com.mysql.cj.jdbc.Driver");

      // URL koneksi ke database (ganti 'db_mahasiswa' jika nama DB kamu beda)
      String url = "jdbc:mysql://localhost:3306/db_mahasiswa";
      // Username untuk login ke MySQL (ganti jika kamu pakai user lain)
      String user = "root";
      // Password MySQL (kosongkan kalau tidak pakai password)
      String password = "root";

      // Membuat koneksi ke database
      mysqlconfig = DriverManager.getConnection(url, user, password);
      System.out.println("Koneksi Berhasil"); // Tampilkan pesan jika berhasil

    } catch (SQLException e) {
      // Menangani kesalahan koneksi database
      System.err.println("Koneksi Gagal: " + e.getMessage());
    } catch (ClassNotFoundException e) {
      // Menangani jika driver JDBC tidak ditemukan
      System.err.println("Driver tidak ditemukan: " + e.getMessage());
    }

    // Mengembalikan objek koneksi
    return mysqlconfig;
  }
}
