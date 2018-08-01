package DTO;

import java.sql.*;
import cubrid.sql.*; //a
import cubrid.jdbc.driver.*;

public class Rank_Srch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String url = "jdbc:cubrid:114.199.145.247:30000:prorandb:dba:adminran01:";
		//String url = "jdbc:cubrid:114.199.145.247:8001:prorandb:dba:adminran01:";
		String userid = "dba";
		String password = "adminran01";
		String sql = "SELECT	seq,id,score,reg_dt,up_dt FROM	tbl_rank_mn";
		
		

	       try { 
	           Class.forName("cubrid.jdbc.driver.CUBRIDDriver");
	       } catch(Exception e) { 
	           e.printStackTrace(); 
	       } 

		try {
		   Connection conn = DriverManager.getConnection(url,userid,password);
		   // Do something with the Connection
		   

		   PreparedStatement stmt = null;
		      
		      CUBRIDResultSet rs = null;
		      ResultSetMetaData rsmd = null;
		      
		      stmt = conn.prepareStatement(sql);
		   
	         rs = (CUBRIDResultSet)stmt.executeQuery(); 
		     
		      rs.next();
	         System.out.println(rs.getString("id"));
	         System.out.println(rs.getString("score")); 


	         stmt.close();
	         conn.close();

		   } catch (SQLException e) {
		       System.out.println("SQLException:" + e.getMessage());
		       System.out.println("SQLState: " + e.getSQLState());
		   }
		

	}

}
