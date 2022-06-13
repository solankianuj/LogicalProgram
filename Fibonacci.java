package logical;

public class Fibonacci {
	public static void main(String[] args) {
		//fiboNacci(3);
		//System.out.println(fiboNacci(47));
		System.out.println(fib(9));
	}

	 static long fiboNacci(long n) {
		if (n<=1) { 
		return n;	}
		return fiboNacci(n-1) + fiboNacci(n-2);
		
	}
		
		
		static long fib(long n) {
			long f[]=new long [(int) (n+2)];
			f[0]=0;
			f[1]=1;
			for (int i=2;i<=n;i++) {
				f[i]=f[i-1] +f[i-2];
				
			}
			return f[(int) n];
		}
		

}
