package practice01_dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainClass {

    /*
    * TALK_T 테이블에 1행씩 삽입하시오
    * TALK_T 구조
    *   TALK_NO         NUMBER (PK)
    *   TALK_CONTENT    VARCHAR2(1000 BYTE)
    *   TALK_EDITOR     VARCHAR2(1000 BYTE)
    *   WRITTEN_AT      TIMESTAMP(* 현재 날짜/시간 : CURRENT_TIMESTAMP)
    *
    *   TALK_SEQ 존재함
    *
    *   DB 서버 환경
    *   192.168.0.214
    *   GD/1111
    */

    public static void method1(){

      try {
          Class.forName("oracle.jdbc.OracleDriver");
          System.out.println("oracle.jdbc.OracleDriver 클래스가 메모리에 로드되었습니다.");
        } catch (Exception e) {
          System.out.println("oracle.jdbc.OracleDriver 클래스를 찾을 수 없습니다.");
        }

       // 접속을 위해서 필요한 정보(주소, 계정정보)
    String url = "jdbc:oracle:thin:@192.168.0.214";
    String user = "GD";
    String password = "1111";

    // Connection 객체 선언
    Connection con = null;
    PreparedStatement ps = null;

    try {

      // Connection 객체 생성
      con = DriverManager.getConnection(url, user, password);
      System.out.println("데이터베이스에 접속되었습니다.");

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      // Connection 객체 닫기
      try {
        if(con != null)
          con.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    try {

      // oracle.jdbc.OracleDriver 클래스 로드
      Class.forName("oracle.jdbc.OracleDriver");

      // 데이터베이스 접속 정보
       url = System.getProperty("jdbc.url");
       user = System.getProperty("jdbc.user");
       password = System.getProperty("jdbc.password");

      // Connection 객체 생성
      con = DriverManager.getConnection(url, user, password);

      // 쿼리문
      String sql = "INSERT INTO TALK_T(TALK_NO, TALK_CONTENT, TALK_EDITOR, WRITTEN_AT) VALUES(SAMPLE_SEQ.NEXTVAL, 'HELLO WORLD', '이지희', CURRENT_TIMESTAMP)";

      // PreparedStatement 객체 생성
      ps = con.prepareStatement(sql);

      // 쿼리문 실행. 삽입된 행의 개수가 반환됨.
      int result = ps.executeUpdate();
      System.out.println(result + " 행 이(가) 삽입되었습니다.");

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      // Connection, PreparedStatement 객체 닫기(반환)
      try {
        if(con != null) con.close();
        if(ps != null)  ps.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    }

    public static void main(String[] args) {
        method1();
    }
}
