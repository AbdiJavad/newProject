import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost/bank", "root", "admin");
        Statement statement = connection.createStatement();
        statement.executeUpdate
                ("create table Hassan (col1 char(5), col2 char(5))");
        //ResultSet resultSet = statement.executeQuery
               // ("select firstName, mi, lastName from Student where lastName "
                  //      + " = 'Smith'");




    }
}