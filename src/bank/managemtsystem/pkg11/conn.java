
package bank.managemtsystem.pkg11;
import java.sql.*;

public class conn {
    Connection c;
    Statement s;
    public conn(){
        try{
    
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem11","root","Mumbai@123");
            s=c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    
}
}
