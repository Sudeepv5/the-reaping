
public class Fibonacci {
	
	public static void main(String[] args)
	{
		
		Fibonacci f=new Fibonacci();
		for(int i=1;i<=10;i++)
		System.out.println(f.Fib(i));
	}
	
	public int Fib(int n)
	{
		if(n<=2)
			return 1;
		return Fib(n-1)+Fib(n-2);
	}

}
