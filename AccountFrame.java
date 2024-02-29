import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
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

    //combo box data
    DefaultComboBoxModel<City> citiesCMBMDL;
    DefaultListModel<Accounts>accountsLSTMDL;

    //Table data

    JTable table;
    DefaultTableModel tableModel;
    ArrayList<Transaction> translist =new ArrayList<>();


    public AccountFrame() {
        super("Accounts operations");
        setLayout(null);
        setSize(600,400);


    }
    //Main method
    public static void main(String[] args) {
        AccountFrame af= new AccountFrame();
        af.setVisible(true);
        af.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
