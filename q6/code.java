package q6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class code {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("/home/harish/eclipse-workspace/Zoho_exe/src/q3/code.java");
		File f2 = new File("Copied_text.txt");
		
		try {
			FileInputStream fis= new FileInputStream(f1);
			System.out.println(fis.available());
			
			
		}
		catch(FileNotFoundException e) {
			System.out.println(e+"File not Found");
		}
		catch(IOException e) {
			System.out.println(e+"Error with file");
		}
		
		
	}

}
