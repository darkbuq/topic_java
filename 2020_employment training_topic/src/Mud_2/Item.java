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
//		//下面這個地方很奇怪  應該是要用 super.  才對  
//		//結果  我用 this. 編譯也過了    居還運作還正常
//		this.iname = iname;
//		this.itype = itype;
//		this.addhp = addhp;
//		this.addatk = addatk;
//	}
//}

