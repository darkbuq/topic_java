package Mud_2;

import java.io.*;
import java.util.*;

public class test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Read_txt read_txt = new Read_txt();
		int x = read_txt.getlinenum("./item_ANSI.txt");
		System.out.println(x);
		
		
	}

}
