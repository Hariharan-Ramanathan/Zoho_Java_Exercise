package q11;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Operations {

    public void add_number(File contacts) throws IOException {
        Scanner sc = new Scanner(System.in);

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
        }else{
            System.out.println("Enter number");
            String num = sc.nextLine();
            String ip = name + " " + num;
            fos.write(ip.getBytes());
            String newLine = System.getProperty("line.separator");
            dos.writeBytes(newLine);
            System.out.println(name+" Added to contacts");
        }

         search.close();
        //  sc.close();
         fos.close();
         dos.close();
                    
    }

    public void delete_number(File contacts) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
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
        // System.out.println("str"+str);
        p.close();
        temp.close();

    }

    public void list(File contacts) throws IOException {
        FileInputStream read_contact = new FileInputStream(contacts);
        int val = 0;
        while((val = read_contact.read())!=-1){
            System.out.print((char)val);
        }
        read_contact.close();
    }

    public void search(File contacts) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
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
    }

}
