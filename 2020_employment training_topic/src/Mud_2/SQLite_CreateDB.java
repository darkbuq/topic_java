package Mud_2;

import java.sql.*;

//Java�{����ܤF�p��s����@�Ӳ{�����ƾڮw
//�p�G�ƾڮw���s�b�A���򥦴N�|�Q�Ы�

public class SQLite_CreateDB {
	public static void main(String[] args) {
		Connection c = null;
	    try {
	      Class.forName("org.sqlite.JDBC");  //���JJDBC driver 
	      c = DriverManager.getConnection("jdbc:sqlite:test.db");  //�إ߸�Ƴs���MStatement����  �ѼƸs�٥i�H�ɤW �b�K
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Opened database successfully");
	}
	
}
