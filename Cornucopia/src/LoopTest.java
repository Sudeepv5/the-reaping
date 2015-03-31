import java.math.BigInteger;


public class LoopTest {
	
	public static void main(String[] args)
	{
		//System.out.println(multiply("45345643245643245643","2345675432456754345675435675435643"));
		//System.out.println(sqrtM(0));
		System.out.println(hammingWeight(21));
	}
	
	public static int hammingWeight(long n) 
		{
        int count=0;
        for(long i=n;i>0;i>>=1)
        count+=i&1;
        
        return count;
        
    }
		
	public static String multiply(String num1, String num2) {
		        BigInteger n1=new BigInteger(num1);
		        BigInteger n2=new BigInteger(num2);
		        BigInteger n3=n1.multiply(n2);
		        return n3.toString();
		    }
		   
	public static int sqrtM(int x) {
		        int low=1;
		        int high=x;
		        int mid;
		        if(x==0)
		        	return 0;
		        while(true)
		        {
		            mid=low+(high-low)/2;
		            if(mid>x/mid)
		            high=mid;
		            else if(mid<x/mid)
		            low=mid;
		            else
		            return mid;
		            
		            if(high-low==1)
		            {
		            	if(high<=x/high)
		            		return high;
		            	if(low<=x/low)
		            		return low;
		            }
		            
		        }
		        
		        
		    }

	
}
