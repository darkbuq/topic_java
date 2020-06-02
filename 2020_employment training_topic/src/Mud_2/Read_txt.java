package Mud_2;

//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.InputStreamReader;

import java.io.*;
import java.util.*;

class Read_txt {
	
	Read_txt () {} //建構
	
	void show (String filepath, String encoding) throws IOException{
		File file = new File(filepath);
		if( file.exists()) {
			//如果檔案存在   就幹活
			System.out.println("這是字節流作法");
			System.out.println("new BufferedReader <= new InputStreamReader <= FileInputStream(file), encoding))");
			//字節流    先節點流FileInputStream => 再處理流BufferedReader (這邊還要再確認)
			//另外是不是只有字節流的作法  才能處理  文件編碼的問題   要找人問
			BufferedReader input = new BufferedReader(
					  new InputStreamReader(new FileInputStream(file), encoding));
			
			String str1; //下面方法可以用   上面這邊就不行   真奇怪
			while( (str1 = input.readLine() ) != null){ System.out.println( str1 ); }
			input.close();
		}else {System.out.println(filepath + " 不存在!"); }
		System.out.println();
	}
	
	void show (String filepath) throws IOException {
		File file = new File(filepath);
		if( file.exists()) {
			//如果檔案存在   就幹活
			System.out.println("這是字符流作法 new BufferedReader(new FileReader(file))");
			System.out.println("new BufferedReader(new FileReader(file))");
			//字符流    先節點流FileReader => 再處理流BufferedReader
			BufferedReader input = new BufferedReader(new FileReader(file)); 
			
			
			String str2; //很特別  沒有這個變數  放在while的判斷裡  讀出來的文件會漏行
			while( (str2 = input.readLine() ) != null) { 
				System.out.println( str2 ); 
				
			}
			
			input.close();
		}else {System.out.println(filepath + " 不存在!"); }
		System.out.println();
	}
	
	
	ArrayList getList (String filepath) throws IOException {
		File file = new File(filepath);
		BufferedReader input = new BufferedReader(new FileReader(file));
		
		ArrayList<String> list = new ArrayList<>();
		String str3; //很特別  沒有這個變數  放在while的判斷裡  讀出來的文件會漏行
		while( (str3 = input.readLine() ) != null) { 
			//System.out.println( str2 ); 
			
			list.add(str3);
		}
		input.close();
		return list;
	}
	
	int getlinenum (String filepath) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(filepath));
		int lines = 0;
		while (reader.readLine() != null) lines++;
		reader.close();
		System.out.println("method內的print => 行數："+lines);
		return lines;
	}
	
	
	/*
	int[][] getarray (String filepath) throws IOException {
		File file = new File(filepath);
		BufferedReader input = new BufferedReader(new FileReader(file));
		
		//ArrayList<String> list = new ArrayList<>();
		int[][] ary1;
		String str3; //很特別  沒有這個變數  放在while的判斷裡  讀出來的文件會漏行
		while( (str3 = input.readLine() ) != null) { 
			//System.out.println( str2 ); 
			String[] istrarr = str3.split(",");
		}
		input.close();
		return list;
	}
	*/
	

}
