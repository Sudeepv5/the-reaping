
public class FibonacciMemo {
	public static void main(String[] args) {
		
		int[] cache=new int[7];

		fibonacciMemo(6,cache);
		fibonacciTable(6);

		
		
		
	}
	
	public static int fibonacciMemo(int n,int[] cache)
	{
		if(n==0 || n==1)
			return 1;
		if(cache[n]!=0)
			return cache[n];
		
		int ret=fibonacciMemo(n-1,cache)+fibonacciMemo(n-2,cache);
		cache[n]=ret;
		
		
		return ret;
		
	}
	
	public static void fibonacciTable(int n)
	{
		int[] fib=new int[n];
		fib[0]=1;
		fib[1]=1;
		for(int i=2;i<n;i++)
			fib[i]=fib[i-1]+fib[i-2];

		for(int i=0;i<n;i++)
		System.out.println(fib[i]);
		
	}

}
