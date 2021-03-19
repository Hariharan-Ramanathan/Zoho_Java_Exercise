//6. Write a program to perform a file copy operation using the file streams of java. Get the file names as command line parameters. Throw required errors and catch required exceptions.


package q6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class code {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("/home/harish/eclipse-workspace/Zoho_exe/src/q3/code.java");
		File f2 = new File("Copied_text.txt");
		
		try {
			FileInputStream fis= new FileInputStream(f1);
			FileOutputStream fos = new FileOutputStream(f2);
			//System.out.println(fis.available());
			
			int content =0;
			String str = "";
			while((content = fis.read()) != -1) {
				//System.out.print((char)content);
				str+=(char)content;
			}
			System.out.println(str);
			
			fos.write(str.getBytes());
			
			fis.close();
			fos.close();
			
		}
		catch(FileNotFoundException e) {
			System.out.println(e+"File not Found");
		}
		catch(IOException e) {
			System.out.println(e+"Error with file");
		}
		
		
	}

}
