
public class BinaryTests {
	
	public static void main(String[] args) {
		
		System.out.println(countOnes(10));
		System.out.println(setBit(10,2));
		System.out.println(getBit(10,3));
		System.out.println(clearBit(10,4));
		System.out.println(clearBitstoLSB(10,2));
		
	}
	
	public static int countOnes(int n)
	{
		int count=0;
		for(int i=n;i>0;i>>=1)
		{
			if((i&1)==1)
			count++;
		}
		
		return count;
		
	}
	
	public static int setBit(int n,int i)
	{		
		return n|(1<<i);
	}
	
	public static int clearBit(int n,int i)
	{		
		return n&~(1<<i);
	}

	public static int clearBitstoLSB(int n,int i)
	{		
		return n&~((1<<i)-1);
	}
	
	
	
	public static int getBit(int n,int i)
	{		
		if((n&(1<<i))>0)
			return 1;
		else
			return 0;
	}
	
	
	
	
	
	
	

}
