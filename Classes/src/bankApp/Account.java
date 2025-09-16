package bankApp;

public class Account {

    private String accountNumber; // 계좌번호
    private String owner; // 예금주
    private int balance; // 잔고
    private Transaction[] transactions; // 거래내역
    private int transactionCount; // 현재 거래 횟수

    // 생성자
    public Account(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance; // 잔고 0으로 초기화
        transactions = new Transaction[100];
        this.transactionCount = 0;
    }

    // 거래 추가
    public void addTransaction(TransactionType type, int amount) {
        // 거래 인스턴스 1개 생성한 후 배열에 저장
        transactions[transactionCount] = new Transaction(type, amount);
        transactionCount++; // index + 1

    }

        // 입금기능
        public void deposit(int amount) {
            if (amount < 0) {
                System.out.println("유효한 금액을 입력해주세요");
            } else {
                balance += amount; // balance = balance +amount;
                System.out.println(accountNumber + "에 " + amount + "원이 입금되었습니다. 현재잔액: " + balance + "원");
                System.out.println("---------------");
            }
            addTransaction(TransactionType.입금, amount);
        }

        // 출금기능
        public void withdraw(int amount) {
        if (amount < 0) {
            System.out.println("유효 금액이 아닙니다.");
        }else if (amount > balance) {
            System.out.println("잔액부족");
        }else {
            balance -= amount;
            System.out.println(accountNumber + "에서 " + amount + "원 출금완료 현재잔액: " + balance + "원");
            System.out.println("---------------");
            }
            addTransaction(TransactionType.출금, amount);
        }

        // 계좌번호 출력
        public void displayInfo(){
            System.out.println(
                    "예금주: " + owner +
                    "\n계좌번호: " + accountNumber +
                    "\n계좌잔고: " + balance +
                            "\n -------------"
            );
        }

        // 거래내역 출력
    public void getTransactionHistory(){
        if (transactionCount == 0) {
            System.out.println("거래내역 없음");
        }

        // 거래내역
        for (int i = 0; i < transactionCount; i++) {
            //입금
            String typeStr = (transactions[i].transactionType == TransactionType.입금) ? "입금" : "출금";
            System.out.println(" | " + typeStr + " | "
            + transactions[i].amount + "원");
        }
        System.out.println("-------------");
    }
}
