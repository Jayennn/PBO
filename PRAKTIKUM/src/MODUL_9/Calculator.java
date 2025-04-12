package MODUL_9;

// Import library gui java.swing
import javax.swing.*;

// Import library gui java.awt
// Import semua library gui java.awt.*
import java.awt.*;

// Kelas utama Calculator yang merupakan turunan dari JFrame (GUI window)
public class Calculator extends javax.swing.JFrame {

  // Komponen utama dan variabel-variabel kalkulasi
  private JTextField display; // Menampilkan angka dan hasil
  private String number = ""; // Menyimpan input angka sementara
  private String operator = ""; // Menyimpan operator yang dipilih
  private double num1 = 0, num2 = 0, result = 0; // Operand dan hasil perhitungan

  // Method event handler untuk tombol 0 ketika ditekan
  private void jButton0MouseClicked(java.awt.event.MouseEvent evt) {
    // Menambahkan karakter 0 ke variable `number`
    number += "0";

    // menampilkan isi dari `number` ke layar kalkulator jTextField bernama display
    display.setText(number);
  }

  // Method event handler untuk tombol 1 ketika ditekan
  private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
    // Menambahkan karakter 1 ke variable `number`
    number += "1";

    // menampilkan isi dari `number` ke layar kalkulator jTextField bernama display
    display.setText(number);
  }

  // Method event handler untuk tombol 2 ketika ditekan
  private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {
    // Menambahkan karakter 2 ke variable `number`
    number += "2";

    // menampilkan isi dari `number` ke layar kalkulator jTextField bernama display
    display.setText(number);
  }

  // Method event handler untuk tombol angka 3
  private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {
    // Menambahkan angka "3" ke variabel `number`
    number += "3";
    // Menampilkan nilai `number` yang diperbarui ke layar kalkulator (JTextField
    // `display`)
    display.setText(number);
  }

  // Method event handler untuk tombol angka 4
  private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {
    // Menambahkan angka "4" ke variabel `number`
    number += "4";
    // Menampilkan nilai `number` yang diperbarui ke layar kalkulator (JTextField
    // `display`)
    display.setText(number);
  }

  // Method event handler untuk tombol angka 5
  private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {
    // Menambahkan angka "5" ke variabel `number`
    number += "5";
    // Menampilkan nilai `number` yang diperbarui ke layar kalkulator (JTextField
    // `display`)
    display.setText(number);
  }

  // Method event handler untuk tombol angka 6
  private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {
    // Menambahkan angka "6" ke variabel `number`
    number += "6";
    // Menampilkan nilai `number` yang diperbarui ke layar kalkulator (JTextField
    // `display`)
    display.setText(number);
  }

  // Method event handler untuk tombol angka 7
  private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {
    // Menambahkan angka "7" ke variabel `number`
    number += "7";
    // Menampilkan nilai `number` yang diperbarui ke layar kalkulator (JTextField
    // `display`)
    display.setText(number);
  }

  // Method event handler untuk tombol angka 8
  private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {
    // Menambahkan angka "8" ke variabel `number`
    number += "8";
    // Menampilkan nilai `number` yang diperbarui ke layar kalkulator (JTextField
    // `display`)
    display.setText(number);
  }

  // Method event handler untuk tombol angka 9
  private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {
    // Menambahkan angka "9" ke variabel `number`
    number += "9";
    // Menampilkan nilai `number` yang diperbarui ke layar kalkulator (JTextField
    // `display`)
    display.setText(number);
  }

  // Method event handler untuk tombol titik desimal
  private void jButtonDotMouseClicked(java.awt.event.MouseEvent evt) {
    // Memeriksa apakah `number` sudah mengandung titik desimal
    if (!number.contains(".")) {
      // Jika belum, tambahkan titik desimal ke `number`
      number += ".";
      // Perbarui tampilan layar kalkulator
      display.setText(number);
    }
  }

  // Method event handler untuk tombol tambah (+)
  private void jButtonPlusMouseClicked(java.awt.event.MouseEvent evt) {
    try {
      // Mengonversi nilai `number` menjadi angka dan menyimpannya di `num1`
      num1 = Double.parseDouble(number);
      // Menyimpan operator "+" untuk digunakan nanti
      operator = "+";
      // Mengosongkan `number` untuk input berikutnya
      number = "";
      // Membersihkan layar kalkulator
      display.setText(number);
    } catch (NumberFormatException e) {
      // Menampilkan pesan "Error" jika terjadi kesalahan konversi
      display.setText("Error");
    }
  }

  // Method event handler untuk tombol pengurangan (-)
  private void jButtonMinusMouseClicked(java.awt.event.MouseEvent evt) {
    try {
      // Mengonversi nilai `number` menjadi angka dan menyimpannya di `num1`
      num1 = Double.parseDouble(number);
      // Menyimpan operator "-" untuk digunakan nanti
      operator = "-";
      // Mengosongkan `number` untuk input berikutnya
      number = "";
      // Membersihkan layar kalkulator
      display.setText(number);
    } catch (NumberFormatException e) {
      // Menampilkan pesan "Error" jika terjadi kesalahan konversi
      display.setText("Error");
    }
  }

  // Method event handler untuk tombol perkalian (*)
  private void jButtonMultiplyMouseClicked(java.awt.event.MouseEvent evt) {
    try {
      // Mengonversi nilai `number` menjadi angka dan menyimpannya di `num1`
      num1 = Double.parseDouble(number);
      // Menyimpan operator "*" untuk digunakan nanti
      operator = "*";
      // Mengosongkan `number` untuk input berikutnya
      number = "";
      // Membersihkan layar kalkulator
      display.setText(number);
    } catch (NumberFormatException e) {
      // Menampilkan pesan "Error" jika terjadi kesalahan konversi
      display.setText("Error");
    }
  }

  // Method event handler untuk tombol hapus (DEL)
  private void jButtonDeleteMouseClicked(java.awt.event.MouseEvent evt) {
    // Memeriksa apakah `number` tidak kosong
    if (number.length() > 0) {
      // Menghapus karakter terakhir dari `number`
      number = number.substring(0, number.length() - 1);
      // Memperbarui tampilan layar kalkulator
      display.setText(number);
    }
  }

  // Method event handler untuk tombol pembagian (/)
  private void jButtonDivisionMouseClicked(java.awt.event.MouseEvent evt) {
    try {
      // Mengonversi nilai `number` menjadi angka dan menyimpannya di `num1`
      num1 = Double.parseDouble(number);
      // Menyimpan operator "/" untuk digunakan nanti
      operator = "/";
      // Mengosongkan `number` untuk input berikutnya
      number = "";
      // Membersihkan layar kalkulator
      display.setText(number);
    } catch (NumberFormatException e) {
      // Menampilkan pesan "Error" jika terjadi kesalahan konversi
      display.setText("Error");
    }
  }

  // Method event handler untuk tombol persen (%)
  private void jButtonPercentMouseClicked(java.awt.event.MouseEvent evt) {
    try {
      // Mengonversi nilai `number` menjadi angka dan menyimpannya di `num1`
      num1 = Double.parseDouble(number);
      // Menyimpan operator "%" untuk digunakan nanti
      operator = "%";

      // Memasukkan hasil pembagian dari `num1` dengan 100 ke dalam `result`
      result = num1 / 100;
      // Menyimpan hasil sebagai string di `number`
      number = String.valueOf(result);

      // Menampilkan hasil di layar kalkulator
      display.setText(number);

    } catch (NumberFormatException e) {
      // Menampilkan pesan "Error" jika terjadi kesalahan konversi
      display.setText("Error");
    }
  }

  // Method event handler untuk tombol modulus (mod)
  private void jButtonModulusMouseClicked(java.awt.event.MouseEvent evt) {
    try {
      // Mengonversi nilai `number` menjadi angka dan menyimpannya di `num1`
      num1 = Double.parseDouble(number);
      // Menyimpan operator "mod" untuk digunakan nanti
      operator = "mod";
      // Mengosongkan `number` untuk input berikutnya
      number = "";
      // Membersihkan layar kalkulator
      display.setText(number);
    } catch (NumberFormatException e) {
      // Menampilkan pesan "Error" jika terjadi kesalahan konversi
      display.setText("Error");
    }
  }

  // Method event handler untuk tombol pangkat kuadrat (x²)
  private void jButtonSquareMouseClicked(java.awt.event.MouseEvent evt) {
    try {
      // Mengonversi nilai `number` menjadi angka dan menyimpannya di `num1`
      num1 = Double.parseDouble(number);
      // Menghitung kuadrat dari `num1`
      result = Math.pow(num1, 2);
      // Menyimpan hasil sebagai string di `number`
      number = String.valueOf(result);
      // Menampilkan hasil di layar kalkulator
      display.setText(number);
    } catch (NumberFormatException e) {
      // Menampilkan pesan "Error" jika terjadi kesalahan konversi
      display.setText("Error");
    }
  }

  // Method event handler untuk tombol akar kuadrat (√)
  private void jButtonSquareRootMouseClicked(java.awt.event.MouseEvent evt) {
    try {
      // Mengonversi nilai `number` menjadi angka dan menyimpannya di `num1`
      num1 = Double.parseDouble(number);
      // Memeriksa apakah `num1` bernilai non-negatif
      if (num1 >= 0) {
        // Menghitung akar kuadrat dari `num1`
        result = Math.sqrt(num1);
        // Menyimpan hasil sebagai string di `number`
        number = String.valueOf(result);
        // Menampilkan hasil di layar kalkulator
        display.setText(number);
      } else {
        // Menampilkan pesan "Error" jika `num1` negatif
        display.setText("Error");
      }
    } catch (NumberFormatException e) {
      // Menampilkan pesan "Error" jika terjadi kesalahan konversi
      display.setText("Error");
    }
  }

  // Method event handler untuk tombol pangkat kubik (x³)
  private void jButtonCubeMouseClicked(java.awt.event.MouseEvent evt) {
    try {
      // Mengonversi nilai `number` menjadi angka dan menyimpannya di `num1`
      num1 = Double.parseDouble(number);
      // Menghitung pangkat tiga dari `num1`
      result = Math.pow(num1, 3);
      // Menyimpan hasil sebagai string di `number`
      number = String.valueOf(result);
      // Menampilkan hasil di layar kalkulator
      display.setText(number);
    } catch (NumberFormatException e) {
      // Menampilkan pesan "Error" jika terjadi kesalahan konversi
      display.setText("Error");
    }
  }

  // Method event handler untuk tombol "=" saat diklik
  private void jButtonEqualMouseClicked(java.awt.event.MouseEvent evt) {
    try {
      // Mengonversi string 'number' menjadi angka (double) dan menyimpannya sebagai
      // operand kedua
      num2 = Double.parseDouble(number);

      // Memproses operasi berdasarkan operator yang dipilih sebelumnya
      switch (operator) {
        case "+":
          // Penjumlahan num1 + num2
          result = num1 + num2;
          break;

        case "-":
          // Pengurangan num1 - num2
          result = num1 - num2;
          break;

        case "*":
          // Perkalian num1 * num2
          result = num1 * num2;
          break;

        case "/":
          // Pembagian num1 / num2, dicek dulu agar tidak membagi dengan nol
          if (num2 != 0) {
            result = num1 / num2;
          } else {
            // Jika num2 = 0, tampilkan error dan hentikan eksekusi
            display.setText("Error");
            return;
          }
          break;

        case "%":
          // Salah: ini menghitung persen dari num1 terhadap num2 (num1 * num2 / 100)
          // Tapi seringkali tombol % di kalkulator hanya memakai num1, seperti: 50% = 0.5
          // Koreksi: cukup bagi num1 dengan 100
          result = num1 / 100;
          break;

        case "mod":
          // Menghitung sisa bagi num1 % num2, dengan pengecekan agar num2 ≠ 0
          if (num2 != 0) {
            result = num1 % num2;
          } else {
            // Jika num2 = 0, tampilkan error
            display.setText("Error");
            return;
          }
          break;

        default:
          // Jika operator tidak dikenali, tampilkan error
          display.setText("Error");
          return;
      }

      // Konversi hasil operasi ke string dan simpan ke variabel 'number'
      number = String.valueOf(result);

      // Tampilkan hasil ke layar kalkulator
      display.setText(number);
    } catch (NumberFormatException e) {
      // Jika input bukan angka yang valid, tampilkan error
      display.setText("Error");
    }
  }

  public void initComponents() {
    // Mengatur judul jendela kalkulator
    setTitle("Calculator");
    // Mengatur ukuran awal jendela kalkulator
    setSize(1000, 1200);
    // Mengatur ukuran minimum jendela
    setMinimumSize(new java.awt.Dimension(600, 800));
    // Mengatur aksi ketika jendela ditutup (mengakhiri program)
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    // Menempatkan jendela di tengah layar saat aplikasi dijalankan
    setLocationRelativeTo(null);

    // Membuat field teks (layar kalkulator) untuk menampilkan angka & hasil
    display = new JTextField();
    // Layar tidak bisa diketik langsung
    display.setEditable(false);
    // Mengatur font layar kalkulator
    display.setFont(new Font("Arial", Font.PLAIN, 36));
    // Teks rata kanan (seperti kalkulator biasa)
    display.setHorizontalAlignment(SwingConstants.RIGHT);
    // Menempatkan layar kalkulator di atas (NORTH)
    add(display, BorderLayout.NORTH);

    // Membuat panel tombol dengan grid 6 baris, 5 kolom, dan jarak 5px
    JPanel buttonPanel = new JPanel(new GridLayout(6, 5, 5, 5));

    // === Tambahkan tombol satu per satu ke panel === //

    // Tombol C (Clear)
    JButton buttonClear = new JButton("C");
    // Mengatur font tombol
    buttonClear.setFont(new Font("Arial", Font.PLAIN, 24));
    // Menambahkan event handler untuk tombol C
    buttonClear.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        // Reset input
        number = "";
        // Mengosongkan layar kalkulator
        display.setText(number);
      }
    });
    // Menambahkan tombol C ke panel
    buttonPanel.add(buttonClear);

    // Tombol persen (%)
    JButton buttonPercent = new JButton("%");
    // Mengatur font tombol
    buttonPercent.setFont(new Font("Arial", Font.PLAIN, 24));
    // Menambahkan event handler untuk tombol %
    buttonPercent.addMouseListener(new java.awt.event.MouseAdapter() {
      // Ketika tombol % diklik
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        // Panggil handler %
        jButtonPercentMouseClicked(evt);
      }
    });
    // Menambahkan tombol % ke panel
    buttonPanel.add(buttonPercent);

    // Tombol DEL (hapus karakter terakhir)
    JButton buttonDelete = new JButton("DEL");
    // Mengatur font tombol
    buttonDelete.setFont(new Font("Arial", Font.PLAIN, 24));
    // Menambahkan event handler untuk tombol DEL
    buttonDelete.addMouseListener(new java.awt.event.MouseAdapter() {
      // Ketika tombol DEL diklik
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        // Panggil handler DEL
        jButtonDeleteMouseClicked(evt);
      }
    });
    // Menambahkan tombol DEL ke panel
    buttonPanel.add(buttonDelete);

    // Tombol pembagian
    JButton buttonDivision = new JButton("/");
    // Mengatur font tombol
    buttonDivision.setFont(new Font("Arial", Font.PLAIN, 24));
    // Menambahkan event handler untuk tombol /
    buttonDivision.addMouseListener(new java.awt.event.MouseAdapter() {
      // Ketika tombol / diklik
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        // Panggil handler /
        jButtonDivisionMouseClicked(evt);
      }
    });
    // Menambahkan tombol / ke panel
    buttonPanel.add(buttonDivision);

    // Tombol angka 7
    JButton button7 = new JButton("7");
    // Mengatur font tombol
    button7.setFont(new Font("Arial", Font.PLAIN, 24));
    // Menambahkan event handler untuk tombol 7
    button7.addMouseListener(new java.awt.event.MouseAdapter() {
      // Ketika tombol 7 diklik
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        // Panggil handler 7
        jButton7MouseClicked(evt);
      }
    });
    // Menambahkan tombol 7 ke panel
    buttonPanel.add(button7);

    // Tombol angka 8
    JButton button8 = new JButton("8");
    // Mengatur font tombol
    button8.setFont(new Font("Arial", Font.PLAIN, 24));
    // Menambahkan event handler untuk tombol 8
    button8.addMouseListener(new java.awt.event.MouseAdapter() {
      // Ketika tombol 8 diklik
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        // Panggil handler 8
        jButton8MouseClicked(evt);
      }
    });
    // Menambahkan tombol 8 ke panel
    buttonPanel.add(button8);

    // Tombol angka 9
    JButton button9 = new JButton("9");
    // Mengatur font tombol
    button9.setFont(new Font("Arial", Font.PLAIN, 24));
    // Menambahkan event handler untuk tombol 9
    button9.addMouseListener(new java.awt.event.MouseAdapter() {
      // Ketika tombol 9 diklik
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        // Panggil handler 9
        jButton9MouseClicked(evt);
      }
    });
    // Menambahkan tombol 9 ke panel
    buttonPanel.add(button9);

    // Tombol perkalian
    JButton buttonMultiply = new JButton("*");
    // Mengatur font tombol
    buttonMultiply.setFont(new Font("Arial", Font.PLAIN, 24));
    // Menambahkan event handler untuk tombol *
    buttonMultiply.addMouseListener(new java.awt.event.MouseAdapter() {
      // Ketika tombol * diklik
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        // Panggil handler *
        jButtonMultiplyMouseClicked(evt);
      }
    });
    // Menambahkan tombol * ke panel
    buttonPanel.add(buttonMultiply);

    // Tombol angka 4, 5, 6
    JButton button4 = new JButton("4");
    // Mengatur font tombol
    button4.setFont(new Font("Arial", Font.PLAIN, 24));
    // Menambahkan event handler untuk tombol 4
    button4.addMouseListener(new java.awt.event.MouseAdapter() {
      // Ketika tombol 4 diklik
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        // Panggil handler 4
        jButton4MouseClicked(evt);
      }
    });
    // Menambahkan tombol 4 ke panel
    buttonPanel.add(button4);

    // Tombol angka 5
    JButton button5 = new JButton("5");
    // Mengatur font tombol
    button5.setFont(new Font("Arial", Font.PLAIN, 24));
    // Menambahkan event handler untuk tombol 5
    button5.addMouseListener(new java.awt.event.MouseAdapter() {
      // Ketika tombol 5 diklik
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        // Panggil handler 5
        jButton5MouseClicked(evt);
      }
    });
    // Menambahkan tombol 5 ke panel
    buttonPanel.add(button5);

    // Tombol angka 6
    JButton button6 = new JButton("6");
    // Mengatur font tombol
    button6.setFont(new Font("Arial", Font.PLAIN, 24));
    // Menambahkan event handler untuk tombol 6
    button6.addMouseListener(new java.awt.event.MouseAdapter() {
      // Ketika tombol 6 diklik
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        // Panggil handler 6
        jButton6MouseClicked(evt);
      }
    });
    // Menambahkan tombol 6 ke panel
    buttonPanel.add(button6);

    // Tombol pengurangan
    JButton buttonMinus = new JButton("-");
    // Mengatur font tombol
    buttonMinus.setFont(new Font("Arial", Font.PLAIN, 24));
    // Menambahkan event handler untuk tombol -
    buttonMinus.addMouseListener(new java.awt.event.MouseAdapter() {
      // Ketika tombol - diklik
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        // Panggil handler -
        jButtonMinusMouseClicked(evt);
      }
    });
    // Menambahkan tombol - ke panel
    buttonPanel.add(buttonMinus);

    // Tombol angka 1
    JButton button1 = new JButton("1");
    // Mengatur font tombol
    button1.setFont(new Font("Arial", Font.PLAIN, 24));
    // Menambahkan event handler untuk tombol 1
    button1.addMouseListener(new java.awt.event.MouseAdapter() {
      // Ketika tombol 1 diklik
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        // Panggil handler 1
        jButton1MouseClicked(evt);
      }
    });
    // Menambahkan tombol 1 ke panel
    buttonPanel.add(button1);

    // Tombol angka 2
    JButton button2 = new JButton("2");
    // Mengatur font tombol
    button2.setFont(new Font("Arial", Font.PLAIN, 24));
    // Menambahkan event handler untuk tombol 2
    button2.addMouseListener(new java.awt.event.MouseAdapter() {
      // Ketika tombol 2 diklik
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        // Panggil handler 2
        jButton2MouseClicked(evt);
      }
    });
    // Menambahkan tombol 2 ke panel
    buttonPanel.add(button2);

    // Tombol angka 3
    JButton button3 = new JButton("3");
    // Mengatur font tombol
    button3.setFont(new Font("Arial", Font.PLAIN, 24));
    // Menambahkan event handler untuk tombol 3
    button3.addMouseListener(new java.awt.event.MouseAdapter() {
      // Ketika tombol 3 diklik
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        // Panggil handler 3
        jButton3MouseClicked(evt);
      }
    });
    // Menambahkan tombol 3 ke panel
    buttonPanel.add(button3);

    // Tombol penjumlahan
    JButton buttonPlus = new JButton("+");
    // Mengatur font tombol
    buttonPlus.setFont(new Font("Arial", Font.PLAIN, 24));
    // Menambahkan event handler untuk tombol +
    buttonPlus.addMouseListener(new java.awt.event.MouseAdapter() {
      // Ketika tombol + diklik
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        // Panggil handler +
        jButtonPlusMouseClicked(evt);
      }
    });
    buttonPanel.add(buttonPlus);

    // Tombol angka 0
    JButton button0 = new JButton("0");
    // Mengatur font tombol
    button0.setFont(new Font("Arial", Font.PLAIN, 24));
    // Menambahkan event handler untuk tombol 0
    button0.addMouseListener(new java.awt.event.MouseAdapter() {
      // Ketika tombol 0 diklik
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        // Panggil handler 0
        jButton0MouseClicked(evt);
      }
    });
    // Menambahkan tombol 0 ke panel
    buttonPanel.add(button0);

    // Tombol titik desimal
    JButton buttonDot = new JButton(".");
    // Mengatur font tombol
    buttonDot.setFont(new Font("Arial", Font.PLAIN, 24));
    // Menambahkan event handler untuk tombol titik desimal
    buttonDot.addMouseListener(new java.awt.event.MouseAdapter() {
      // Ketika tombol titik desimal diklik
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        // Panggil handler titik desimal
        jButtonDotMouseClicked(evt);
      }
    });
    // Menambahkan tombol titik desimal ke panel
    buttonPanel.add(buttonDot);

    // Tombol sama dengan
    JButton buttonEqual = new JButton("=");
    // Mengatur font tombol
    buttonEqual.setFont(new Font("Arial", Font.PLAIN, 24));
    // Menambahkan event handler untuk tombol =
    buttonEqual.addMouseListener(new java.awt.event.MouseAdapter() {
      // Ketika tombol = diklik
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        // Panggil handler =
        jButtonEqualMouseClicked(evt);
      }
    });
    // Menambahkan tombol = ke panel
    buttonPanel.add(buttonEqual);

    // Tombol modulus (sisa bagi)
    JButton buttonMod = new JButton("mod");
    // Mengatur font tombol
    buttonMod.setFont(new Font("Arial", Font.PLAIN, 24));
    // Menambahkan event handler untuk tombol mod
    buttonMod.addMouseListener(new java.awt.event.MouseAdapter() {
      // Ketika tombol mod diklik
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        // Panggil handler mod
        jButtonModulusMouseClicked(evt);
      }
    });
    buttonPanel.add(buttonMod);

    // Tombol kuadrat
    JButton buttonSquare = new JButton("x²");
    // Mengatur font tombol
    buttonSquare.setFont(new Font("Arial", Font.PLAIN, 24));
    // Menambahkan event handler untuk tombol x²
    buttonSquare.addMouseListener(new java.awt.event.MouseAdapter() {
      // Ketika tombol x² diklik
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        // Panggil handler x²
        jButtonSquareMouseClicked(evt);
      }
    });
    // Menambahkan tombol x² ke panel
    buttonPanel.add(buttonSquare);

    // Tombol akar kuadrat
    JButton buttonSquareRoot = new JButton("√x");
    // Mengatur font tombol
    buttonSquareRoot.setFont(new Font("Arial", Font.PLAIN, 24));
    // Menambahkan event handler untuk tombol √x
    buttonSquareRoot.addMouseListener(new java.awt.event.MouseAdapter() {
      // Ketika tombol √x diklik
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        // Panggil handler √x
        jButtonSquareRootMouseClicked(evt);
      }
    });
    // Menambahkan tombol √x ke panel
    buttonPanel.add(buttonSquareRoot);

    // Tombol pangkat tiga
    JButton buttonCube = new JButton("x³");
    // Mengatur font tombol
    buttonCube.setFont(new Font("Arial", Font.PLAIN, 24));
    // Menambahkan event handler untuk tombol x³
    buttonCube.addMouseListener(new java.awt.event.MouseAdapter() {
      // Ketika tombol x³ diklik
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        // Panggil handler x³
        jButtonCubeMouseClicked(evt);
      }
    });
    // Menambahkan tombol x³ ke panel
    buttonPanel.add(buttonCube);

    // Menambahkan panel tombol ke bagian tengah tampilan
    add(buttonPanel, BorderLayout.CENTER);
    // Menampilkan jendela
    setVisible(true);
  }

  // Konstruktor kalkulator
  public Calculator() {
    initComponents(); // Memanggil method untuk inisialisasi komponen GUI
  }

}