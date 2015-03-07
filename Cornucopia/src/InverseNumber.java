
import java.util.*;


public class InverseNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int count=0;
        for(int i=n;i>0;i>>=1)
        	count++;
        
       sc.close();
        System.out.println(((int)Math.pow(2,count)-1)-n);
      
    }
}


