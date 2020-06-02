package Mud_2;


class Person {
	String name;
	String profession="菜雞";
	
	int hp = 100;
    int atk = 10;
    int lv = 1;
    
	void show(){
		System.out.println();
		System.out.println("目前狀態");
        System.out.println("name: " + name);
        System.out.println("職業為 : " + profession);
        System.out.println("lv: " + lv);
        System.out.println("hp: " + hp);
        System.out.println("atk: " + atk);
        System.out.println();
	}  	
}


class Swordsman extends Person {
	Swordsman(String name) {
		super.profession = "劍士";
		this.name=name;		
	}
	void lvup() {
		lv++;
		System.out.println("升級了	目前 lv: " + lv);
		hp+=10;
		System.out.println("hp +10	目前 hp: " + hp);
		atk+=5;
		System.out.println("mp +5	目前 mp: " + atk);
		System.out.println();
	}
}

