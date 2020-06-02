package Mud_2;

import java.io.*;
import java.util.*;


public class Mud_2 {

	public static void main(String[] args)   throws IOException{
		
		// 先確定DB 被刪除
		System.out.println("先確定DB 被刪除");
		SQLite_zDelete.main(args);
		
		//建立資料庫
		All_process_DB.main(args);
		
		//從資料庫 取出 資料
		
		
		
				
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
		*/
		
		
		
				
		
        
		
		
		       
        
        
        
        
        
	}
	
	


}




