import java.util.ArrayList;


public class AllSubSets {
	
public static void main(String[] args){
		
		ArrayList<String> allsubs=genSubStrings("Sud");
		for(String s : allsubs)
		{
			System.out.println(s);
		}
	}
	
	
	public static ArrayList<String> genSubStrings(String str)
	{
		ArrayList<String> allsubs=new ArrayList<String>();
		allsubs.add("");
		int len=str.length();
		int mask=(1<<len)-1;
		for(int i=mask;i>0;i--)
		{
			String sub=genSubforInt(str,i);
			allsubs.add(sub);
		}
		return allsubs;
		
	}

	private static String genSubforInt(String str, int i) {
		
		char[] ch=str.toCharArray();
		int index=0;
		String sub="";
		for(int j=i;j>0;j>>=1)
		{
			if((j&1)==1)
				sub+=ch[index];
			index++;
		}
		return sub;
	}

}
