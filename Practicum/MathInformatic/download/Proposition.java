package Practicum.MathInformatic.download;
/*
    Program ini mendemonstrasikan operasi logika proporsional
    konjungsi, disjungsi, implikasi, dan biimplikasi
*/

// Mengimport input merupakan perintah untuk memasukan data dari peralatan input, sedangkan output merupakan perintah atau berfungsi menampilkan data kepada pengguna
import java.io.*;

// Nama class harus sama dengan nama file
public class Proposition {
  public static void main(String[] args) throws Exception {
    // Deklarasi variabel
    int p, q;
    int pil;

    // Fungsi dari BufferredReader ini adalah untuk menangkap inputan dari keyboard
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    // Menanyakan nilai p, input dari user
    System.out.print("Masukan nilai p (0/1) : ");
    p = Integer.parseInt(input.readLine());

    // Menanyakan nilai q, input dari user
    System.out.print("Masukan nilai q (0/1) : ");
    q = Integer.parseInt(input.readLine());
    if ((q > 1) || (p > 1)) {
      System.out.println("Maaf inputan Anda salah");
    } else {
      // Menampilkan pilihan menu kepada user untuk melakukan aksi
      System.out.println("1.       ^          ");
      System.out.println("2.       v          ");
      System.out.println("3.       ->         ");
      System.out.println("4.      <->         ");
      System.out.print("Masukkan pilihan operator Anda : ");
      pil = Integer.parseInt(input.readLine());

      switch (pil) {
      // Menampilkan perintah konjungsi jika user pilih 1
      case 1:
        if ((p == 1) && (q == 1)) {
          System.out.println(p + " ^ " + q + "= 1");

        } else {
          System.out.println(p + " ^ " + q + "= 0");

        }
        System.out.println("Ini adalah konjungsi");

        break;

      // Menampilkan perintah disjungsi jika user pilih 2
      case 2:
        if ((p == 0) && (q == 0)) {
          System.out.println(p + " v " + q + "= 0");

        } else {
          System.out.println(p + " v " + q + "= 1");

        }
        System.out.println("Ini adalah disjungsi");

        break;

      // Menampilkan perintah implikasi jika user pilih 3
      case 3:
        if ((p == 1) && (q == 0)) {
          System.out.println(p + " -> " + q + "= 0");

        } else {
          System.out.println(p + " -> " + q + "= 1");

        }
        System.out.println("Ini adalah implikasi ");

        break;

      // Menampilkan perintah biimplikasi jika user pilih 4
      case 4:
        if (((p == 1) && (q == 1)) || ((p == 0) && (q == 0))) {
          System.out.println(p + " <-> " + q + "= 1");

        } else {
          System.out.println(p + " <-> " + q + "= 0");

        }
        System.out.println("Ini adalah biimplikasi ");
        break;

      // Menampilkan jika user input selain 1,2,3,4
      default:
        System.out.println("Salah inputan");
        break;
      }
    }

  }
}
