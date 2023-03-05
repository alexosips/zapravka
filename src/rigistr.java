import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rigistr extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;
    private JButton button2;
    private JTextField textField4;
    private JPanel panel;
    private JLabel labelpassword2;
    private JLabel labelname;
    private JLabel labelemail;
    private JLabel labelpassword;
    private JLabel labeleroor;

    public rigistr(){
        this.getContentPane().add(panel);
        this.button1.addActionListener(new rigistr.MyButtn());
        this.button2.addActionListener(new rigistr.MyButtn2());
        labeleroor.setVisible(false);
    }
    private class MyButtn2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    private class MyButtn implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           System.out.print("ok");
        }
    }
}
