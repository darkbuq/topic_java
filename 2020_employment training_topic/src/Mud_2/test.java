package Mud_2;


//import java.io.File;
//import java.io.InputStreamReader;
//import java.io.FileInputStream;
//import java.io.BufferedReader;
//import java.io.BufferedWriter;

import java.io.*;
import java.util.*;

public class test {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
				   
        //Read_txt itemtxt = new Read_txt();
        
        //�o�ӥi�H��
//        System.out.println("./item_UTF8.txt    UTF-8");
//        itemtxt.show("./item_UTF8.txt", "UTF-8");
        
//        System.out.println("./item_ANSI.txt    ANSI");  �o�Ӥ����
//        itemtxt.show("./item_ANSI.txt", "ANSI");  �o�Ӥ����
        
//        System.out.println("./item_UTF8.txt");  �o�Ӥ����
//        itemtxt.showw("./item_UTF8.txt");  �o�Ӥ����
        
//        System.out.println("./item_ANSI.txt");
//        itemtxt.show("./item_ANSI.txt");
		
        
        
        
        /*
        File file = new File("./item_ANSI.txt");
		if( file.exists()) {
			//�p�G�ɮצs�b   �N�F��
			System.out.println("�o�O�r�Ŭy�@�k new BufferedReader(new FileReader(file))");
			System.out.println("new BufferedReader(new FileReader(file))");
			//�r�Ŭy    ���`�I�yFileReader => �A�B�z�yBufferedReader
			BufferedReader input = new BufferedReader(new FileReader(file)); 
			
			
			
			//List<String> list = new ArrayList<>();
			ArrayList<String> list = new ArrayList<>();
			String str2; //�ܯS�O  �S���o���ܼ�  ��bwhile���P�_��  Ū�X�Ӫ����|�|��
			while( (str2 = input.readLine() ) != null) { 
				//System.out.println( str2 ); 
				
				list.add(str2);
			}
			
			input.close();
			
			for(String i : list) System.out.print(i + "\n");
			
			
		}else {System.out.println("./item_ANSI.txt" + " ���s�b!"); }
		System.out.println();
		*/
        
        
        
        /*
        ArrayList gg = itemtxt.getList("./item_ANSI.txt");
        System.out.print(gg.get(1));
        System.out.println();
        
        //�p�G�S���ϥΪx��(Generic)���w�n�s�񪺸�ƫ��A����
        //�N�n�ɶq�ϥθ�ƫ��A��Object���ܼƨӱ�get()�^�Ǫ���
        //Object �O�U�Ϋ��O�A���x�s�bArrayList�̪���Ƥ]���OObject������
		String ss=(String) gg.get(1); //�o���Ӻ�O  �j���૬
		System.out.print(ss);
        System.out.println();
		*/
        
		BufferedReader reader = new BufferedReader(new FileReader("./item_ANSI.txt"));
		int lines = 0;
		while (reader.readLine() != null) lines++;
		reader.close();
		System.out.println("��ơG"+lines);
		
		
		
        int totalRow = lines;
//        int totalColumn = 20;
//        char[][] myArray = new char[totalRow][totalColumn];
        File file = new File("./item_ANSI.txt");
        Scanner scanner = new Scanner(file);

        /*
        for (int row = 0; scanner.hasNextLine() && row < totalRow; row++) {
            //char[] chars = scanner.nextLine().toCharArray();
            String str = scanner.nextLine().toString();
            System.out.println(str);
            String[] istrarr = str.split(",");
            System.out.println(istrarr[1]);
        }
        */
        
        String [] str;
        
        
//        for (int row = 0; scanner.hasNextLine() && row < totalRow; row++) {
//            //char[] chars = scanner.nextLine().toCharArray();
//            String str = scanner.nextLine().toString();
//            System.out.println(str);
//            String[] istrarr = str.split(",");
//            System.out.println(istrarr[1]);
//        }
        
        
        
        
	}

}
