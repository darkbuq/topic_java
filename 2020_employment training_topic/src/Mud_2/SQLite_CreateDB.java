package Mud_2;

import java.sql.*;

//Java程序顯示了如何連接到一個現有的數據庫
//如果數據庫不存在，那麼它就會被創建

public class SQLite_CreateDB {
	public static void main(String[] args) {
		Connection c = null;
	    try {
	      Class.forName("org.sqlite.JDBC");  //載入JDBC driver 
	      c = DriverManager.getConnection("jdbc:sqlite:test.db");  //建立資料連結和Statement物件  參數群還可以補上 帳密
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Opened database successfully");
	}
	
}
