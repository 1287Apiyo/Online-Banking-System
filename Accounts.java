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
    public Account(){

    }

    public Account(String owner, City city, char gender) {
        accNo=nextAccNO;
        nextAccNO +=10;
        this.owner = owner;
        this.city = city;
        this.gender = gender;
        balance=0.0;
        openDate=null;  //System.currentDate();
    }




    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
