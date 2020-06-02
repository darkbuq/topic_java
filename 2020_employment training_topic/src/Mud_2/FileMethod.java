package Mud_2;

import java.io.File;

class FileMethod {
	
	FileMethod () {}
	
	void verify (String filepath) {
		
		File file = new File(filepath);
		
		System.out.println();
		System.out.print("檔案名稱：" + file.getName() + "\n");	     //取得檔案名稱
		System.out.print("檔案路徑：" + file.getPath() + "\n");	     //取得檔案路徑
		System.out.print("絕對路徑：" + file.getAbsolutePath() + "\n"); //取得絕對路徑
		System.out.print("目錄位置：" + file.getParent() + "\n");	     //取得上層目錄名稱
		System.out.print("檔案大小：" + file.length() + " bytes\n");	 //取得檔案大小
		//System.out.print("最後修改：" + file.lastModified() + "\n");	 //取得最後修改時間
		System.out.print("是否存在：");
		System.out.print(file.exists() ? "存在\n" : "不存在\n");	     //檢查是否存在
		System.out.print("可否讀取：");
		System.out.print(file.canRead() ? "可讀取\n" : "不可讀\n");	 //檢查是否可讀取
		System.out.print("可否寫入：");
		System.out.print(file.canWrite() ? "可寫入\n" : "不可寫\n");	 //檢查是否可寫入
		System.out.println();
	}
}
