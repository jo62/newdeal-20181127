package bitcamp.newdeal.lms;

import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    final int DEFAULT_SIZE = 20;
    int[] no = new int[DEFAULT_SIZE];
    String[] content = new String[DEFAULT_SIZE];

    int len = 0;

    Scanner keyIn = new Scanner(System.in);

    for (int i = 0; i < DEFAULT_SIZE; i++) {
      System.out.println("번호?");
      no[i] = Integer.parseInt(keyIn.nextLine());

      System.out.println("내용?");
      content[i] = keyIn.nextLine();

      len++;

      System.out.print("계속하시겠습니까?(Y/n)");
      String input = keyIn.nextLine();
      if (input.equals("") || input.equalsIgnoreCase("y")) {
        continue;
      }
      break;

    }

    keyIn.close();

    for (int i = 0; i < len; i++) {
      System.out.printf("%d, %s, 2019-01-01, 0\n",
          no[i], content[i]);
    }
  }
}
