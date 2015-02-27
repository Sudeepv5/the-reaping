
public class NumGenerator {
	
	public static void main(String[] args)
	{
		System.out.println(genNumber(6,5));
	}
	
	public static int genNumber(int n, int x)
	{
		int mask=(1<<n)-1;
		String smask=Integer.toBinaryString(mask);
		int ret=Integer.parseInt(smask);
		
		return ret*5;
	}

}
