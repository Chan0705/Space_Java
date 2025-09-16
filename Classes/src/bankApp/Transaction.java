package bankApp;

public class Transaction {

    TransactionType transactionType; // 거래 유형
    int amount; // 거래 금액

    public Transaction(TransactionType transactionType, int amount) {
        this.transactionType = transactionType;
        this.amount = amount;
    }
}
