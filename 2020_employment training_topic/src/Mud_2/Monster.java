package Mud_2;

class Monster {
	String name;
	String type;
	
	int hp = 100;
    int atk = 10;
    
	void show(){
		System.out.println();
		System.out.println("�ĤH���A");
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
		type = "�ѽu�_�_";
		name="�B�B";		
	}
}

class Lala extends Monster {
	Lala() {
		atk = 30;
		type = "�ѽu�_�_";
		name="�ԩ�";	
	}
}

class Po extends Monster {
	Po() {
		atk = 20;
		type = "�ѽu�_�_";
		name="�p�i";	
	}
}

class Dipsy extends Monster {
	Dipsy() {
		atk = 20;
		type = "�ѽu�_�_";
		name="�p�i";	
	}
}