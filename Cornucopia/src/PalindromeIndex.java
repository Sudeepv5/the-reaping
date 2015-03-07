

import java.util.*;


public class PalindromeIndex {
    
    public static String getIndex(String str)
        {
        int len=str.length();
        int i=0;
        int j=len-1;
        while(i<j)
            {
            if(str.charAt(i)==str.charAt(j))
                {
                i++;
                j--;
            }
            else if(str.charAt(i+1)==str.charAt(j))
                return ""+i;
            else if(str.charAt(i)==str.charAt(j-1))
                return ""+j;
            
        }
        return ""+-1;
        
        
    }

    public static void main(String[] args) {
       
        Scanner in=new Scanner(System.in);
        int c=Integer.parseInt(in.nextLine());
        
        for(int i=0;i<c;i++)
            System.out.println(getIndex(in.nextLine()));
        in.close();
    }
}
