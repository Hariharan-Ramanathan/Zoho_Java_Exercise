package q10;

import java.util.Scanner;
import java.util.Vector;

public class q_operations {
    public void enqueue(Vector<Integer> queue){
		Scanner s = new Scanner(System.in);
        System.out.println("Enter the value");
		int val = s.nextInt();
		queue.add(val);
		System.out.println(val+" Enqueued");
		System.out.println();


	}

	public int dequeue(Vector<Integer>queue){
		int val = -1;
		if(queue.isEmpty())
			System.out.println("Queue is empty");
		else {
			val = queue.get(0);
			queue.remove(0);
			System.out.println(val+" Dequeued");
			System.out.println();
		}
		return val;
	}

    public void list(Vector<Integer> queue) {
		for(int i=0;i<queue.size();i++)
			System.out.print(queue.get(i) +" ");
		System.out.println();
    }
}
