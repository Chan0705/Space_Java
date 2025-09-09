package BankAccount;

public class BankAccountTest2 {
    public static void main(String[] args) {
        // 은행 계좌 저장할 배열
        BankAccount[] accounts = new BankAccount[2];

        // 은행 계좌 인스턴스 생성
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        // BankAccount account3 = new BankAccount();


        // 정보 입력
        account1.setAno("11-22-3333");
        account1.setOwner("Ash");
        account1.setBalance(1000000);

        account2.setAno("11-22-3334");
        account2.setOwner("Ray");
        account2.setBalance(30000000);

        // 은행 계좌 인스턴스를 배열에 저장
        accounts[0] = account1;
        accounts[1] = account2;

        // 계좌정보 출력(반복문)
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("계좌번호: " + accounts[i].getAno());
            System.out.println("예금주: " + accounts[i].getOwner());
            System.out.println("통장 잔고: "+ accounts[i].getBalance());
        }
    }
}
