//Implement a Queue.
//[TIP] Extend Vector and add additional methods to perform enqueue and dequeue.
//Display a menu like below and allow user to perform enqueue and dequeue.
//	1.Enqueue
//	2.Dequeue
//	3.List
//		Enter your Choice:

package q10;

import java.util.Scanner;
import java.util.Vector;

public class code {

	public static void main(String[] args) {
		Vector<Integer> queue = new Vector<>();
		Scanner s = new Scanner(System.in);
		int n = 0;
		while(true) {
			System.out.println();
			System.out.println("1.Enqueue\n2.Dequeue\n3.List\n4.quit");
			System.out.println();
			n = s.nextInt();
			
			if(n == 4) {
				System.out.println("Program terminated");
				return;
				}
			
			switch(n) {
				case 1:{
					System.out.println("Enter the value");
					int val = s.nextInt();
					queue.add(val);
					System.out.println(val+" Enqueued");
					System.out.println();
					break;
				}
				case 2:{
					if(queue.isEmpty())
						System.out.println("Queue is empty");
					else {
						int val = queue.get(0);
						queue.remove(0);
						System.out.println(val+" Dequeued");
						System.out.println();
						break;
					}
				}
				case 3:{
					for(int i=0;i<queue.size();i++)
						System.out.print(queue.get(i) +" ");
						System.out.println();
					break;
				}
				
				default:
					System.out.println("Enter values given in the list");
			
			}
			
		}
		

	}

}
