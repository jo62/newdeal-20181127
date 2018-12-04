//package com.eomcs.lms.handler;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.List;
//import java.util.Scanner;
//import org.mariadb.jdbc.Driver;
//import com.eomcs.lms.dao.BoardDao;
//import com.eomcs.lms.domain.Board;
//
//public class BoardListCommand implements Command {
//  
//  Scanner keyboard;
//  BoardDao boardDao;
//  
//  public BoardListCommand(Scanner keyboard, BoardDao boardDao) {
//    this.keyboard = keyboard;
//    this.boardDao = boardDao;
//  }
//  
//  public void execute() {
//    
// // MariaDB JDBC 드라이버(java.sql.Driver) 구현체를 로딩
//    try {
//      DriverManager.registerDriver(new Driver());
//    } catch (SQLException e1) {
//      // TODO Auto-generated catch block
//      e1.printStackTrace();
//    }
//    
//    try (Connection con = DriverManager.getConnection(
//        "jdbc:mariadb://localhost:3306/studydb", 
//        "study", "1111");
//        Statement stmt = con.createStatement();
//        ResultSet rs = stmt.executeQuery(
//            "select bno, cont, cdt, view from board");) {
//      BoardDao boardDao = new BoardDao();
//      List<Board> list = boardDao.findAll();
//      
//      for(Board board : list) {
//        System.out.printf("%3d, %-20s, %s, %d\n", 
//            board.getNo(), board.getContents(), 
//            board.getCreatedDate(), board.getViewCount());
//      }
//      
//      
//      // DBMS에 연결하기
//      
//      
//      // SQL 전송을 담당할 객체를 준비
//      
//      
//      // SQL을 서버에 전송 => 서버에서 결과를 가져올 일을 할 객체를 리턴
//      
//      
//      // dbms에서 한 개의 레코드를 가져온다.
//      while (rs.next()) {
//        System.out.printf("%3d, %-20s, %s, %d\n", 
//            rs.getInt("bno"), 
//            rs.getString("cont"), 
//            rs.getDate("cdt"), 
//            rs.getInt("view"));
//      }
//    
//    } catch (Exception e) {
//      e.printStackTrace();
//    } 
//  }
//}
