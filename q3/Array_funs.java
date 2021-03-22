package q3;

import java.util.Random;

public class Array_funs {
    public void give_random(int arr[][][], int r, int c, int h){
        Random rand = new Random();
		
        for(int i=0;i<4;i++)
			for(int j=0;j<5;j++) {
				for(int k=0;k<8;k++) {
					arr[i][j][k] = rand.nextInt(100);
						if(arr[i][j][k] < Main.small)
							Main.small = arr[i][j][k];
						if(arr[i][j][k] > Main.large)
							Main.large = arr[i][j][k];
				}
			}
    }

    public void print(int[][][] arr, int r, int c, int h) {
		for(int i=0;i<4;i++)
        for(int j=0;j<5;j++) {
            System.out.print("["+i+"]["+j+"] =" + arr[i][j][0]+ " | " );
            for(int k=1;k<8;k++)
                    System.out.print(arr[i][j][k]+" ");
            System.out.println();
        }
    }
}
