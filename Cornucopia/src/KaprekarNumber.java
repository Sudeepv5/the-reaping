
import java.util.*;


public class KaprekarNumber {
    
    
    public static void getKNumbers(int start, int end)
        {
    	isKNumber(38962);
        String nums="";
        for(int i=start;i<=end;i++)
            {
            if(isKNumber(i))
                nums+=i+" ";
        }
        if(nums=="")
            System.out.println("INVALID RANGE");
        else
            System.out.println(nums);
        
    }
    
    public static boolean isKNumber(int n)
        {
            if(n==1)
                return true;
            long squ=(long)Math.pow(n,2);
            String strnum=""+squ;
        if(strnum.length()>1)
            {
            long left=Integer.parseInt(strnum.substring(0,strnum.length()/2));
            long right=Integer.parseInt(strnum.substring(strnum.length()/2));
            return (n==(left+right));
        }
        else
            return false;
        }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        getKNumbers(in.nextInt(),in.nextInt());

        in.close();
        
    }
}