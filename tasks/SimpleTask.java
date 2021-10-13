package tasks;

public class SimpleTask {
  public static void main(String[] args) {
    // call the methods

    triangleArea(7, 2);
    squareArea();
  }

  public static void triangleArea(float alas, float tinggi) {
    // calculate and print the area of a triangle
    // parameter: alas, length

    float luas = alas * tinggi / 2;
    System.out.println("Luas Segitiga : " + luas);
  }

  public static void squareArea() {
    // calculate and print the area of a square
    // without using parameter and use the local variable `sisi`

    int sisi = 5;
    int luas = sisi * sisi;
    System.out.println("Luas Persegi  : " + luas);
  }
}
