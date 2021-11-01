package Practicum.MathInformatic.imported;

// Mengimpor Scanner ke program
import java.io.*;

// Nama class harus sama dengan nama file
public class Relasi {
  public static void main(String[] args) throws Exception {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    // Tampilkan output ke user dengan menanyakan anggota himpunan A ada berapa
    System.out.print("Masukkan banyaknya himpunan A : ");
    String s = input.readLine();
    int x = Integer.parseInt(s);
    int himpA[] = new int[x];
    for (int i = 0; i < x; i++) {
      // Menanyakan anggota himpunan A, inputan dari user
      System.out.print("Masukkan element himpunan A ke - " + (i + 1) + " :");
      String a = input.readLine();
      himpA[i] = Integer.parseInt(a);
    }
    System.out.print("A = {");
    for (int i = 0; i < x; i++) {
      System.out.print(himpA[i]);
      if (i != x - 1)
        System.out.print(",");
    }
    System.out.println("}");
    System.out.println();

    // Menampilkan output pilihan kepada user
    System.out.println("Jenis relasi");
    System.out.println("1. Reflektif Sederhana");
    System.out.println("2. Simetris Sederhana");
    System.out.println("3. Transitif Sederhana");
    System.out.print("Masukkan pilihan Anda : ");

    // Membaca input user untuk langkah selanjutnya yang user minta
    int d = Integer.parseInt(input.readLine());
    switch (d) {
    // Menampilkan pilihan 1 jika user input 1 yaitu menampilkan output reflektif
    case 1:
      System.out.print("Relasi R = { ");
      for (int i = 0; i < x; i++) {
        for (int j = 0; j < x; j++) {
          if (himpA[i] == himpA[j]) {
            System.out.print("(" + himpA[i] + "," + himpA[j] + ")");
            if (j != x - 1) {
              System.out.print(",");
            }
          }
        }
      }
      System.out.println("}");
      break;

    // Menampilkan pilihan 2 jika user input 2 yaitu menampilkan output simetris
    case 2:
      System.out.print("Relasi R = { ");
      for (int i = 0; i < x; i++) {
        for (int j = 0; j < x; j++) {
          if (himpA[i] != himpA[j]) {
            System.out.print("(" + himpA[i] + "," + himpA[j] + ")");
            if (j != x - 1) {
              System.out.print(",");
            }
          }
        }
      }
      System.out.println("}");
      break;

    // Menampilkan pilihan 3 jika user input 3 yaitu menampilkan output transitif
    case 3:
      System.out.print("Relasi R = { ");
      for (int i = 0; i < x; i++) {
        for (int j = 0; j < x; j++) {
          if (himpA[i] != himpA[j]) {
            if (i % 2 != 0) {
              if (j % 2 == 0) {
                System.out.print("(" + himpA[i] + "," + himpA[j] + ")");
                if (j != x - 1) {
                  System.out.print(",");
                }
              } else {
                if (j % 2 != 0) {
                  System.out.print("(" + himpA[i] + "," + himpA[j] + ")");
                  if (j != x - 1) {
                    System.out.print(",");
                  }
                }
              }
            }
          }
        }
      }
      System.out.println("}");
      break;

    // Menampilkan output jika user menginput angka pilihan selain 1,2,3
    default:
      System.out.print("pilihan tidak ada dalam daftar");
      break;
    }
  }
}
