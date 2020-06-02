package Mud_2;

//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.InputStreamReader;

import java.io.*;
import java.util.*;

class Read_txt {
	
	Read_txt () {} //�غc
	
	void show (String filepath, String encoding) throws IOException{
		File file = new File(filepath);
		if( file.exists()) {
			//�p�G�ɮצs�b   �N�F��
			System.out.println("�o�O�r�`�y�@�k");
			System.out.println("new BufferedReader <= new InputStreamReader <= FileInputStream(file), encoding))");
			//�r�`�y    ���`�I�yFileInputStream => �A�B�z�yBufferedReader (�o���٭n�A�T�{)
			//�t�~�O���O�u���r�`�y���@�k  �~��B�z  ���s�X�����D   �n��H��
			BufferedReader input = new BufferedReader(
					  new InputStreamReader(new FileInputStream(file), encoding));
			
			String str1; //�U����k�i�H��   �W���o��N����   �u�_��
			while( (str1 = input.readLine() ) != null){ System.out.println( str1 ); }
			input.close();
		}else {System.out.println(filepath + " ���s�b!"); }
		System.out.println();
	}
	
	void show (String filepath) throws IOException {
		File file = new File(filepath);
		if( file.exists()) {
			//�p�G�ɮצs�b   �N�F��
			System.out.println("�o�O�r�Ŭy�@�k new BufferedReader(new FileReader(file))");
			System.out.println("new BufferedReader(new FileReader(file))");
			//�r�Ŭy    ���`�I�yFileReader => �A�B�z�yBufferedReader
			BufferedReader input = new BufferedReader(new FileReader(file)); 
			
			
			String str2; //�ܯS�O  �S���o���ܼ�  ��bwhile���P�_��  Ū�X�Ӫ����|�|��
			while( (str2 = input.readLine() ) != null) { 
				System.out.println( str2 ); 
				
			}
			
			input.close();
		}else {System.out.println(filepath + " ���s�b!"); }
		System.out.println();
	}
	
	
	ArrayList getList (String filepath) throws IOException {
		File file = new File(filepath);
		BufferedReader input = new BufferedReader(new FileReader(file));
		
		ArrayList<String> list = new ArrayList<>();
		String str3; //�ܯS�O  �S���o���ܼ�  ��bwhile���P�_��  Ū�X�Ӫ����|�|��
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
		System.out.println("method����print => ��ơG"+lines);
		return lines;
	}
	
	
	/*
	int[][] getarray (String filepath) throws IOException {
		File file = new File(filepath);
		BufferedReader input = new BufferedReader(new FileReader(file));
		
		//ArrayList<String> list = new ArrayList<>();
		int[][] ary1;
		String str3; //�ܯS�O  �S���o���ܼ�  ��bwhile���P�_��  Ū�X�Ӫ����|�|��
		while( (str3 = input.readLine() ) != null) { 
			//System.out.println( str2 ); 
			String[] istrarr = str3.split(",");
		}
		input.close();
		return list;
	}
	*/
	

}
