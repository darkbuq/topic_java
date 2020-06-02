package Mud_2;

import java.io.*;
import java.util.*;


public class All_process_DB {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Read_txt itemtxt = new Read_txt(); //先做一個類
		
		//類裡面 我寫好了一個方法  可以一行一行做成字串 ArrayList
		ArrayList gg = itemtxt.getList("./item_ANSI.txt"); 
		//ArrayList 原本就有寫好的方法  可以訪問ArrayList 裡面的元素
        //System.out.printf("測試一下資料有沒有撈到:\n%s \n",gg.get(0)); 
        
        
        System.out.printf("ArrayList size(): %d\n",gg.size());
		String istr;
		String[][] kkk = { { "name", "type", "addhp", "addatk"} };
        for (int i=0; i<gg.size(); i++) {
        	//System.out.println(i);
        	
        	istr=(String) gg.get(i);
        	System.out.println(istr);
        	String[] istrarr = istr.split(",");
        	System.out.println("每個row 用split 切出來的 [0]: "+istrarr[0]);
        	
        	InsertRow insertRow = new InsertRow();
        	kkk = insertRow.str_arr_insert(kkk, 1, istrarr);
        }
        
        
        //看一下 陣列的row col
        System.out.println("最後2D陣列的 row = "+kkk.length);
        System.out.println("最後2D陣列的 col = "+kkk[0].length);
        //資料已完成
        
        
        System.out.println("建立資料庫 ..");
        SQLite_CreateDB.main(args);
        
        
        String createtable_str ="CREATE TABLE gg1("
        		+ "id int AUTO_INCREMENT,"
        		+ "name char(8),"
        		+ "type char(4),"
        		+ "addhp char(4),"
        		+ "addatk char(4),"
        		+ "PRIMARY KEY (id));";
        System.out.println("建立資料表 ..");
        System.out.println("createtable_str");
        SQLite_CreateTable.main(createtable_str,args);
        
        
        System.out.println("INSERT..");
        for(int row=1; row<kkk.length; row++) {
        	
        	// SQL語法的AUTO_INCREMENT 失效      待查
        	String insert_str = "INSERT INTO gg1 (id,name,type,addhp,addatk)" + 
            		String.format("VALUES (%d,'%s', '%s', '%s', '%s');",
            				row,kkk[row][0],kkk[row][1],kkk[row][2],kkk[row][3]);
        	
        	System.out.println(insert_str);
        		
        	SQLite_Insert.main(insert_str,args);
        	
        }
        
        
        
        
        
        
        
		
	}

}
