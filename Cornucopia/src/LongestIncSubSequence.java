
import java.util.*;


public class LongestIncSubSequence {
	
	
    
    
    public static int longestIncSubSeq(int[] arr)
        {
        int n=arr.length;
        int[] LIS=new int[n];
       //LIS[0]=1;
        for(int i=0;i<n;i++)
            {
            LIS[i]=1;
            for(int j=0;j<i;j++)
                if(arr[i]>arr[j])
                LIS[i]=Math.max(LIS[i],LIS[j]+1);
        }
        
        int max=LIS[0];
        for(int k=1;k<n;k++){
            
            if(max<LIS[k])
            max=LIS[k];
            
        }
            
        return max;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in= new Scanner(System.in);
        int c=in.nextInt();
        
        int[] arr=new int[c];
        for(int i=0;i<c;i++){
        	int t=in.nextInt();
            arr[i]=t;
            
        }
        in.close();
        System.out.println(longestIncSubSeq(arr));
    }
}
