import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    System.out.print("Enter Number for Calculate Factorial : ");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    if (number <= 0) {
      System.out.println("Please Enter Positive Number");
    } else {
      System.out.println(factorial(number));
    }
  }

  public static int factorial(int num) {
    int fac=1;
    for(int i = num;i>0;i--){
      fac *=i;
    }
    return fac;
  }
}
