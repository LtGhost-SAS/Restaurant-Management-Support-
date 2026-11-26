package HomePage;
import java.sql.*;
public class JDBCTEST {
    public static void main(String[] args) throws ClassNotFoundException,SQLException {
        Class.forName("oracle.jdbc.driver.oracleDriver");
        String user = "system";
        String pass = "";
        String url = "jdbc:oracle:thin:@127.0.0.1:700:xe";
        Connection c = DriverManager.getConnection(url,user,pass);
        Statement s = c.createStatement();
        String q = "Select * from Food";
        ResultSet r = s.executeQuery(q);
        while(r.next()){
            String F_ID,F_name,F_rating,F_price;
            F_ID = r.getString("F_ID");
            F_name = r.getString("F_name");
            F_rating = r.getString("F_raitng");
            F_price = r.getString("F_price");
            System.out.println(F_ID + F_name + F_rating + F_price);
        }
        s.close();
        c.close();
    }
}
