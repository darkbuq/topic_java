package Mud_2;


class Person {
	String name;
	String profession="����";
	
	int hp = 100;
    int atk = 10;
    int lv = 1;
    
	void show(){
		System.out.println();
		System.out.println("�ثe���A");
        System.out.println("name: " + name);
        System.out.println("¾�~�� : " + profession);
        System.out.println("lv: " + lv);
        System.out.println("hp: " + hp);
        System.out.println("atk: " + atk);
        System.out.println();
	}  	
}


class Swordsman extends Person {
	Swordsman(String name) {
		super.profession = "�C�h";
		this.name=name;		
	}
	void lvup() {
		lv++;
		System.out.println("�ɯŤF	�ثe lv: " + lv);
		hp+=10;
		System.out.println("hp +10	�ثe hp: " + hp);
		atk+=5;
		System.out.println("mp +5	�ثe mp: " + atk);
		System.out.println();
	}
}

