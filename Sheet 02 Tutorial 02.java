
class Point3D {
  float x;
  float y;
  float z;

  Point3D(float x, float y, float z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public float distance() {
    return (x * x) + (y * y) + (z * z);
  }
}

public class Main {

  public static void main(String[] args) {

    Point3D p1 = new Point3D(3, 4, 5);
    Point3D p2 = new Point3D(6, 7, 8);
    
    System.out.println(p1.distance());
    System.out.println(p2.distance());
  }
}
