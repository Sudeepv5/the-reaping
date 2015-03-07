
import java.util.HashSet;

import java.util.Iterator;


public class StringPerms {
	
	public static void main(String[] args) {
		
		HashSet<String> perms=getPermutations("see");
		Iterator<String> itr=perms.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

	
	public static HashSet<String> getPermutations(String str)
	{
		HashSet<String> perms=new HashSet<String>();
		if(str==null)
			return null;
		if(str.length()==0)
		{
			perms.add("");
			return perms;
		}		
		char first=str.charAt(0);
		
		HashSet<String> remperms =getPermutations(str.substring(1));
		Iterator<String> itr=remperms.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			for(int i=0;i<=s.length();i++)
			{	
				String s1=s.substring(0, i)+first+s.substring(i);		
				if(!perms.contains(s1));						
				perms.add(s1);				
			}			
		}
		return perms;
	}
}
