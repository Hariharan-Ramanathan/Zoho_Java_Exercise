// 3. Write a program that randomly fills a 4 by 5 by 8 array, then prints the largest and smallest values in the array.Output should print the contents of the matrix and the largest and smallest values.


package q3;

import java.util.Random;

public class code {

	public static void main(String[] args) {
		Random rand = new Random();
		int small = Integer.MAX_VALUE;
		int large = 0;
		int arr[][][] = new int[4][5][8];
		
		for(int i=0;i<4;i++)
			for(int j=0;j<5;j++) {
				for(int k=0;k<8;k++) {
					arr[i][j][k] = rand.nextInt(100);
						if(arr[i][j][k] < small)
							small = arr[i][j][k];
						if(arr[i][j][k] > large)
							large = arr[i][j][k];
				}
			}
		
		for(int i=0;i<4;i++)
			for(int j=0;j<5;j++) {
				System.out.print("["+i+"]["+j+"] =" + arr[i][j][0]+ " | " );
				for(int k=1;k<8;k++)
						System.out.print(arr[i][j][k]+" ");
				System.out.println();
			}
		System.out.println("Small num = "+small);
		System.out.println("Large num = "+large);
		
	}

}
