package q3;

import java.util.Random;

public class code {

	public static void main(String[] args) {
		Random rand = new Random();
		int arr[][][] = new int[4][5][8];
		
		for(int i=0;i<4;i++)
			for(int j=0;j<5;j++) {
				arr[i][j][0] = rand.nextInt(100);
				System.out.print("["+i+"]["+j+"] = "+arr[i][j][0] + "| ");
				for(int k=0;k<8;k++) {
					arr[i][j][k] = rand.nextInt(100);
					System.out.print(arr[i][j][k] +" ");

				}
				System.out.println();
			}
	}

}
