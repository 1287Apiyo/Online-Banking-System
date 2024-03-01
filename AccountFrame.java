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


//adding components to the frame
        //1-lables
        accnNoLBL=new JLabel("Account No.");
        ownerLBL=new JLabel("Owner");
        balanceLBL=new JLabel("Balance");
        cityLBL=new JLabel("City");
        genderLBL=new JLabel("Gender");
        amountLBL=new JLabel("Amount");

        //2-text Fields
        accNoTXT=new JTextField();accNoTXT.setEnabled(false);
        ownerTXT=new JTextField();
        balanceTXT=new JTextField();balanceTXT.setEnabled(false);
        amountTXT=new JTextField();
        amountTXT.setPreferredSize(new Dimension(150,25));

        //comboBox

    }
    //Main method
    public static void main(String[] args) {
        AccountFrame af= new AccountFrame();
        af.setVisible(true);
        af.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
