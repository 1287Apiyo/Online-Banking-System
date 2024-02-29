import java.util.Date;

public class Accounts implements Comparable{

//Variables
    static int nextAccNO =10; //class variable
    int accNo;
    String owner;
    City city;
    char gender;
    double balance;
    Date openDate;



    //let us now create the constructor
    public Accounts(){

    }


//constructors
    public Accounts(String owner, City city, char gender) {
        accNo=nextAccNO;
        nextAccNO +=10;
        this.owner = owner;
        this.city = city;
        this.gender = gender;
        balance=0.0;
        openDate=null;  //System.currentDate();


    }


    public Accounts(int accNo, String owner, City city, char gender, double balance) {
        this.accNo = accNo;
        this.owner = owner;
        this.city = city;
        this.gender = gender;
        setBalance(balance);
    }
    //setters
    public void setBalance(double b) {
        balance = b> 0.0 ? b: 0.0;
    }
//toString()
    @Override
    public String toString() {
        return accNo + " "+  owner +" " +city.cityName + " "
              + gender + " " + balance;

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
