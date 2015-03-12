import java.math.BigInteger;
import java.util.Scanner;


public class isFibonacci {
	
	public static void printFibo(BigInteger n)
    {
	
    BigInteger first=new BigInteger("0");
    BigInteger second=new BigInteger("1");
    long start=System.currentTimeMillis();
    long end;
    while(first.compareTo(n)<=0)
        {
        BigInteger temp=first.add(second);
        first=second;
        second=temp;
        if(first.compareTo(n)==0)
            {
        	end=System.currentTimeMillis();
            System.out.println("IsFibo "+(end-start));
            return;
        }
    }
    end=System.currentTimeMillis();
    System.out.println("IsNotFibo "+(end-start));
    return;
}

public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int c=Integer.parseInt(in.nextLine());
    for(int i=0;i<c;i++)
        printFibo(new BigInteger(in.nextLine()));
    
    in.close();
}

}
