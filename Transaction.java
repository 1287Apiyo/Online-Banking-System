import java.io.Serializable;
import java.time.LocalDate;

public class Transaction implements Comparable<Transaction>, Serializable {

//defining the variables
    private static  int next=1;
    int trsNo;
    Accounts acc;
    LocalDate date;
    char operation;
    double amount;

    //let us now add a constructor


    public Transaction(Accounts acc, LocalDate date, char operation, double amount) {
        this.acc = acc;
        this.date = date;
        this.operation = operation;
        this.amount = amount;
        trsNo=next++;
    }

    @Override
    public int compareTo(Transaction o) {
        return this.trsNo-o.trsNo;
    }
    //to string()

    @Override
    public String toString() {
        return "Transaction{" +
                "trsNo=" + trsNo +
                ", acc=" + acc +
                ", date=" + date +
                ", operation=" + operation +
                ", amount=" + amount +
                '}';
    }
//adding getters..used to get  property
    public int getTrsNo() {
        return trsNo;
    }

    public Accounts getAcc() {
        return acc;
    }

    public LocalDate getDate() {
        return date;
    }

    public char getOperation() {
        return operation;
    }

    public double getAmount() {
        return amount;
    }
}
