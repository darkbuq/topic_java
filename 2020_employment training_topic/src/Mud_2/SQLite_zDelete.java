package Mud_2;

import java.io.File;

public class SQLite_zDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("./test.db");
		System.out.println("�R����Ʈw..");
		System.out.print(file.exists() ? "�s�b\n" : "���s�b\n");
		
		boolean bool = file.delete(); //�o��k�|�^�Ǥ@�ӥ��L��  �ӳq��  �O�_�R�����\
		System.out.print(file.exists() ? "�s�b\n" : "���s�b\n");
		
	}

}
