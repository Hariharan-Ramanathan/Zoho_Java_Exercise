// Write an application for storing phone numbers(Like a phone book).
// User must be given options to add, search and delete records. Output should look like the menu below.
// Add numbers
// Delete numbers
// List all
// Search
//       Enter Your Choice:
// For Add numbers option, name and number must be the input. For deleting and searching, name alone is sufficient. If the user selects List all option, all the numbers must be listed.
// The contents must be stored in a file and the file must be read on init of the application.
// Hashtable or Properties can be used to store the data. Key must be name of the person(no duplicates)
// Consider using autoboxing in case you used Hashtable for storing data.


package q11;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class code {
    public static void main(String args[]) throws IOException{
       
        Scanner sc = new Scanner(System.in);

        File contacts = new File("./q11/contacts.txt");
        
        while(true){
            System.out.println("\n1.Add Numbers\n2.Delete Numbers\n3.List all\n4.Search\n5.quit\n");
            int n = sc.nextInt();
            sc.nextLine();
            if(n == 5)
                return ;
            switch(n){
                case 1:{
                    FileOutputStream fos = new FileOutputStream(contacts, true);
                    DataOutputStream dos = new DataOutputStream(fos);

                    Map<String , String> phone_book = new HashMap<>();
                    Scanner search = new Scanner(contacts);
                    while(search.hasNextLine()){
                        String line = search.nextLine();
                        String line_ary[] = line.split(" ");
                         phone_book.put(line_ary[0], line_ary[1]);
                    }
                    System.out.println("Enter name");
                    String name = sc.nextLine();
                    if(phone_book.containsKey(name)){
                        System.out.println("Name Already exists");
                        break;
                    }

                    System.out.println("Enter number");
                    String num = sc.nextLine();
                    String ip = name + " " + num;
                    fos.write(ip.getBytes());
                    String newLine = System.getProperty("line.separator");
                    dos.writeBytes(newLine);
                    System.out.println(name+" Added to contacts");
                   
                    search.close();
                    fos.close();
                    dos.close();
                    break;
                }
                case 2:{
                    Scanner temp = new Scanner(contacts);
                    StringBuilder sb = new StringBuilder();

                    System.out.println("Enter name");
                    String name = sc.nextLine();
                    while(temp.hasNextLine()){
                        String str = temp.nextLine();
                        String[] str_ary = str.split(" ");
                        if(!str_ary[0].equals(name)){
                            sb.append(str);
                            sb.append(System.lineSeparator());
                        }
                    }
                    String str = sb.toString();
                    PrintWriter p = new PrintWriter(contacts);
                    p.print(str);
                    System.out.println("str"+str);
                    p.close();
                    temp.close();
        
                    break;
                    }

                case 3:{
                    FileInputStream read_contact = new FileInputStream(contacts);
                    int val = 0;
                    while((val = read_contact.read())!=-1){
                        System.out.print((char)val);
                    }
                    read_contact.close();
                    break;
                }

                case 4:{
                    System.out.println("Enter the name");
                    String name = sc.nextLine();
                    Map<String , String> phone_book = new HashMap<>();

                    Scanner search = new Scanner(contacts);
                    while(search.hasNextLine()){
                        String line = search.nextLine();
                        String line_ary[] = line.split(" ");
                         phone_book.put(line_ary[0], line_ary[1]);
                    }
                    if(phone_book.containsKey(name)){
                        System.out.println("Number = "+phone_book.get(name));
                    }else
                        System.out.println("No Such name found");
                    search.close();
                    break;
                }
            }
        }
    }
}
