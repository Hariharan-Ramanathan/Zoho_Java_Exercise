// 3. Write a program that randomly fills a 4 by 5 by 8 array, then prints the largest and smallest values in the array.Output should print the contents of the matrix and the largest and smallest values.

//create seperate classes 
package q3;

public class Main {
	public static int small = Integer.MAX_VALUE;
	public static int large = 0;
	public static void main(String[] args) {
		
		int arr[][][] = new int[4][5][8];
		
		Array_funs funs = new Array_funs(); 

		funs.give_random(arr, 4, 5, 8);

		funs.print(arr, 4, 5, 8);
		
		System.out.println("Small num = "+small);
		System.out.println("Large num = "+large);
		
	}

}
