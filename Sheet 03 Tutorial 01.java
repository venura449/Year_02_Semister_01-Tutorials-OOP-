import java.util.Scanner;

class Student {
  float[] marks = new float[3];
  float Averange;
  String StuId;
  String StuName;

  Student() {
    for (int i = 0; i < 3; i++) {
      marks[i] = 0;
    }
  }

  public void calAvg() {
    float sum = 0;
    for (float i : marks) {
      sum += i;
    }
    Averange = sum / 3.0f;
  }

  public void setdetails(String id, String name, float[] marks) {
    StuId = id;
    StuName = name;
    this.marks = marks;
  }

  public void display() {
    System.out.println("\n\nStudent ID: " + StuId);
    System.out.println("Student Name: " + StuName);
    System.out.println("Average: " + Averange);
  }

}

public class Main {

  public static void main(String[] args) {
    float[] marks = new float[3];
    Student s1 = new Student();
    Scanner st1 = new Scanner(System.in);
    
    System.out.print("Enter Student Id of the Student :");
    String ID = st1.nextLine();
    System.out.print("Enter Student Name of the Student :");
    String Name = st1.nextLine();
    for (int i = 0; i < 3; i++) {
      System.out.print("Enter marks of subject " + (i + 1) + ":");
      marks[i] = st1.nextFloat();
    }
    
    s1.setdetails(ID, Name, marks);
    s1.calAvg();
    s1.display();
  }
}
