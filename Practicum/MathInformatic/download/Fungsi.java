package Practicum.MathInformatic.download;

// Mengimpor java input ouput
import java.io.*;

// Nama class harus sama dengan nama file
public class Fungsi {
  // InputStreamReader dan input adalah objek yang kita butuhkan untuk mengambil
  // input dari keyboard
  private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    // Himpunan A
    // Tampilkan output ke user dengan menanyakan banyak anggota himpunan A
    System.out.print("Banyak himpunan 'A' = ");

    // Menginputkan jumlah anggota A yang diinginkan dan disimpan dalam variabel x
    int x = Integer.parseInt(input.readLine());
    int himpA[] = new int[x];
    for (int i = 0; i < x; i++) {
      // Berfungsi untuk menginputkan anggota A, baris ini akan berulang sesuai dengan
      // jumlah anggota yang telah diinputkan sebelumnya
      System.out.print("Elemen 'A' ke-" + (i + 1) + " : ");
      String a = input.readLine();
      himpA[i] = Integer.parseInt(a);
    }
    // Berfungsi mencetak himpunan A seperti A = {...,...,...}
    System.out.print("A = {");
    for (int i = 0; i < x; i++) {
      System.out.print(himpA[i]);
      if (i != x - 1) {
        System.out.print(",");
      }
    }
    System.out.println("}\n\n");

    // Himpunan B
    // Tampilkan output ke user dengan menanyakan banyak anggota himpunan B
    System.out.print("Banyak Himpunan 'B' = ");

    // Menginputkan jumlah anggota B yang diinginkan dan disimpan dalam variabel y
    int y = Integer.parseInt(input.readLine());
    int himpB[] = new int[y];
    for (int j = 0; j < y; j++) {
      // Menginputkan anggota B, baris ini akan berulang sesuai dengan jumlah anggota
      // yang telah diinputkan sebelumnya
      System.out.print("Elemen 'B' ke-" + (j + 1) + " : ");
      String b = input.readLine();
      himpB[j] = Integer.parseInt(b);
    }

    // Berfungsi mencetak himpunan B seperti B = {...,...,...}
    System.out.print("B = {");
    for (int j = 0; j < y; j++) {
      System.out.print(himpB[j]);
      if (j != y - 1) {
        System.out.print(",");
      }
    }
    System.out.println("}\n\n");

    // Himpunan C
    // Tampilkan output ke user dengan menanyakan banyak anggota himpunan C
    System.out.print("Banyak Himpunan 'C' = ");

    // Menginputkan jumlah anggota C yang diinginkan dan disimpan dalam variabel y
    int z = Integer.parseInt(input.readLine());
    int himpC[] = new int[z];
    for (int k = 0; k < z; k++) {
      // Menginputkan anggota C, baris ini akan berulang sesuai dengan jumlah anggota
      // yang telah diinputkan sebelumnya
      System.out.print("Elemen 'C' ke-" + (k + 1) + " : ");
      String c = input.readLine();
      himpC[k] = Integer.parseInt(c);
    }
    // Berfungsi mencetak himpunan C seperti C = {...,...,...}
    System.out.print("C = {");
    for (int k = 0; k < z; k++) {
      System.out.print(himpC[k]);
      if (k != z - 1) {
        System.out.print(",");
      }
    }
    System.out.println("}\n\n");

    // Fungsi
    // Mencetak Fungsi A ke B
    System.out.print("Fungsi A ke B adalah = {");
    if (x <= y) {
      for (int i = 0; i < x; i++) {
        for (int j = i; j <= i; j++) {
          System.out.print("(" + himpA[i] + "," + himpB[j] + ")");
          if (i != x - 1) {
            System.out.print(",");
          }
        }
      }
    } else {
      for (int i = 0; i < y; i++) {
        for (int j = i; j <= i; j++) {
          System.out.print("(" + himpA[i] + "," + himpB[j] + ")");
          System.out.print(",");
        }

      }
      for (int i = y; i < x; i++) {
        for (int j = (i - y); j <= (i - y); j++) {
          System.out.print("(" + himpA[i] + "," + himpB[j] + ")");
          if (i != x - 1) {
            System.out.print(",");
          }
        }

      }
    }
    System.out.println("}");

    // Invers
    // Mencetak Fungsi Invers dari fungsi A ke B
    System.out.print("Maka Invers dari fungsi di atas adalah = {");
    if (x <= y) {
      for (int i = 0; i < x; i++) {
        for (int j = i; j <= i; j++) {
          System.out.print("(" + himpB[j] + "," + himpA[i] + ")");
          if (i != x - 1) {
            System.out.print(",");
          }
        }
      }
    } else {
      for (int i = 0; i < y; i++) {
        for (int j = i; j <= i; j++) {
          System.out.print("(" + himpB[j] + "," + himpA[i] + ")");
          System.out.print(",");
        }

      }
      for (int i = y; i < x; i++) {
        for (int j = (i - y); j <= (i - y); j++) {
          System.out.print("(" + himpB[j] + "," + himpA[i] + ")");
          if (i != x - 1) {
            System.out.print(",");
          }
        }

      }
    }
    System.out.println("}\n");

    // Fungsi
    // Mencetak Fungsi B ke C
    System.out.print("Fungsi B ke C adalah = {");
    if (y <= z) {
      for (int j = 0; j < y; j++) {
        for (int k = j; k <= j; k++) {
          System.out.print("(" + himpB[j] + "," + himpC[k] + ")");
          if (j != y - 1) {
            System.out.print(",");
          }
        }
      }
    } else {
      for (int j = 0; j < z; j++) {
        for (int k = j; k <= j; k++) {
          System.out.print("(" + himpB[j] + "," + himpC[k] + ")");
          System.out.print(",");
        }

      }
      for (int j = z; j < y; j++) {
        for (int k = (j - z); k <= (j - z); k++) {
          System.out.print("(" + himpB[j] + "," + himpC[k] + ")");
          if (j != y - 1) {
            System.out.print(",");
          }
        }

      }
    }
    System.out.println("}");

    // Invers
    // Mencetak Fungsi Invers dari fungsi B ke C
    System.out.print("Maka Invers dari fungsi di atas adalah = {");
    if (y <= z) {
      for (int j = 0; j < y; j++) {
        for (int k = j; k <= j; k++) {
          System.out.print("(" + himpC[k] + "," + himpB[j] + ")");
          if (j != y - 1) {
            System.out.print(",");
          }
        }
      }
    } else {
      for (int j = 0; j < z; j++) {
        for (int k = j; k <= j; k++) {
          System.out.print("(" + himpC[k] + "," + himpB[j] + ")");
          System.out.print(",");
        }

      }
      for (int j = z; j < y; j++) {
        for (int k = (j - z); k <= (j - z); k++) {
          System.out.print("(" + himpC[k] + "," + himpB[j] + ")");
          if (j != z - 1) {
            System.out.print(",");
          }
        }

      }
    }
    System.out.println("}\n");

  }
}
