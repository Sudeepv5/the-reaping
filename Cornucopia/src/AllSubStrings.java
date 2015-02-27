import java.util.ArrayList;


public class AllSubStrings {
	
	public static void main(String[] args) {
		ArrayList<String> allsubs=	genSubStrings("Sudeep");
		for(String s: allsubs)
		System.out.println(s);
	}
	
	public static ArrayList<String> genSubStrings(String str)
	{
		ArrayList<String> allsubs=new ArrayList<String>();
		int len=str.length();
		for(int i=0;i<len;i++)
			for(int j=i+1;j<=len;j++)
				allsubs.add(str.substring(i,j));
		
		return allsubs;
		
	}
	
	

}
