package Payment;

import java.util.regex.Pattern;

public class PaymentApp {

    public static void main(String[] args) {

        //저장소  인스턴스 생성
        PaymentRepository repo = new DBPaymentRepository();

        // 결제 수단 인스턴스 생성
        Payment card = new Payment.CreditCard();
        Payment kakao = new Payment.KakaoPay();

        // 결제 금액 설정
        int amount1 = 1000000;
        int amount2 = 700000;

        
        // 결제 진행
        card.pay(amount1);
        kakao.pay(amount2);

        System.out.println("-----------------------------");

        // DB 저장
        repo.save(card.getPaymentType(), amount1);
        repo.save(kakao.getPaymentType(), amount2);
    }

}
