# Pemrograman Berorientasi Objek

## Praktikum Modul 8

**Disusun oleh:**  
**Nama:** Gian Alharitz Ueldy Secondri  
**NIM:** 11241033

---

### Tugas dan Deskripsi Singkat

1. Buatlah program sederhana yang menerapkan **exception handling** :
   - `ArithmeticException`
   - `IndexOutOfBoundsException`

---

## Pembahasan

#### `ArithmeticExceptionExample.java`

```java
public class ArithmeticExceptionExample {
  public static void main(String[] args) {
    try {
      int a = 10;
      int b = 0;

      int c = a / b;

      System.out.println(c);
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
```

#### `IndexOutOfBoundsException.java`

```java
public class IndexOutOfBoundsException {
  public static void main(String[] args) {
    try {
      int[] arr = new int[5];
      arr[5] = 10;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
```
