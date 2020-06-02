package Mud_2;

import java.io.File;

public class SQLite_zDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("./test.db");
		System.out.println("刪除資料庫..");
		System.out.print(file.exists() ? "存在\n" : "不存在\n");
		
		boolean bool = file.delete(); //這方法會回傳一個布林值  來通知  是否刪除成功
		System.out.print(file.exists() ? "存在\n" : "不存在\n");
		
	}

}
