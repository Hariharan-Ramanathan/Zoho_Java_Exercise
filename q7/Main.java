//7. Write a program to accept a filename and print the contents of the file along with the line numbers. Also catch the required exceptions.

// use finally
package q7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		String str = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter file path name");
		str = s.nextLine();
		File file_path = new File(str);
		Scanner sc = null;
		try {
			sc = new Scanner(file_path);
			int line_num = 1;
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(line_num+" "+data);
				line_num++;
			}
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println("File not found "+e);
		}
		finally{
			sc.close();
			s.close();
		}
	}

}
