
import java.util.*;


public class PieSong {
    
    public static String PIE="31415926535897932384626433833";
    
    public static String isPieSong(String str)
        {

        String[] stArray=str.split(" ");
        //if(stArray.length>PIE.length())
         //   return "It's not a pi song.";
        for(int i=0;i<stArray.length;i++)
            {
        	String s=String.valueOf(PIE.charAt(i));
        	String c=alphaCount(stArray[i]);
            if(!c.equals(s))
                return "It's not a pi song.";
        }
        return "It's a pi song.";
        
    }
    
    public static String alphaCount(String str)
        {
        int count=0;
        for(int i=0;i<str.length();i++)
            {
            if(isAlphabet(str.charAt(i)))
               count++;
        }
        return ""+count;
    }
    
    public static boolean isAlphabet(char c)
        {
        return (c>=65 && c<=90) || (c>=97 && c<=122);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int c=Integer.parseInt(in.nextLine());
        
        for(int i=0;i<c;i++)
            System.out.println(isPieSong(in.nextLine()));
        
        in.close();
    }
}