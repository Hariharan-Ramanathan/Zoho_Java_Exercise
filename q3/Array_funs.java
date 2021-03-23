package q3;

import java.util.Random;

public class Array_funs {
    public void give_random(int arr[][][], int r, int c, int h){
        Random rand = new Random();
		
        for(int i=0;i<r;i++)
			for(int j=0;j<c;j++) {
				for(int k=0;k<h;k++) {
					arr[i][j][k] = rand.nextInt(100);
						if(arr[i][j][k] < Main.small)
							Main.small = arr[i][j][k];
						if(arr[i][j][k] > Main.large)
							Main.large = arr[i][j][k];
				}
			}
    }

    public void print(int[][][] arr, int r, int c, int h) {
		for(int i=0;i<r;i++)
        for(int j=0;j<c;j++) {
            System.out.print("["+i+"]["+j+"] =" + arr[i][j][0]+ " | " );
            for(int k=1;k<h;k++)
                    System.out.print(arr[i][j][k]+" ");
            System.out.println();
        }
    }
    public int small_val(int arr[][][], int r, int c, int h){
        int small = Integer.MAX_VALUE;
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                for(int k=0;k<h;k++)
                    if(small < arr[i][j][k])
                        small = arr[i][j][k];
        
        return small;
    }

    public int large_val(int arr[][][], int r, int c, int h){
        int large = Integer.MIN_VALUE;
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                for(int k=0;k<h;k++)
                    if(large < arr[i][j][k])
                        large = arr[i][j][k];
        
        return large;
    }
}
