package Mud_2;

import java.io.*;
import java.util.*;


public class Mud_2 {

	public static void main(String[] args)   throws IOException{
		// ���T�{�@�U  �}�Y�����ɪ��A
		FileMethod txtverify = new FileMethod();
		txtverify.verify("./gggg.txt");
		
		//���J����
		Read_txt readtxt = new Read_txt();
		readtxt.show("./gggg2.txt","UTF-8");
		
		
		/*
		System.out.println("�w��Ө�@�Ӧѱ������C�� Mud ~ ");		
		System.out.println("�п�J�@��ID : ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		scanner.close();
		System.out.printf("�A�n   %s �{�b�A���ͦb  �@�� java �غc���@��", name);
		
		//System.out.println("�п�ܤ@��¾�~ :");
		//System.out.println("�� 1 ���� �C�h");
		
		
		
		Swordsman ss = new Swordsman(name);
		
		
		ss.show();
		ss.lvup();
		ss.show();
		
		//�i�H�����X�ݪ��󤺪��ݩ�
//		System.out.println(ss.atk); 
//		ss.atk+=50;
//		System.out.println(ss.atk);
		*/
		
		
		//�إߤ@�ӪZ�����㪫�� �զ����}�C   
		//�ϥΥ~���ɮ׶פJ�Ѽ�  
		//�A��  �غc(�ѼƸs) �⪫���@�X��
		//����  ����}�C
				
		Read_txt itemtxt = new Read_txt(); //�����@����
		ArrayList gg = itemtxt.getList("./item_ANSI.txt"); //���̭� �ڼg�n�F�@�Ӥ�k  �i�H�@��@�氵���r�� ArrayList
		//ArrayList �쥻�N���g�n����k  �i�H�X��ArrayList �̭�������
        //System.out.printf("���դ@�U��Ʀ��S������: %s \n",gg.get(0)); 
		
        
        /*
        //�p�G�S���ϥΪx��(Generic)���w�n�s�񪺸�ƫ��A����
        //�N�n�ɶq�ϥθ�ƫ��A��Object���ܼƨӱ�get()�^�Ǫ���
        //Object �O�U�Ϋ��O�A���x�s�bArrayList�̪���Ƥ]���OObject������
		String istr=(String) gg.get(0); //�o���Ӻ�O  �j���૬
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
        		System.out.printf("row=%d col=%d ��: %s\n",row,col,kkk[row][col]);
        	}
        	
        }
        */       
        
        //SQLite_Connection sqlite_test = new SQLite_test(); //����
        //sqlite_test.main(args);  //�A��
        
        //�~Java�{����ܤF�p��s����@�Ӳ{�����ƾڮw
        //�p�G�ƾڮw���s�b�A���򥦴N�|�Q�Ы�
        SQLite_CreateDB.main(args); //�R�A��k  ���Ϋ�   ������
        
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
        	
        	// SQL�y�k��AUTO_INCREMENT ����      �ݬd
        	String insert_str = "INSERT INTO gg1 (id,name,type,addhp,addatk)" + 
            		String.format("VALUES (%d,'%s', '%s', '%s', '%s');",
            				row,kkk[row][0],kkk[row][1],kkk[row][2],kkk[row][3]);
        	
        	System.out.printf(insert_str);
        		
        	SQLite_Insert.main(insert_str,args);
        	
        }
        
        
        
	}
	
	


}




