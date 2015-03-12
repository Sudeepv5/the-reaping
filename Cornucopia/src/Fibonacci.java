
public class Fibonacci {
	
	public static void main(String[] args)
	{
		
		//Fibonacci f=new Fibonacci();
		//for(int i=1;i<=10;i++)
		//System.out.println(f.Fib(i));
		FibPrint(30);
	}
	
	public int Fib(int n)
	{
		if(n<=2)
			return 1;
		return Fib(n-1)+Fib(n-2);
	}
	
	public static void FibPrint(int n)
	{
		int first=0,second=1;
		for(int i=0;i<n;i++){
			//System.out.println(first);
			int temp=first;
			first=second;
			second=temp+second;
		}
		System.out.println(first);
	}

}
