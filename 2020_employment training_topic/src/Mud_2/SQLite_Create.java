package Mud_2;

import java.sql.*;

public class SQLite_Create {

	public static void main(String sql,String[] args) {
		// TODO Auto-generated method stub
		Connection c = null;
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:test.db");
	      System.out.println("Opened database successfully");

	      stmt = c.createStatement();
	      
	      /*
	      sql = "CREATE TABLE COMPANY " +
	            "(ID INT PRIMARY KEY     NOT NULL," +
	            " NAME           TEXT    NOT NULL, " + 
	            " AGE            INT     NOT NULL, " + 
	            " ADDRESS        CHAR(50), " + 
	            " SALARY         REAL)";                 
	      */
	      
	      stmt.executeUpdate(sql);
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Table created successfully");
	}

}
