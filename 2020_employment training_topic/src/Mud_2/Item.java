package Mud_2;

class Item {
	String iname;
	String itype;
	int addhp;
	int addatk;
	
	Item (String iname, String itype, int addhp, int addatk) {
		this.iname = iname;
		this.itype = itype;
		this.addhp = addhp;
		this.addatk = addatk;
	}
		
	void show(){
		System.out.println();
        System.out.println("iname: " + iname);
        System.out.println("itype : " + itype);
        System.out.println("addhp: " + addhp);
        System.out.println("addatk: " + addatk);
        System.out.println();
	}

}



//class MainHand extends Item {
//	MainHand (String iname, String itype, int addhp, int addatk) {
//		//�U���o�Ӧa��ܩ_��  ���ӬO�n�� super.  �~��  
//		//���G  �ڥ� this. �sĶ�]�L�F    �~�ٹB�@�٥��`
//		this.iname = iname;
//		this.itype = itype;
//		this.addhp = addhp;
//		this.addatk = addatk;
//	}
//}

