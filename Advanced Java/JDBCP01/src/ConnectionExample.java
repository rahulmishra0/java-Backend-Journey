import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {

    //Database connection DATA
    private static final String URL = "jdbc:mysql://localhost:3306/spark6";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Rahul1512";

    public static void main(String[] args) {

        //Exception Handle
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver"); //1.7 ke baad jvm automatically detect kar leta h
            Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            System.out.println("Database connection successfully");
        }
//        catch (ClassNotFoundException e){
//            System.out.println("MySQL driver not found");
//            e.printStackTrace();
//        }
        catch (SQLException e) {
            System.out.println("Database connection error");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
