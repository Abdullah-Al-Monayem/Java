package gradingsystem;

public class Transaction {

    int transectionAmount;

    public Transaction() {
    }

    public Transaction(int transectionAmount) {
        this.transectionAmount = transectionAmount;
    }

    public int value() {

        return transectionAmount;

    }

    public int getTransectionAmount() {
        return transectionAmount;
    }

    public void setTransectionAmount(int transectionAmount) {
        this.transectionAmount = transectionAmount;
    }

}
