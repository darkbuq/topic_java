package Mud_2;

import java.io.*;
import java.util.*;


public class Mud_2 {

	public static void main(String[] args)   throws IOException{
		// 先確認一下  開頭的文檔狀態
		FileMethod txtverify = new FileMethod();
		txtverify.verify("./gggg.txt");
		
		//載入文檔
		Read_txt readtxt = new Read_txt();
		readtxt.show("./gggg2.txt","UTF-8");
		
		
		/*
		System.out.println("歡迎來到一個老掉牙的遊戲 Mud ~ ");		
		System.out.println("請輸入一個ID : ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		scanner.close();
		System.out.printf("你好   %s 現在你重生在  一個 java 建構的世界", name);
		
		//System.out.println("請選擇一個職業 :");
		//System.out.println("選 1 成為 劍士");
		
		
		
		Swordsman ss = new Swordsman(name);
		
		
		ss.show();
		ss.lvup();
		ss.show();
		
		//可以直接訪問物件內的屬性
//		System.out.println(ss.atk); 
//		ss.atk+=50;
//		System.out.println(ss.atk);
		*/
		
		
		//建立一個武器防具物件 組成的陣列   
		//使用外部檔案匯入參數  
		//再用  建構(參數群) 把物件實作出來
		//做成  物件陣列
				
		Read_txt itemtxt = new Read_txt(); //先做一個類
		ArrayList gg = itemtxt.getList("./item_ANSI.txt"); //類裡面 我寫好了一個方法  可以一行一行做成字串 ArrayList
		//ArrayList 原本就有寫好的方法  可以訪問ArrayList 裡面的元素
        //System.out.printf("測試一下資料有沒有撈到: %s \n",gg.get(0)); 
		
        
        /*
        //如果沒有使用泛型(Generic)指定要存放的資料型態的話
        //就要盡量使用資料型態為Object的變數來接get()回傳的值
        //Object 是萬用型別，而儲存在ArrayList裡的資料也都是Object物件資料
		String istr=(String) gg.get(0); //這應該算是  強制轉型
		//System.out.print(istr);
        //System.out.println();
        
        String[] istrarr = istr.split(",");
        for (String i:istrarr) {
        	System.out.println(i);
        	}
        */
        
		
		
		System.out.print(gg.size());
		
		String istr;
		String[][] kkk = { { "name", "type", "addhp", "addatk"} };
        for (int i=0; i<gg.size(); i++) {
        	//System.out.println(i);
        	
        	istr=(String) gg.get(i);
        	System.out.println(istr);
        	String[] istrarr = istr.split(",");
        	System.out.println(istrarr[0]);
        	
        	InsertRow insertRow = new InsertRow();
        	kkk = insertRow.str_arr_insert(kkk, 1, istrarr);
        }
        
        System.out.println(kkk.length);
        System.out.println(kkk[0].length);
        
        /*
        for(int row=0; row<kkk.length; row++) {
        	for(int col=0; col<kkk[row].length; col++) {
        		System.out.printf("row=%d col=%d 值: %s\n",row,col,kkk[row][col]);
        	}
        	
        }
        */       
        
        //SQLite_Connection sqlite_test = new SQLite_test(); //先建
        //sqlite_test.main(args);  //再用
        
        //繼Java程序顯示了如何連接到一個現有的數據庫
        //如果數據庫不存在，那麼它就會被創建
        SQLite_CreateDB.main(args); //靜態方法  不用建   直接用
        
        //String createdb_str = "CREATE DATABASE mydb;" + "USE mydb;";
        String createtable_str ="CREATE TABLE gg1("
        		+ "id int AUTO_INCREMENT,"
        		+ "name char(8),"
        		+ "type char(4),"
        		+ "addhp char(4),"
        		+ "addatk char(4),"
        		+ "PRIMARY KEY (id));";
        
        SQLite_Create.main(createtable_str,args);
        
        
        /*
        String insert_str = "INSERT INTO gg1 (name,type,addhp,addatk)" + 
        		String.format("VALUES ('%s', '%s', '%s', '%s');",kkk[2][0],kkk[2][1],kkk[2][2],kkk[2][3]);
                
        System.out.printf(insert_str);
        SQLite_Insert.main(insert_str,args);
        */
        
        
        for(int row=1; row<kkk.length; row++) {
        	
        	// SQL語法的AUTO_INCREMENT 失效      待查
        	String insert_str = "INSERT INTO gg1 (id,name,type,addhp,addatk)" + 
            		String.format("VALUES (%d,'%s', '%s', '%s', '%s');",
            				row,kkk[row][0],kkk[row][1],kkk[row][2],kkk[row][3]);
        	
        	System.out.printf(insert_str);
        		
        	SQLite_Insert.main(insert_str,args);
        	
        }
        
        
        
	}
	
	


}




