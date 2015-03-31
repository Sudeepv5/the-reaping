
public class ReplaceSpace {
	public static void main(String[] args) {
		
		String s1="Mr John Smith    ";
		char[] str=s1.toCharArray();
		replace(str,13);
		System.out.println(str);
	}
	
	public static void replace(char[] str,int len)
	{
		int fLen=str.length;
		for(int i=fLen-1, j=len-1;i>0&&j>0;i--,j--)
		{
			if(str[j]==' ')
			{
				str[i]='0';
				str[--i]='2';
				str[--i]='%';
			}
			else
			{
				str[i]=str[j];
			}
				
		}
		
		
	}

}
