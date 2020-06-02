package Mud_1;

import java.util.Scanner;

public class Mud_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("歡迎來到一個老掉牙的遊戲 Mud ~ ");		
		System.out.println("請輸入一個ID : ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		scanner.close();
		System.out.printf("你好   %s 現在你重生在  一個糞game的世界", name);
		
		System.out.println("請選擇一個職業 : ");
		System.out.println("選 1 成為 劍士");
		
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
	String profession="菜雞";
	int hp = 100;
    int mp = 50;
    int lv = 1;
    
	void show(){
		System.out.println();
		System.out.println("目前狀態");
        System.out.println("name: " + name);
        System.out.println("職業為 : " + profession);
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
		System.out.println("升級了	目前 LV: " + lv);
		hp+=10;
		System.out.println("hp +10	目前 hp: " + hp);
		mp+=5;
		System.out.println("mp +5	目前 mp: " + mp);
		System.out.println();
	}
}

