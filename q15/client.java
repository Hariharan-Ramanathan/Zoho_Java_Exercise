//Write a server/client in java. Refer here . 
//Run the server and client in different machines. 
//Stop the server application and try to connect it from the client. 
//Shut down the server machine and try to connect it from the client. Check what are the errors thrown.
package q15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class client {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s= new Socket("localhost", 4999);
        PrintWriter pw = new PrintWriter(s.getOutputStream());
        
        System.out.println("Server connected");
        System.out.println("----------------");

        pw.println("Hai Server");
        pw.flush();

        InputStreamReader isr = new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(isr);

        String str = br.readLine();
        System.out.println("Server says "+ str);
    }
}
