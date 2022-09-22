package ecommercesystem.connect;
import java.sql.*;

public class dbCon {
	static String DRIVER = "com.mysql.cj.jdbc.Driver";  
	static String CONNECTION_URL = "jdbc:mysql://localhost:3306/ecommerce";  
	static String USERNAME = "root";  
	static String PASSWORD = "0000";  
	
	public static Connection getConnection(){  
	    Connection con=null;  
	    try{  
	        Class.forName(DRIVER);  
	        con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);  
	    }catch(Exception e){System.out.println(e);}  
	    return con;  
	}
}

