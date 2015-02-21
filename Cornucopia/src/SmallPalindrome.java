import java.util.*;


public class SmallPalindrome {
	
	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		String str=in.nextLine();
		System.out.println(isPalindrome(str));
		System.out.println(smallPalindrome(str,0));
		in.close();
		
	}
	
	public static int smallPalindrome(String str,int count)
	{
		System.out.println(str);
		if(isPalindrome(str))
			return count;
		//String first=str.substring(0,str.length()/2);
		//System.out.println(first);
		//String second=str.substring(str.length()/2);
		//System.out.println(str);
		
		if(str.charAt(0)==str.charAt(str.length()-1))
			return smallPalindrome(str.substring(1,str.length()-1),count);
		else
			return Math.min(smallPalindrome(str.substring(1),count+1),smallPalindrome(str.substring(0,str.length()-1),count+1));
			
	}
	
	public static boolean isPalindrome(String str)
	{
		int len=str.length();
		for(int i=0,j=len-1;i<=j;i++,j--)
			if(str.charAt(i)!=str.charAt(j))
				return false;

		return true;
		
	}

}
