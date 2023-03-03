import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vxid extends JFrame{
    private JPanel panelvx;
    private JTextField TextField;
    private JPasswordField PasswordField;
    private JButton Button;
    private JButton Button2;

    public vxid(){
        this.getContentPane().add(panelvx);
        this.Button2.addActionListener(new MyButtn());
    }
    private class MyButtn implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
