package practicums.object_oriented.programs;

public class Practicum2 {
  public static void main(String[] args) {
    System.out.println("=Quadratic equation=");
    quadraticEquation();

    System.out.println("\n");
    System.out.println("=Gravitational force=");
    gravitationalForce();

    System.out.println("\n");
    System.out.println("=Volue of ball=");
    ballVolume();

    System.out.println("\n");
    System.out.println("=Bacteria growth=");
    bacteriaGrowth();
  }

  public static void quadraticEquation() {
    int a = 2, b = 4, c = -18;
    double equationOne, equationTwo;

    // calculate the equation
    // (-b +- sqrt(b^2 - 4ac)) / 2a
    equationOne = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    equationTwo = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    // print to console
    System.out.println("Equation one = " + equationOne);
    System.out.println("Equation two = " + equationTwo);
  }

  public static void gravitationalForce() {
    final double GRAVITY = 6.674E-11;
    double mass1 = 40, mass2 = 30;
    double radius = 2;
    double force;

    // calculate the force
    // F = G * m1 * m2 / r^2
    force = GRAVITY * mass1 * mass2 / Math.pow(radius, 2);
    // print to console
    System.out.println("Force = " + force);
  }

  public static void ballVolume() {
    double radius = 7.5;
    double volume;

    // calculate the volume
    // V = 4/3 * pi * r^3

    // using (float) will cause the result to be rounded after 6 decimal point
    // (float) 4 / 3 => 1.3333334
    // (double) 4 / 3 => 1.3333333333333333
    volume = ((double) (4 / 3)) * Math.PI * Math.pow(radius, 3);
    // print to console
    System.out.println("Volume = " + volume);
  }

  public static void bacteriaGrowth() {
    final int early_population = 150000;
    double time = 10; // in hours
    double growth;

    // calculate the growth using exponents
    // N = N0 * e^(k * t)
    growth = (int) (early_population * Math.pow(Math.E, 0.5 * time));
    // print to console
    System.out.println("Early population = " + early_population);
    System.out.println("Final population = " + growth);
  }
}
