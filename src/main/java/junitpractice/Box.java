package junitpractice;

public class Box {
  public static boolean isTwoObjectsqual(Box a, Box b) {
    return a.width == b.width && a.height == b.height;
  }

  private int width;
  private int height;

  public Box(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public Box(Box b) {
    width = b.width;
    height = b.height;
  }

  public boolean isEqual(Box b) {
    return width == b.width && height == b.height;
  }

  public Box duplicate() {
    return new Box(this);
  }

  public void display() {
    System.out.println("Width is %d and height is %d"
        .formatted(width, height));
  }
}
