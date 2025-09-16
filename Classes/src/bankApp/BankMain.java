package bankApp;

public class BankMain {
    public static void main(String[] args) {
        // 은행계좌 저장 배열 선언
        Account[] accounts = new Account[3];

        // 계좌 인스턴스 생성
        accounts[0] = new Account("11-2222-3333", "Ash", 3000000);
        accounts[1] = new Account("11-2222-4444", "Ray", 000000);
        accounts[2] = new Account("11-2222-5555", "Jin", 2000000);

        // 입금
         accounts[0].deposit(10000);
         accounts[1].deposit(20000);

         //춫금
        accounts[1].withdraw(5000);

         //출력
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].displayInfo();
            accounts[i].getTransactionHistory();
        }

    }
}
