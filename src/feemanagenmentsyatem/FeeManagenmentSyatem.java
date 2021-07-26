
package feemanagenmentsyatem;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Sakar
 */
public class FeeManagenmentSyatem {
    Connection con = null;
    public static Connection connectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:FeeManagenmentSystem.sqlite");
            System.out.println("Connected Successfully!!");
            return con;
            
        }
        catch(Exception e){
            System.out.println("Connection Faliled" +e);
            return null;
        }
    }

    public static void main(String[] args) {
        connectDB();
    }
    
}
