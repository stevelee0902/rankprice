package testjava;

import java.sql.*;
import cubrid.sql.*; //a
import cubrid.jdbc.driver.*;

public class cubridcon01_para {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String url = "jdbc:cubrid:114.199.145.247:30000:prorandb:dba:adminran01:";
		//String url = "jdbc:cubrid:114.199.145.247:8001:prorandb:dba:adminran01:";
		String userid = "dba";
		String password = "adminran01";
		String sql = "INSERT INTO tbl_rank_mn VALUES (rank_seq.nextval,?,?,ADDDATE(SYSDATE,INTERVAL 24 HOUR),ADDDATE(SYSDATE,INTERVAL 24 HOUR))";
		
		

	       try { 
	           Class.forName("cubrid.jdbc.driver.CUBRIDDriver");
	       } catch(Exception e) { 
	           e.printStackTrace(); 
	       } 

		try {
		   Connection conn = DriverManager.getConnection(url,userid,password);
		   // Do something with the Connection
		   PreparedStatement stmt = null;
		   int score=100,name=12;
		   System.out.println("tt01");
		   	   for(int i=0;i<30;i++)
			   {
			   	  System.out.println("test:"+name);
				  stmt = null;
			      String sname="test"+name;
			     // CUBRIDResultSet rs = null;
			      ResultSetMetaData rsmd = null;
			   
		         //rs = (CUBRIDResultSet)stmt.executeQuery(sql); //c
			      stmt = conn.prepareStatement(sql);
			      stmt.setString(1, sname);
			      stmt.setInt(2, score);
			      
		         stmt.executeUpdate();
		         //rsmd = rs.getMetaData();
		         score=score+100;
		         name++;
		         System.out.println("tt02");
		         stmt.close();
			   }
		      conn.close();
		   	  System.out.println("tt03");

		   } catch (SQLException e) {
		       System.out.println("SQLException:" + e.getMessage());
		       System.out.println("SQLState: " + e.getSQLState());
		   }
		

	}

}
