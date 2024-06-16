import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    System.out.print("Enter the number:");
    int number = sc1.nextInt();
    System.out.print("Enter How many Rows :");
    int rows = sc1.nextInt();

    for(int i = 1;i<=rows;i++){
      System.out.println(number +" x "+ i +" = "+ number*i);
    }
    
  }
}
