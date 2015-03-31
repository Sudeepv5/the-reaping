
import java.util.HashMap;


public class RepeatingSubstrings {
	
	public static void main(String[] args) {
		HashMap<String,Integer> repSubs=new HashMap<String, Integer>();
		String str="deepdeep";
		for(int i=3;i<str.length();i++)
		repeatingSubs(repSubs,str,i);
		for(String s:repSubs.keySet())
			if(repSubs.get(s)>1)
				System.out.println(s);
		
	}
	
	public static void repeatingSubs(HashMap<String,Integer> subCounts,String str,int n)
	{
		int len=str.length()-n+1;
		int count=0;
		for(int j=0;j<len;j++)
		{
		String sub=str.substring(j,j+n);
		if(subCounts.containsKey(sub))
		{
			count=subCounts.get(sub)+1;
			subCounts.put(sub, count);
		}
		else
			subCounts.put(sub, 1);
		}
	}

}
