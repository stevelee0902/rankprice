
<%@ page import="java.sql.*" %>
<%@ page import="cubrid.sql.*" %>
<%@ page import="cubrid.jdbc.driver.*" %>



<%!

String url = "jdbc:cubrid:114.199.145.247:30000:prorandb:dba:adminran01:";
String userid = "dba";
String password = "adminran01";
String sql = "INSERT INTO tbl_rank_mn VALUES (rank_seq.nextval,'test02',30,ADDDATE(SYSDATE,INTERVAL 24 HOUR),ADDDATE(SYSDATE,INTERVAL 24 HOUR))";



%>


<%

System.out.println("test11");



try { 
    Class.forName("cubrid.jdbc.driver.CUBRIDDriver");
} catch(Exception e) { 
    e.printStackTrace(); 
} 
/*

try {
   Connection conn = DriverManager.getConnection(url,userid,password);
   // Do something with the Connection
   

      Statement stmt = null;
      
     // CUBRIDResultSet rs = null;
      ResultSetMetaData rsmd = null;
   
     //rs = (CUBRIDResultSet)stmt.executeQuery(sql); //c
      stmt = conn.createStatement();
      
      
     stmt.executeUpdate(sql);
     //rsmd = rs.getMetaData();

     stmt.close();

   } catch (SQLException e) {
       System.out.println("SQLException:" + e.getMessage());
       System.out.println("SQLState: " + e.getSQLState());
   }
*/

%>


