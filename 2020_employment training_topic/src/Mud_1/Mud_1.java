package Mud_1;

import java.util.Scanner;

public class Mud_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�w��Ө�@�Ӧѱ������C�� Mud ~ ");		
		System.out.println("�п�J�@��ID : ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		scanner.close();
		System.out.printf("�A�n   %s �{�b�A���ͦb  �@���Tgame���@��", name);
		
		System.out.println("�п�ܤ@��¾�~ : ");
		System.out.println("�� 1 ���� �C�h");
		
		//String gggg = scanner.next();
		
		Swordsman ss = new Swordsman(name);
		
		ss.show();
		ss.lvup();
		ss.show();
		//ss.notify();
	}

}


class Person {
	String name;
	String profession="����";
	int hp = 100;
    int mp = 50;
    int lv = 1;
    
	void show(){
		System.out.println();
		System.out.println("�ثe���A");
        System.out.println("name: " + name);
        System.out.println("¾�~�� : " + profession);
        System.out.println("LV: " + lv);
        System.out.println("hp: " + hp);
        System.out.println("mp: " + mp);
        System.out.println();
	}  	
}

class Swordsman extends Person {
	Swordsman(String name) {
		super.profession = "Swordsman";
		this.name=name;		
	}
	void lvup() {
		lv++;
		System.out.println("�ɯŤF	�ثe LV: " + lv);
		hp+=10;
		System.out.println("hp +10	�ثe hp: " + hp);
		mp+=5;
		System.out.println("mp +5	�ثe mp: " + mp);
		System.out.println();
	}
}

