// 4.Program to print Fibonacci series of a number using recursion. Get the number through command line argument. Throw proper errors for wrong inputs.


package q4;

public class code {
	static int fib(int n) {
		if(n == 0 || n == 1)
			return n;
		
		return fib(n-1) + fib(n-2);
	}
	
	public static void main(String args[]) {
		
		int n=0 ;
		
		if(args.length > 0) {

			try {
				n = Integer.parseInt(args[0]);
				System.out.println("Cmd line arg = "+n);
			}
			catch(NumberFormatException e){
				System.out.println(e);
				System.out.println("Enter a Number");
			}
			
		
			
		}else 
			System.out.println("No Cmd line args");
		
		System.out.println("Ans = "+fib(n));
		
		

	}

}
