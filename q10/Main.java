//Implement a Queue.
//[TIP] Extend Vector and add additional methods to perform enqueue and dequeue.
//Display a menu like below and allow user to perform enqueue and dequeue.
//	1.Enqueue
//	2.Dequeue
//	3.List
//		Enter your Choice:

// seperate class and give good var name for case

package q10;

import java.util.Scanner;
import java.util.Vector;

public class Main {
	static final int ENQUEUE = 1;
	static final int DEQUEUE = 2;
	static final int LIST = 3;
	static final int QUIT = 4;
	public static void main(String[] args) {
		Vector<Integer> queue = new Vector<>();
		Scanner s = new Scanner(System.in);
		int n = 0;
		while(true) {
			System.out.println("\n1.Enqueue\n2.Dequeue\n3.List\n4.quit\n");
			n = s.nextInt();

			q_operations q = new q_operations();
			
			if(n == QUIT) {
				System.out.println("Program terminated");
				return;
				}
			
			switch(n) {
				case ENQUEUE:{
					q.enqueue(queue);
					break;
				}
				case DEQUEUE:{
					int val = q.dequeue(queue);
					break;
				}
				case LIST:{
					q.list(queue);
					break;
				}
				
				default:
					System.out.println("Enter values given in the list");
			
			}

			
		}
		

	}

}
