package q1;

import java.io.*;
import java.util.Scanner;

public class code {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text\n");
		String str = sc.nextLine();
		
		File path = new File("text.txt");
		if(path.exists())
			System.out.println("Already existing "+path+" file taken");
		else
			System.out.println("New "+path+" file created");
		
		FileOutputStream fout = new FileOutputStream(path);
		DataOutputStream dout = new DataOutputStream(fout);
		
		dout.writeUTF(str);
		System.out.println("Text added to file");
		dout.close();
		fout.close();
		
		FileInputStream fin = new FileInputStream(path);
		DataInputStream din = new DataInputStream(fin);
		System.out.print("Text Present in file = ");
		while(din.available()>0) {
			String s = din.readUTF();
			System.out.print(s);
		}
		System.out.println();
		din.close();
		fin.close();
		
	}

}