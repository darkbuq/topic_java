package Mud_2;

import java.io.*;
import java.util.*;


public class All_process_DB {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Read_txt itemtxt = new Read_txt(); //�����@����
		
		//���̭� �ڼg�n�F�@�Ӥ�k  �i�H�@��@�氵���r�� ArrayList
		ArrayList gg = itemtxt.getList("./item_ANSI.txt"); 
		//ArrayList �쥻�N���g�n����k  �i�H�X��ArrayList �̭�������
        //System.out.printf("���դ@�U��Ʀ��S������:\n%s \n",gg.get(0)); 
        
        
        System.out.printf("ArrayList size(): %d\n",gg.size());
		String istr;
		String[][] kkk = { { "name", "type", "addhp", "addatk"} };
        for (int i=0; i<gg.size(); i++) {
        	//System.out.println(i);
        	
        	istr=(String) gg.get(i);
        	System.out.println(istr);
        	String[] istrarr = istr.split(",");
        	System.out.println("�C��row ��split ���X�Ӫ� [0]: "+istrarr[0]);
        	
        	InsertRow insertRow = new InsertRow();
        	kkk = insertRow.str_arr_insert(kkk, 1, istrarr);
        }
        
        
        //�ݤ@�U �}�C��row col
        System.out.println("�̫�2D�}�C�� row = "+kkk.length);
        System.out.println("�̫�2D�}�C�� col = "+kkk[0].length);
        //��Ƥw����
        
        
        System.out.println("�إ߸�Ʈw ..");
        SQLite_CreateDB.main(args);
        
        
        String createtable_str ="CREATE TABLE gg1("
        		+ "id int AUTO_INCREMENT,"
        		+ "name char(8),"
        		+ "type char(4),"
        		+ "addhp char(4),"
        		+ "addatk char(4),"
        		+ "PRIMARY KEY (id));";
        System.out.println("�إ߸�ƪ� ..");
        System.out.println("createtable_str");
        SQLite_CreateTable.main(createtable_str,args);
        
        
        System.out.println("INSERT..");
        for(int row=1; row<kkk.length; row++) {
        	
        	// SQL�y�k��AUTO_INCREMENT ����      �ݬd
        	String insert_str = "INSERT INTO gg1 (id,name,type,addhp,addatk)" + 
            		String.format("VALUES (%d,'%s', '%s', '%s', '%s');",
            				row,kkk[row][0],kkk[row][1],kkk[row][2],kkk[row][3]);
        	
        	System.out.println(insert_str);
        		
        	SQLite_Insert.main(insert_str,args);
        	
        }
        
        
        
        
        
        
        
		
	}

}
