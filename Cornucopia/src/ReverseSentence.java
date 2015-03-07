
public class ReverseSentence {
	public static void main(String[] args) {
		//System.out.println(revSentence("life is beautiful"));
		System.out.println(reverseInPlace("life is beautiful"));
	}
	
	public static String revSentence(String str)
	{
		String reversed=reverse(str);
		String[] sent=reversed.split(" ");
		int len=sent.length;
		String ret="";
		
		for(int i=0;i<len;i++)
			ret+=sent[len-i-1]+" ";
		
		return ret;
	}
	
	public static String reverse(String str)
	{
		int len=str.length();
		String ret="";
		for(int i=0;i<len;i++)
		{
			ret+=str.charAt(len-i-1);
		}
		return ret;
	}
	
	public static String reverseInPlace(String str)
	{
		int len=str.length();
		for(int i=len-1;i>=0;i--)str+=str.charAt(i);
		return str.substring(str.length()/2);
	}

}
