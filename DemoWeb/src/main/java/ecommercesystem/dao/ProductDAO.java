package ecommercesystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import ecommercesystem.connect.dbCon;
import ecommercesystem.tables.product_category;

public class ProductDAO {
	
	static Connection con = null;
	static PreparedStatement ps = null;
	static ResultSet rs = null;
	
	
	
	
	
	
//ALL CATEGORY
	public static List<product_category> getAllProductCategory(){
		List<product_category> list = new ArrayList<product_category>();
		
		try {
			con=dbCon.getConnection();
			ps=con.prepareStatement("select * from product_category;");
			rs=ps.executeQuery();
			
			while(rs.next()) {
				product_category pc = new product_category();
				pc.setCategory_name(rs.getString("category_name"));
				list.add(pc);
			}
		}
		catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		    JOptionPane.showMessageDialog(null, e);
		}
		return list;
	}
}
