package MODUL_9;

import java.awt.BorderLayout;

import javax.swing.*;
import java.awt.*;

public class Calculator extends javax.swing.JFrame {

  private JTextField display;
  private String number = "";
  private String operator = "";
  private double num1 = 0, num2 = 0, result = 0;

  private void jButton0MouseClicked(java.awt.event.MouseEvent evt) {
    // TODO add your handling code here:

    number += "0";

    display.setText(number);
  }

  private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
    // TODO add your handling code here:
    number += "1";
    display.setText(number);
  }

  private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {
    // TODO add your handling code here:
    number += "2";
    display.setText(number);
  }

  private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {
    // TODO add your handling code here:
    number += "3";
    display.setText(number);
  }

  private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {
    // TODO add your handling code here:
    number += "4";
    display.setText(number);
  }

  private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {
    // TODO add your handling code here:
    number += "5";
    display.setText(number);
  }

  private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {
    // TODO add your handling code here:
    number += "6";
    display.setText(number);
  }

  private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {
    // TODO add your handling code here:
    number += "7";
    display.setText(number);
  }

  private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {
    // TODO add your handling code here:
    number += "8";
    display.setText(number);
  }

  private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {
    // TODO add your handling code here:
    number += "9";
    display.setText(number);
  }

  private void jButtonDotMouseClicked(java.awt.event.MouseEvent evt) {
    // TODO add your handling code here:
    if (!number.contains(".")) {
      number += ".";
      display.setText(number);
    }
  }

  private void jButtonPlusMouseClicked(java.awt.event.MouseEvent evt) {
    // TODO add your handling code here:
    try {
      num1 = Double.parseDouble(number);
      operator = "+";
      number = "";
      display.setText(number);
    } catch (NumberFormatException e) {
      display.setText("Error");
    }
  }

  private void jButtonMinusMouseClicked(java.awt.event.MouseEvent evt) {
    // TODO add your handling code here:
    try {
      num1 = Double.parseDouble(number);
      operator = "-";
      number = "";
      display.setText(number);
    } catch (NumberFormatException e) {
      display.setText("Error");
    }
  }

  private void jButtonMultiplyMouseClicked(java.awt.event.MouseEvent evt) {
    // TODO add your handling code here:
    try {
      num1 = Double.parseDouble(number);
      operator = "*";
      number = "";
      display.setText(number);
    } catch (NumberFormatException e) {
      display.setText("Error");
    }
  }

  private void jButtonDeleteMouseClicked(java.awt.event.MouseEvent evt) {
    // TODO add your handling code here:
    if (number.length() > 0) {
      number = number.substring(0, number.length() - 1);
      display.setText(number);
    }
  }

  private void jButtonDivisionMouseClicked(java.awt.event.MouseEvent evt) {
    // TODO add your handling code here:
    try {
      num1 = Double.parseDouble(number);
      operator = "/";
      number = "";
      display.setText(number);
    } catch (NumberFormatException e) {
      display.setText("Error");
    }
  }

  private void jButtonPercentMouseClicked(java.awt.event.MouseEvent evt) {
    // TODO add your handling code here:
    try {
      num1 = Double.parseDouble(number);
      operator = "%";
      number = "";
      display.setText(number);
    } catch (NumberFormatException e) {
      display.setText("Error");
    }
  }

  private void jButtonModulusMouseClicked(java.awt.event.MouseEvent evt) {
    // TODO add your handling code here:
    try {
      num1 = Double.parseDouble(number);
      operator = "mod";
      number = "";
      display.setText(number);
    } catch (NumberFormatException e) {
      display.setText("Error");
    }
  }

  private void jButtonSquareMouseClicked(java.awt.event.MouseEvent evt) {
    // TODO add your handling code here:
    try {
      num1 = Double.parseDouble(number);
      result = Math.pow(num1, 2);
      number = String.valueOf(result);
      display.setText(number);
    } catch (NumberFormatException e) {
      display.setText("Error");
    }
  }

  private void jButtonSquareRootMouseClicked(java.awt.event.MouseEvent evt) {
    // TODO add your handling code here:
    try {
      num1 = Double.parseDouble(number);
      if (num1 >= 0) {
        result = Math.sqrt(num1);
        number = String.valueOf(result);
        display.setText(number);
      } else {
        display.setText("Error");
      }
    } catch (NumberFormatException e) {
      display.setText("Error");
    }
  }

  private void jButtonCubeMouseClicked(java.awt.event.MouseEvent evt) {
    // TODO add your handling code here:
    try {
      num1 = Double.parseDouble(number);
      result = Math.pow(num1, 3);
      number = String.valueOf(result);
      display.setText(number);
    } catch (NumberFormatException e) {
      display.setText("Error");
    }
  }

  private void jButtonEqualMouseClicked(java.awt.event.MouseEvent evt) {
    try {
      num2 = Double.parseDouble(number);
      switch (operator) {
        case "+":
          result = num1 + num2;
          break;
        case "-":
          result = num1 - num2;
          break;
        case "*":
          result = num1 * num2;
          break;
        case "/":
          if (num2 != 0) {
            result = num1 / num2;
          } else {
            display.setText("Error");
            return;
          }
          break;
        case "%":
          result = num1 * num2 / 100;
          break;
        case "mod":
          if (num2 != 0) {
            result = num1 % num2;
          } else {
            display.setText("Error");
            return;
          }
          break;
        case "pow":
          result = Math.pow(num1, num2);
          break;
        case "sqrt":
          if (num1 >= 0) {
            result = Math.sqrt(num1);
          } else {
            display.setText("Error");
            return;
          }
          break;
        case "cube":
          result = Math.pow(num1, 3);
          break;
        case "square":
          result = Math.pow(num1, 2);
          break;
        default:
          display.setText("Error");
          return;
      }
      number = String.valueOf(result);
      display.setText(number);
    } catch (NumberFormatException e) {
      display.setText("Error");
    }
  }

  public void initComponents() {
    setTitle("Calculator");
    setSize(1000, 1200);
    setMinimumSize(new java.awt.Dimension(600, 800));
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    display = new JTextField();
    display.setEditable(false);
    display.setFont(new Font("Arial", Font.PLAIN, 36));
    display.setHorizontalAlignment(SwingConstants.RIGHT);
    add(display, BorderLayout.NORTH);

    JPanel buttonPanel = new JPanel(new GridLayout(6, 5, 5, 5));

    JButton buttonClear = new JButton("C");
    buttonClear.setFont(new Font("Arial", Font.PLAIN, 24));
    buttonClear.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        number = "";
        display.setText(number);
      }
    });
    buttonPanel.add(buttonClear);

    JButton buttonPercent = new JButton("%");
    buttonPercent.setFont(new Font("Arial", Font.PLAIN, 24));
    buttonPercent.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButtonPercentMouseClicked(evt);
      }
    });
    buttonPanel.add(buttonPercent);

    JButton buttonDelete = new JButton("DEL");
    buttonDelete.setFont(new Font("Arial", Font.PLAIN, 24));
    buttonDelete.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButtonDeleteMouseClicked(evt);
      }
    });
    buttonPanel.add(buttonDelete);

    JButton buttonDivision = new JButton("/");
    buttonDivision.setFont(new Font("Arial", Font.PLAIN, 24));
    buttonDivision.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButtonDivisionMouseClicked(evt);
      }
    });
    buttonPanel.add(buttonDivision);

    /* BUTTON 7 - 9 */

    JButton button7 = new JButton("7");
    button7.setFont(new Font("Arial", Font.PLAIN, 24));
    button7.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButton7MouseClicked(evt);
      }
    });
    buttonPanel.add(button7);

    JButton button8 = new JButton("8");
    button8.setFont(new Font("Arial", Font.PLAIN, 24));
    button8.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButton8MouseClicked(evt);
      }
    });
    buttonPanel.add(button8);

    JButton button9 = new JButton("9");
    button9.setFont(new Font("Arial", Font.PLAIN, 24));
    button9.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButton9MouseClicked(evt);
      }
    });
    buttonPanel.add(button9);

    JButton buttonMultiply = new JButton("*");
    buttonMultiply.setFont(new Font("Arial", Font.PLAIN, 24));
    buttonMultiply.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButtonMultiplyMouseClicked(evt);
      }
    });
    buttonPanel.add(buttonMultiply);

    /* BUTTON 4 - 6 */

    JButton button4 = new JButton("4");
    button4.setFont(new Font("Arial", Font.PLAIN, 24));
    button4.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButton4MouseClicked(evt);
      }
    });
    buttonPanel.add(button4);

    JButton button5 = new JButton("5");
    button5.setFont(new Font("Arial", Font.PLAIN, 24));
    button5.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButton5MouseClicked(evt);
      }
    });
    buttonPanel.add(button5);

    JButton button6 = new JButton("6");
    button6.setFont(new Font("Arial", Font.PLAIN, 24));
    button6.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButton6MouseClicked(evt);
      }
    });
    buttonPanel.add(button6);

    JButton buttonMinus = new JButton("-");
    buttonMinus.setFont(new Font("Arial", Font.PLAIN, 24));
    buttonMinus.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButtonMinusMouseClicked(evt);
      }
    });
    buttonPanel.add(buttonMinus);

    /* BUTTON 1 - 3 */

    JButton button1 = new JButton("1");
    button1.setFont(new Font("Arial", Font.PLAIN, 24));
    button1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButton1MouseClicked(evt);
      }
    });
    buttonPanel.add(button1);

    JButton button2 = new JButton("2");
    button2.setFont(new Font("Arial", Font.PLAIN, 24));
    button2.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButton2MouseClicked(evt);
      }
    });
    buttonPanel.add(button2);

    JButton button3 = new JButton("3");
    button3.setFont(new Font("Arial", Font.PLAIN, 24));
    button3.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButton3MouseClicked(evt);
      }
    });
    buttonPanel.add(button3);

    JButton buttonPlus = new JButton("+");
    buttonPlus.setFont(new Font("Arial", Font.PLAIN, 24));
    buttonPlus.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButtonPlusMouseClicked(evt);
      }
    });
    buttonPanel.add(buttonPlus);

    /* BUTTON BOTTOM */

    JButton button0 = new JButton("0");
    button0.setFont(new Font("Arial", Font.PLAIN, 24));
    button0.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButton0MouseClicked(evt);
      }
    });
    buttonPanel.add(button0);

    JButton buttonDot = new JButton(".");
    buttonDot.setFont(new Font("Arial", Font.PLAIN, 24));
    buttonDot.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButtonDotMouseClicked(evt);
      }
    });
    buttonPanel.add(buttonDot);

    JButton buttonEqual = new JButton("=");
    buttonEqual.setFont(new Font("Arial", Font.PLAIN, 24));
    buttonEqual.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButtonEqualMouseClicked(evt);
      }
    });
    buttonPanel.add(buttonEqual);

    JButton buttonMod = new JButton("mod");
    buttonMod.setFont(new Font("Arial", Font.PLAIN, 24));
    buttonMod.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButtonModulusMouseClicked(evt);
      }
    });
    buttonPanel.add(buttonMod);

    JButton buttonSquare = new JButton("x²");
    buttonSquare.setFont(new Font("Arial", Font.PLAIN, 24));
    buttonSquare.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButtonSquareMouseClicked(evt);
      }
    });
    buttonPanel.add(buttonSquare);

    JButton buttonSquareRoot = new JButton("√x");
    buttonSquareRoot.setFont(new Font("Arial", Font.PLAIN, 24));
    buttonSquareRoot.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButtonSquareRootMouseClicked(evt);
      }
    });
    buttonPanel.add(buttonSquareRoot);

    JButton buttonCube = new JButton("x³");
    buttonCube.setFont(new Font("Arial", Font.PLAIN, 24));
    buttonCube.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButtonCubeMouseClicked(evt);
      }
    });
    buttonPanel.add(buttonCube);

    add(buttonPanel, BorderLayout.CENTER);
    setVisible(true);

  }

  public Calculator() {
    initComponents();
  }

}
