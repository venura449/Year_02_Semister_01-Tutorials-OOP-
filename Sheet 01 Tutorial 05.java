import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    int count = 0;
    
    Scanner sc1 = new Scanner(System.in);
    System.out.print("Enter the String :");
    String name = sc1.nextLine();
    Scanner sc2 = new Scanner(System.in);
    System.out.print("Enter the Character :");
    char charcater = sc2.nextLine().charAt(0);
    char name1[] = name.toCharArray();

    for(int i = 0; i < name1.length; i++ ){
      if(name1[i] == charcater){
        count++;
      }
    }
    System.out.println("The Character "+charcater+" is present "+count+" times");
  }
}
