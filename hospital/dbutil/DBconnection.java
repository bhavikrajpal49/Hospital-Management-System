
package hospital.dbutil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBconnection {
    private static Connection con;
    
    static {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalsystem","root","");
            JOptionPane.showMessageDialog(null,"connection Sucessfully to the database","success",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(ClassNotFoundException ex){
          JOptionPane.showMessageDialog(null,"error loading driver class"+ex,"error",JOptionPane.INFORMATION_MESSAGE);  
        }
        catch(SQLException ex){
          JOptionPane.showMessageDialog(null,"error in DB"+ex,"error",JOptionPane.INFORMATION_MESSAGE);  
        }
    }
    
    public static Connection getConnection()
    {
        return con;
    }
    
    public static void CloseConnection()
    {
        try{
            if(con!=null)
            {
                con.close();
                
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"error in closing database"+ex,"error",JOptionPane.INFORMATION_MESSAGE);
        }
            
    }
            
}
    
