package Payment;

public interface Payment {

    public void pay(int amount); // 결제 기능
    String getPaymentType(); // 결제 수단

    // 신용카드 결제
    class CreditCard implements Payment {

        @Override
        public void pay(int amount){
            System.out.println(amount + "원 결제 완료");
        }

        @Override
        public String getPaymentType(){
            return "Credit Card"; //문자열 반환
        }

    }


    // 간편결제 - kakao pay
    class KakaoPay implements Payment {

        @Override
        public void pay(int amount){
            System.out.println(amount + "원 카카오페이 결제 완료");
        }

        @Override
        public String getPaymentType(){
            return "Kakao Pay";
        }
    }

}
