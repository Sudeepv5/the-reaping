
public class TripAdvisor_Puzzles {
	
	public static void main(String[] args)
	{
		TripAdvisor_Puzzles p=new TripAdvisor_Puzzles();
		
		System.out.println(p.Fast_Powers_Test(1025));
		System.out.println(p.Lots_Of_Zeros(10));
		System.out.println(TripAdvisor_Puzzles.parity("o"));
		
	}
	
	public boolean Fast_Powers_Test(int n)
	{
		if(n == 2)
			return true;
		else if (n%2==0)
			return Fast_Powers_Test(n/2);
		else
			return false;	
	}
	
	public int Lots_Of_Zeros(int n)
	{
		int noftens=0, noffivetwos=0;
		noftens=n/10;
		if(n%10 >= 5)
			noffivetwos=noftens+1;
		else
			noffivetwos=noftens;
		
		return noftens+noffivetwos;
	}
	
	public static String parity(String str)
	{
		String Paritystr=null;
		int n= str.hashCode();
		switch(n%2)
		{
		case 0: Paritystr="even";break;
		case 1: Paritystr="odd";break;
		}
		return Paritystr;
		
		
	}

}
