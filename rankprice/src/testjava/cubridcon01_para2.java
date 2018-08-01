package testjava;

import java.sql.*;
import cubrid.sql.*; //a
import cubrid.jdbc.driver.*;

public class cubridcon01_para2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String url = "jdbc:cubrid:114.199.145.247:30000:prorandb:dba:adminran01:";
		//String url = "jdbc:cubrid:114.199.145.247:8001:prorandb:dba:adminran01:";
		String userid = "dba";
		String password = "adminran01";
		String sql = "INSERT INTO testseq (seq) VALUES (?)";
		

	       try { 
	           Class.forName("cubrid.jdbc.driver.CUBRIDDriver");
	       } catch(Exception e) { 
	           e.printStackTrace(); 
	       } 

		try {
		   Connection conn = DriverManager.getConnection(url,userid,password);
		   // Do something with the Connection
		   

		   PreparedStatement stmt = null;
		      
		     // CUBRIDResultSet rs = null;
		      ResultSetMetaData rsmd = null;
		   
	         //rs = (CUBRIDResultSet)stmt.executeQuery(sql); //c
		      stmt = conn.prepareStatement(sql);
		     // stmt.setString(1, "test101");
		      stmt.setInt(1, 1234);
		      
		      
	         stmt.executeUpdate(sql);
	         //rsmd = rs.getMetaData();
	         conn.close();

	         stmt.close();

		   } catch (SQLException e) {
		       System.out.println("SQLException:" + e.getMessage());
		       System.out.println("SQLState: " + e.getSQLState());
		   }
		

	}

}
