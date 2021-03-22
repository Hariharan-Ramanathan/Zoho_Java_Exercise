package q15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
   public static void main(String[] args) throws IOException {
       ServerSocket ss = new ServerSocket(4999);
        Socket s = ss.accept();

        InputStreamReader isr = new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(isr);

        String str = br.readLine();

        System.out.println("Client:- "+ str);

        PrintWriter pw = new PrintWriter(s.getOutputStream());
        pw.println("Welcome client");
        pw.flush();


    } 
}
