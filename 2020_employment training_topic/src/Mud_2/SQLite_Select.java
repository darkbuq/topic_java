package Mud_2;

import java.sql.*;

public class SQLite_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection c = null;
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:test.db");
	      c.setAutoCommit(false);
	      System.out.println("Opened database successfully");

	      stmt = c.createStatement();
	      ResultSet rs = stmt.executeQuery( "SELECT * FROM gg1;" );
	      
	      int numm=0;
	      //String[] both = new String[1];
	      while ( rs.next() ) {
	         //int id = rs.getInt("id");
	    	  String[] sarr = new String[4]; 
	    	 
	         sarr[0] = rs.getString("name");
	         sarr[1] = rs.getString("type");
	         sarr[2] = rs.getString("addhp");
	         sarr[3] = rs.getString("addatk");
	         
	         //both = ArrayUtils.addAll(both, sarr);
	         
	         
	         System.out.println( "name = " + sarr[0] );
	         System.out.println( "type = " + sarr[1] );
	         System.out.println( "addhp = " + sarr[2] );
	         System.out.println( "addatk = " + sarr[3] );
	         numm++;
	         System.out.println(numm);
	         
	      }
	      
	      rs.close();
	      stmt.close();
	      c.close();
	      
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Operation done successfully");
	}
	
	

}
