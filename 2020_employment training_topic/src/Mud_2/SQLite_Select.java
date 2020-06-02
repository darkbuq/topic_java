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
	      while ( rs.next() ) {
	         //int id = rs.getInt("id");
	         String  name = rs.getString("name");
	         String  type = rs.getString("type");
	         String  addhp = rs.getString("addhp");
	         String  addatk = rs.getString("addatk");
	         
	         System.out.println( "name = " + name );
	         System.out.println( "type = " + type );
	         System.out.println( "addhp = " + addhp );
	         System.out.println( "addatk = " + addatk );
	         System.out.println();
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
