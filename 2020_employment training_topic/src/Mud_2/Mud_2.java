package Mud_2;

import java.io.*;
import java.util.*;


public class Mud_2 {

	public static void main(String[] args)   throws IOException{
		
		// ���T�wDB �Q�R��
		System.out.println("���T�wDB �Q�R��");
		SQLite_zDelete.main(args);
		
		//�إ߸�Ʈw
		All_process_DB.main(args);
		
		//�q��Ʈw ���X ���
		
		
		
				
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
		*/
		
		
		
				
		
        
		
		
		       
        
        
        
        
        
	}
	
	


}




