import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int sum = 0;
    int i = 1;
    Scanner sc1 = new Scanner(System.in);
    while (true) {

      System.out.print("Enter Number " + i + ": ");
      int choice = sc1.nextInt();
      if (choice < 0) {
        i--;
        break;
      } else {
        sum += choice;
        i++;
      }
    }
    System.out.println("Averange Of Numbers : " + (float) sum / i);
  }
}
