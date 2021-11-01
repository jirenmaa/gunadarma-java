package Practicum;

public class PracticumTwo {
  public static void main(String[] args) {
    PersamaanKuadrat();
    GayaGravitasi();
    VolumeBola();
    Eksponensial();
  }

  public static void PersamaanKuadrat() {
    int a = 2, b = 4, c = -18;
    double equationOne, equationTwo;

    // calculate the equation
    // (-b +- sqrt(b^2 - 4ac)) / 2a
    equationOne = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    equationTwo = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

    // print to console
    System.out.println("x1 = " + equationOne);
    System.out.println("x2 = " + equationTwo);
  }

  public static void GayaGravitasi() {
    final double GRAVITASI = 6.674E-11; // Konstanta gravitasi
    double m1 = 40, m2 = 30;            // Massa objek 1 dan objek 2
    double r = 2;                       // Jarak antara objek 1 dan objek 2
    double force;                       // Gaya tarik gravitasi

    // calculate force
    // F = G * m1 * m2 / r^2
    force = GRAVITASI * m1 * m2 / Math.pow(r, 2);
    // print to console
    System.out.println("F = " + force);
  }

  public static void VolumeBola() {
    final double PI = Math.PI;
    double r = 7.5;
    double volume;

    // calculate volume
    // V = 4/3 * PI * r^3

    // use double for (4/3) to avoid integer division
    // using (float) will cause the result to be rounded
    volume = (double) 4/3 * PI * Math.pow(r, 3);
    // print to console
    System.out.println("Volume bola = " + volume);
  }

  public static void Eksponensial() {
    int populasiAwal = 150000;
    int time = 10;
    int populasiAkhir;

    // calculate population
    // n = n0 * e^(0.5t)

    // math `e` constant for exponent using java Math.E
    populasiAkhir = (int) (populasiAwal * Math.pow(Math.E, 0.5 * time));
    // print to console
    System.out.println("Populasi awal = " + populasiAwal);
    System.out.println("Populasi akhir = " + populasiAkhir);
  }
}
