package Mud_2;

import java.io.File;

class FileMethod {
	
	FileMethod () {}
	
	void verify (String filepath) {
		
		File file = new File(filepath);
		
		System.out.println();
		System.out.print("�ɮצW�١G" + file.getName() + "\n");	     //���o�ɮצW��
		System.out.print("�ɮ׸��|�G" + file.getPath() + "\n");	     //���o�ɮ׸��|
		System.out.print("������|�G" + file.getAbsolutePath() + "\n"); //���o������|
		System.out.print("�ؿ���m�G" + file.getParent() + "\n");	     //���o�W�h�ؿ��W��
		System.out.print("�ɮפj�p�G" + file.length() + " bytes\n");	 //���o�ɮפj�p
		//System.out.print("�̫�ק�G" + file.lastModified() + "\n");	 //���o�̫�ק�ɶ�
		System.out.print("�O�_�s�b�G");
		System.out.print(file.exists() ? "�s�b\n" : "���s�b\n");	     //�ˬd�O�_�s�b
		System.out.print("�i�_Ū���G");
		System.out.print(file.canRead() ? "�iŪ��\n" : "���iŪ\n");	 //�ˬd�O�_�iŪ��
		System.out.print("�i�_�g�J�G");
		System.out.print(file.canWrite() ? "�i�g�J\n" : "���i�g\n");	 //�ˬd�O�_�i�g�J
		System.out.println();
	}
}
