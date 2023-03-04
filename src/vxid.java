import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class vxid extends JFrame{
    private JPanel panelvx;
    private JTextField TextField;
    private JPasswordField PasswordField;
    private JButton Button;
    private JButton Button2;
    private ArrayList<String> myarraylist = new ArrayList<String>(); //Тимчасовий список
    private ArrayList<String> password = new ArrayList<String>();
    public vxid(){
        this.getContentPane().add(panelvx);
        this.Button2.addActionListener(new MyButtn());
        this.Button.addActionListener(new MyButtn2());
        myarraylist.add("alex");
        password.add("root");
    }
    private class MyButtn implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    private class MyButtn2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String f = new String(PasswordField.getPassword());
            if ( myarraylist.contains(TextField.getText()) &&password.contains(f)){
                System.out.print("ok");
            } else {
                JOptionPane.showMessageDialog(panelvx,"Не вірний логін або пароль!");
            }
        }
    }
}
