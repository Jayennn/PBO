package MODUL_9;


public class Calculator extends javax.swing.JFrame {
  
  String number = "";
  double num1, num2, result;
  int select;
  char operator;

  private javax.swing.JTextField jTextField1;
  private javax.swing.JButton jButton1; 
  

  private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
    String newValue;
    newValue = jTextField1.getText().substring(0, jTextField1.getText().length() - 1);
  }
}
