// 2. Write a program to count the numbers of characters entered through stdin. The program exits upon entering Ctrl+Z.


package q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("Enter text");
			String str = s.nextLine();
			
			System.out.println("Characters entered = "+str.length() + "(Including space)");
			
		}
	}

}
