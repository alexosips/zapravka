import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //vxid vxid = new vxid();
        //vxid.pack();
        //vxid.setSize(300,200);
        //vxid.setVisible(true);
        //vxid.setDefaultCloseOperation(vxid.EXIT_ON_CLOSE);
        //vxid.setResizable(false);
        //vxid.setLocationRelativeTo(null);
        String userName = "root";
        String password = "20032021";
        String coonectionUrl = "jdbc:mysql://localhost:3306/zaprav";
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(coonectionUrl,userName,password)){
            System.out.print("Ok");
        }

    }
}