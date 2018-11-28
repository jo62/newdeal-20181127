package bitcamp.newdeal.lms;

import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
    final int DEFAULT_SIZE = 20;
    int[] no = new int[DEFAULT_SIZE];
    String[] name = new String[DEFAULT_SIZE];
    String[] email = new String[DEFAULT_SIZE];
    String[] password = new String[DEFAULT_SIZE];
    String[] photo = new String[DEFAULT_SIZE];
    String[] tel = new String[DEFAULT_SIZE];

    int len = 0;

    Scanner keyIn = new Scanner(System.in);

    for (int i = 0; i < DEFAULT_SIZE; i++) {
      System.out.println("번호?");
      no[i] = Integer.parseInt(keyIn.nextLine());

      System.out.println("이름?");
      name[i] = keyIn.nextLine();

      System.out.println("이메일?");
      email[i] = keyIn.nextLine();

      System.out.println("암호?");
      password[i] = keyIn.nextLine();

      System.out.println("사진?");
      photo[i] = keyIn.nextLine();

      System.out.println("전화?");
      tel[i] = keyIn.nextLine();

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
      System.out.printf("%d, %s, %s, %s, 2019-01-01\n",
          no[i], name[i], email[i], tel[i]);
    }
  }
}
