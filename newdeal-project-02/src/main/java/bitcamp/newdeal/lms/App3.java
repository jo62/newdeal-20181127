package bitcamp.newdeal.lms;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
       Scanner keyIn = new Scanner(System.in);
       
       System.out.println("번호?");
       int no = Integer.parseInt(keyIn.nextLine());
       
       System.out.println("내용?");
       String content = keyIn.nextLine();
       
       keyIn.close();
       
       System.out.println("번호 : " + no);
       System.out.printf("이름 : %s\n", content);
       System.out.println("작성일 : 2019-01-01");
       System.out.println("조회수 : 0");
    }
}
