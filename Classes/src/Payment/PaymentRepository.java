package Payment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// 결제 내역 저장 Interface
public interface PaymentRepository {
    void save(String paymentType, int amount);
}

// 내역 저장(DB) 구현체
class DBPaymentRepository implements PaymentRepository {

    @Override
    public void save(String paymentType, int amount) {
        System.out.println("DB 저장 시도: " + paymentType + " - " + amount);

        // DB에 저장
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/javadbtest?serverTimezone=UTC",
                        "root",
                        "3575"
                );
                PreparedStatement pstmt = conn.prepareStatement(
                        "INSERT INTO payment(payment_type, payment_amount) VALUES(?, ?)"
                )
        ) {
            pstmt.setString(1, paymentType);
            pstmt.setInt(2, amount);
            pstmt.executeUpdate(); // commit 역할
            System.out.println("✅ DB 저장 완료");
        } catch (SQLException e) {
            System.out.println("❌ DB 저장 실패");
            e.printStackTrace();
        }
    }
}