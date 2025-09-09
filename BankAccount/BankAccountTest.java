
package BankAccount;

public class BankAccountTest {

    public static void main(String[] args) {

        //생성자 호출 - 인스턴스 생성
        BankAccount account1 = new BankAccount();

        // 값 입력
        account1.setAno("11-22-3333");
        account1.setOwner("Ash");
        account1.setBalance(1000000);

        // 출력
        System.out.println("계좌번호: " + account1.getAno());
        System.out.println("예금주: " + account1.getOwner());
        System.out.println("남은 잔액: " + account1.getBalance());

    }

}
