import javax.swing.*;
import java.util.Set;
import java.util.TreeSet;

public class AccountFrame extends JFrame {

    //define the variables and labels
    JLabel accnNoLBL,ownerLBL,balanceLBL,cityLBL,genderLBL,amountLBL;
    JTextField accNoTXT,ownerTXT,balanceTXT,amountTXT;
    JComboBox<City>citiesCMB;
    JButton newBTN,saveBTN,showBTN,quitBTN,depositBTN,withdrawBTN;
    JRadioButton maleRDB,femaleRDB;
    ButtonGroup genderBTNGRP;

    JList<Accounts>accountsLST;
    JPanel p1,p2,p3,p4,p5;
    Set<Accounts>accountsSet=new TreeSet<>();
    Accounts acc,x;
    boolean newRec=true;

    //combobox data
    

}
