package Emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Adminimplementation implements Admininterface {

	Connection con;
	@Override
	public Admin Login(String username, String password) {
	    // TODO Auto-generated method stub
	    Admin acc = null;
	    try (Connection con = DBConnect.createDBConnect();
	         PreparedStatement pstm = con.prepareStatement("SELECT * FROM admin WHERE username = ? AND password = ?"))
	    {

	        pstm.setString(1, username);
	        pstm.setString(2, password);
	        try (ResultSet result = pstm.executeQuery()) {
	            if (result.next()) {
	                String n = result.getString("username");
	                String e = result.getString("email");
	                String p = result.getString("password");
	                acc = new Admin(n, e, p);
	            }
	        }
	    } catch (SQLException e) {
	        // Print the stack trace for debugging purposes
	        e.printStackTrace();
	        //throw new AccountantException("Invalid username and password");
	    }
	    return acc;
	}
}
