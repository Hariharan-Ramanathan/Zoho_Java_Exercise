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

// same as 10

package q11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    static final int ADD_NUMBER = 1;
    static final int DELETE_NUMBER = 2;
    static final int LIST = 3;
    static final int SEARCH = 4;
    static final int QUIT = 5;
    public static void main(String args[]) throws IOException{
       
        Scanner sc = new Scanner(System.in);

        File contacts = new File("./q11/contacts.txt");
        
        while(true){
            System.out.println("\n1.Add Numbers\n2.Delete Numbers\n3.List all\n4.Search\n5.quit\n");
            int n = sc.nextInt();
            sc.nextLine();
            
            Operations op = new Operations();


            if(n == QUIT)
                return ;
            switch(n){
                case ADD_NUMBER:{
                    op.add_number(contacts);
                    break;
                }
                case DELETE_NUMBER:{
                    op.delete_number(contacts);
                    break;
                    }

                case LIST:{
                    op.list(contacts);
                    break;
                }

                case SEARCH:{
                    op.search(contacts);
                    break;
                }
            }
        }
    }
}
