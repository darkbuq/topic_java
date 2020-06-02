package Mud_2;


//import java.io.File;
//import java.io.InputStreamReader;
//import java.io.FileInputStream;
//import java.io.BufferedReader;
//import java.io.BufferedWriter;

import java.io.*;
import java.util.*;

public class test {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
				   
        //Read_txt itemtxt = new Read_txt();
        
        //這個可以用
//        System.out.println("./item_UTF8.txt    UTF-8");
//        itemtxt.show("./item_UTF8.txt", "UTF-8");
        
//        System.out.println("./item_ANSI.txt    ANSI");  這個不能用
//        itemtxt.show("./item_ANSI.txt", "ANSI");  這個不能用
        
//        System.out.println("./item_UTF8.txt");  這個不能用
//        itemtxt.showw("./item_UTF8.txt");  這個不能用
        
//        System.out.println("./item_ANSI.txt");
//        itemtxt.show("./item_ANSI.txt");
		
        
        
        
        /*
        File file = new File("./item_ANSI.txt");
		if( file.exists()) {
			//如果檔案存在   就幹活
			System.out.println("這是字符流作法 new BufferedReader(new FileReader(file))");
			System.out.println("new BufferedReader(new FileReader(file))");
			//字符流    先節點流FileReader => 再處理流BufferedReader
			BufferedReader input = new BufferedReader(new FileReader(file)); 
			
			
			
			//List<String> list = new ArrayList<>();
			ArrayList<String> list = new ArrayList<>();
			String str2; //很特別  沒有這個變數  放在while的判斷裡  讀出來的文件會漏行
			while( (str2 = input.readLine() ) != null) { 
				//System.out.println( str2 ); 
				
				list.add(str2);
			}
			
			input.close();
			
			for(String i : list) System.out.print(i + "\n");
			
			
		}else {System.out.println("./item_ANSI.txt" + " 不存在!"); }
		System.out.println();
		*/
        
        
        
        /*
        ArrayList gg = itemtxt.getList("./item_ANSI.txt");
        System.out.print(gg.get(1));
        System.out.println();
        
        //如果沒有使用泛型(Generic)指定要存放的資料型態的話
        //就要盡量使用資料型態為Object的變數來接get()回傳的值
        //Object 是萬用型別，而儲存在ArrayList裡的資料也都是Object物件資料
		String ss=(String) gg.get(1); //這應該算是  強制轉型
		System.out.print(ss);
        System.out.println();
		*/
        
		BufferedReader reader = new BufferedReader(new FileReader("./item_ANSI.txt"));
		int lines = 0;
		while (reader.readLine() != null) lines++;
		reader.close();
		System.out.println("行數："+lines);
		
		
		
        int totalRow = lines;
//        int totalColumn = 20;
//        char[][] myArray = new char[totalRow][totalColumn];
        File file = new File("./item_ANSI.txt");
        Scanner scanner = new Scanner(file);

        /*
        for (int row = 0; scanner.hasNextLine() && row < totalRow; row++) {
            //char[] chars = scanner.nextLine().toCharArray();
            String str = scanner.nextLine().toString();
            System.out.println(str);
            String[] istrarr = str.split(",");
            System.out.println(istrarr[1]);
        }
        */
        
        String [] str;
        
        
//        for (int row = 0; scanner.hasNextLine() && row < totalRow; row++) {
//            //char[] chars = scanner.nextLine().toCharArray();
//            String str = scanner.nextLine().toString();
//            System.out.println(str);
//            String[] istrarr = str.split(",");
//            System.out.println(istrarr[1]);
//        }
        
        
        
        
	}

}
