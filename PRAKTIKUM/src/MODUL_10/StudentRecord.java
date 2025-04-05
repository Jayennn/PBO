package MODUL_10;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentRecord extends JFrame {

  private JTable table;
  private DefaultTableModel model;
  private JTextField nameField, nimField, addressField, phoneField;
  private JComboBox<String> majorComboBox;

  public StudentRecord() {
    initComponents();
  }

  private JTable loadTableComponent() {
    table = new JTable();
    table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
    table.setFont(new Font("Arial", Font.PLAIN, 12));
    table.setRowHeight(30);

    model = new DefaultTableModel();
    model.addColumn("NO");
    model.addColumn("Nama");
    model.addColumn("NIM");
    model.addColumn("Jurusan");
    model.addColumn("Alamat");
    model.addColumn("Phone");

    try {
      int no = 1;
      String sql = "SELECT * FROM mahasiswa";
      Connection conn = Koneksi.configDB();
      PreparedStatement pstmt = conn.prepareStatement(sql);
      java.sql.ResultSet rs = pstmt.executeQuery();

      while (rs.next()) {
        String name = rs.getString("nama");
        String nim = rs.getString("nim");
        String major = rs.getString("jurusan");
        String address = rs.getString("alamat");
        String phone = rs.getString("no_telpon");

        model.addRow(new Object[] { no++, name, nim, major, address, phone });
      }
      rs.close();
      pstmt.close();
      conn.close();

    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    table.setModel(model);
    return table;
  }

  private JPanel studentFormComponent() {
    JPanel formPanel = new JPanel(new GridLayout(6, 2, 10, 10)); // spacing antar komponen
    formPanel.setPreferredSize(new Dimension(600, 200));

    /* NAME */
    JLabel nameLabel = new JLabel("Name:");
    nameLabel.setFont(new Font("Arial", Font.BOLD, 12));

    /* NAMEFIELD */
    nameField = new JTextField();
    nameField.setFont(new Font("Arial", Font.PLAIN, 12));
    nameField.setPreferredSize(new Dimension(300, 40)); // lebar 300px, tinggi 40px

    /* NIM */
    JLabel nimLabel = new JLabel("NIM:");
    nimLabel.setFont(new Font("Arial", Font.BOLD, 12));

    /* NIMFIELD */
    nimField = new JTextField();
    nimField.setFont(new Font("Arial", Font.PLAIN, 12));
    nimField.setPreferredSize(new Dimension(300, 40)); // lebar 300px, tinggi 40px

    /* MAJOR */
    JLabel majorLabel = new JLabel("Major:");
    majorLabel.setFont(new Font("Arial", Font.BOLD, 12));

    /* MAJORFIELD */
    String[] majors = { "Teknik Informatika", "Sistem Informasi", "Teknik Komputer" };
    majorComboBox = new JComboBox<String>(majors);
    majorComboBox.setFont(new Font("Arial", Font.PLAIN, 12));
    majorComboBox.setPreferredSize(new Dimension(300, 40)); // lebar 300px, tinggi 40px

    /* ADDRESS */
    JLabel addressLabel = new JLabel("Address:");
    addressLabel.setFont(new Font("Arial", Font.BOLD, 12));

    /* ADDRESSFIELD */
    addressField = new JTextField();
    addressField.setFont(new Font("Arial", Font.PLAIN, 12));
    addressField.setPreferredSize(new Dimension(300, 40)); // lebar 300px, tinggi 40px

    /* PHONE */
    JLabel phoneLabel = new JLabel("Phone:");
    phoneLabel.setFont(new Font("Arial", Font.BOLD, 12));

    /* PHONEFIELD */
    phoneField = new JTextField();
    phoneField.setFont(new Font("Arial", Font.PLAIN, 12));
    phoneField.setPreferredSize(new Dimension(300, 40)); // lebar 300px, tinggi 40px

    formPanel.add(nameLabel);
    formPanel.add(nameField);
    formPanel.add(nimLabel);
    formPanel.add(nimField);
    formPanel.add(majorLabel);
    formPanel.add(majorComboBox);
    formPanel.add(addressLabel);
    formPanel.add(addressField);
    formPanel.add(phoneLabel);
    formPanel.add(phoneField);

    // Tambah panel luar untuk padding
    JPanel wrapperPanel = new JPanel(new BorderLayout());
    wrapperPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40)); // top, left, bottom, right
    wrapperPanel.add(formPanel, BorderLayout.CENTER);

    return wrapperPanel;
  }

  private JPanel buttonComponent() {
    JPanel buttonPanel = new JPanel(new GridLayout(4, 1, 10, 10));
    buttonPanel.setPreferredSize(new Dimension(150, 200));

    JButton addButton = new JButton("Tambah");
    // JButton editButton = new JButton("Edit");
    // JButton deleteButton = new JButton("Hapus");
    // JButton clearButton = new JButton("Clear");

    addButton.setFont(new Font("Arial", Font.PLAIN, 20));
    // editButton.setFont(new Font("Arial", Font.PLAIN, 20));
    // deleteButton.setFont(new Font("Arial", Font.PLAIN, 20));
    // clearButton.setFont(new Font("Arial", Font.PLAIN, 20));

    addButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          String name = nameField.getText();
          String nim = nimField.getText();
          String major = (String) majorComboBox.getSelectedItem();
          String address = addressField.getText();
          String phone = phoneField.getText();

          if (name.isEmpty() || nim.isEmpty() || address.isEmpty() || phone.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
          }

          String sql = "INSERT INTO mahasiswa (nama, nim, jurusan, alamat, no_telpon) VALUES (?, ?, ?, ?, ?)";
          Connection conn = Koneksi.configDB();
          PreparedStatement pstmt = conn.prepareStatement(sql);
          pstmt.setString(1, name);
          pstmt.setString(2, nim);
          pstmt.setString(3, major);
          pstmt.setString(4, address);
          pstmt.setString(5, phone);
          pstmt.executeUpdate();
          pstmt.close();
          conn.close();

          loadTableComponent(); // Refresh the table after adding data
          JOptionPane.showMessageDialog(null, "Data added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

          // Clear the input fields
          nameField.setText("");
          nimField.setText("");
          addressField.setText("");
          phoneField.setText("");

        } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
    });

    // deleteButton.addActionListener(new ActionListener() {
    // public void actionPerformed(ActionEvent e) {
    // int selectedRow = table.getSelectedRow();
    // if (selectedRow != -1) {
    // model.removeRow(selectedRow);
    // }
    // }
    // });

    // clearButton.addActionListener(new ActionListener() {
    // public void actionPerformed(ActionEvent e) {
    // nameField.setText("");
    // nimField.setText("");
    // addressField.setText("");
    // phoneField.setText("");
    // }
    // });

    buttonPanel.add(addButton);
    // buttonPanel.add(editButton);
    // buttonPanel.add(deleteButton);
    // buttonPanel.add(clearButton);

    return buttonPanel;
  }

  private void initComponents() {
    setTitle("Data Mahasiswa");
    setSize(1500, 1000);
    setMinimumSize(new Dimension(1000, 700));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new BorderLayout());

    JPanel topPanel = new JPanel(new BorderLayout());
    topPanel.add(studentFormComponent(), BorderLayout.CENTER);
    topPanel.add(buttonComponent(), BorderLayout.EAST);
    add(topPanel, BorderLayout.NORTH);

    JScrollPane scrollPane = new JScrollPane(loadTableComponent());
    scrollPane.setPreferredSize(new Dimension(1000, 400));
    add(scrollPane, BorderLayout.CENTER);

    setVisible(true);
  }

  public static void main(String[] args) {
    new StudentRecord();
  }
}
