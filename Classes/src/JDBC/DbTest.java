package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbTest {

    public static void main(String[] args) {
        Connection conn = null;

        try {
            // MySQL 드라이버 로딩
            Class.forName("com.mysql.cj.jdbc.Driver");

            // DB 연결
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/javadbtest?serverTimezone=UTC",
                    "root",
                    "3575"
            );

            System.out.println("✅ DB 연결 성공!");

        } catch (ClassNotFoundException e) {
            System.out.println("❌ 드라이버 로딩 실패: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("❌ DB 연결 실패: " + e.getMessage());
        } finally { // 오류
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                    System.out.println("🔒 연결 종료");
                }
            } catch (SQLException e) {
                System.out.println("❌ 연결 종료 실패: " + e.getMessage());
            }
        }
    }
}