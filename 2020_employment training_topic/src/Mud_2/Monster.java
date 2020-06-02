package Mud_2;

class Monster {
	String name;
	String type;
	
	int hp = 100;
    int atk = 10;
    
	void show(){
		System.out.println();
		System.out.println("敵人狀態");
        System.out.println("name: " + name);
        System.out.println("type: " + type);
        System.out.println("hp: " + hp);
        System.out.println("atk: " + atk);
        System.out.println();
	}  	
}

class Tintin extends Monster {
	Tintin() {
		atk = 40;
		type = "天線寶寶";
		name="丁丁";		
	}
}

class Lala extends Monster {
	Lala() {
		atk = 30;
		type = "天線寶寶";
		name="拉拉";	
	}
}

class Po extends Monster {
	Po() {
		atk = 20;
		type = "天線寶寶";
		name="小波";	
	}
}

class Dipsy extends Monster {
	Dipsy() {
		atk = 20;
		type = "天線寶寶";
		name="小波";	
	}
}