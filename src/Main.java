import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        regen regen = new regen();
        regen.pack();
        regen.setSize(300,200);
        regen.setVisible(true);
        regen.setDefaultCloseOperation(regen.HIDE_ON_CLOSE);
        regen.setLocationRelativeTo(null);
        String userName = "root";
        String password = "20032021";
        String coonectionUrl = "jdbc:mysql://localhost:3306/zaprav";
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(coonectionUrl,userName,password)){
            System.out.print("Ok");
        }

    }

}