package junitpractice;

public class DivideMethod {
  public static void main(String[] args) {
    double a = 1;
    double b = 3;
    double result = divide(a, b);

    System.out.println("%s / %s = %s"
        .formatted(a, b, result));
  }

  public static double divide(double a, double b) {
    return a / b;
  }
}
