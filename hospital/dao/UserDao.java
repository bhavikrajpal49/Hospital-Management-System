/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.dao;
import hospital.dbutil.DBconnection;
import java.sql.SQLException;
import hospital.pojo.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Hp
 */
public class UserDao {
    public static String validateUser(User u) throws SQLException
    {
        Connection con = DBconnection.getConnection();
        PreparedStatement ps = con.prepareStatement("select username from adminname where username=? and password=?");
        ps.setString(1,u.getUsername());
        ps.setString(2,u.getPassword());
        ResultSet rs = ps.executeQuery();
        String username = null;
        if(rs.next())
        {
            username = rs.getString(1);
        }
        return username;
    }
}
