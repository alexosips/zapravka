import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class regen extends JFrame{
    private JPanel panel;
    private JButton Button;
    private JButton Button2;
    public regen(){
        this.getContentPane().add(panel);
        this.Button.addActionListener(new regen.MyButtn());
        this.Button2.addActionListener(new regen.MyButtn2());
    }
    private class MyButtn implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
            vxid vxid = new vxid();
            vxid.pack();
            vxid.setSize(300,200);
            vxid.setVisible(true);
            vxid.setDefaultCloseOperation(vxid.HIDE_ON_CLOSE);
            vxid.setResizable(false);
            vxid.setLocationRelativeTo(null);

        }
    }
    private class MyButtn2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.print("ok");
        }
    }
}

