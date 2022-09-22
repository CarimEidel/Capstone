package ecommercesystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ecommercesystem.connect.dbCon;

public class Accounts {
	public void AddAccount() throws ClassNotFoundException, SQLException {
		
		PreparedStatement pst = null;
		Connection conn = dbCon.getConnection();
		
		try {
			pst = conn.prepareStatement("insert into users(email,first_name,middle_name,last_name,contact_number,password,userlevel) "
					+ "values (?,"+"'null1'"+",\"+\"'null1'\"+\",\"+\"'null1'\"+\",\"+\"'null1'\"+\",\"+\"'null1'\"+\",\"+\"'null1'\"+\")");
			pst.setString(1, "denver@gfmail.com");
			pst.executeUpdate();
		}
		catch(SQLException se) {
			System.out.println(se);
		}	
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Accounts d = new Accounts();
		d.AddAccount();
	}
}
