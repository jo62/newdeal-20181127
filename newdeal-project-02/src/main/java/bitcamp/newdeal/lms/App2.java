package bitcamp.newdeal.lms;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
       Scanner keyIn = new Scanner(System.in);
       
       System.out.println("번호?");
       int no = Integer.parseInt(keyIn.nextLine());
       
       System.out.println("이름?");
       String name = keyIn.nextLine();
       
       System.out.println("이메일?");
       String email = keyIn.nextLine();
       
       System.out.println("암호?");
       String password = keyIn.nextLine();
       
       System.out.println("사진?");
       String photo = keyIn.nextLine();
       
       System.out.println("전화?");
       String tel = keyIn.nextLine();
       
       keyIn.close();
       
       System.out.println("번호 : " + no);
       System.out.printf("이름 : %s\n", name);
       System.out.printf("이메일 : %s\n", email);
       System.out.printf("암호 : %s\n", password);
       System.out.printf("사진 : %s\n", photo);
       System.out.printf("전화 : %s\n", tel);
       System.out.println("가입일 : 2019-01-01");
    }
}
