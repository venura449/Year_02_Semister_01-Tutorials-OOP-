import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    System.out.print("Enter the String :");
    String name = sc1.nextLine();
    char name1[] = name.toCharArray();

    int size = name.length();

    for (int i = 0; i < size/2; i++) {
      char swap = name1[i];
      name1[i] = name1[(size - 1) - i];
      name1[(size - 1) - i] = swap;
    }
    String s1 = new String(name1);

    System.out.println(s1);

  }
}
