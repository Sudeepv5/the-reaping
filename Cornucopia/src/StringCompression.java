import java.util.Scanner;


public class StringCompression {
	
	public static void main(String[] args){		
		Scanner in =new Scanner(System.in);
		int c=Integer.parseInt(in.nextLine());
		for(int i=0;i<c;i++)
			System.out.println(compress(in.nextLine()));
		
		in.close();

	}

	private static String compress(String line) 
	{
		int len=line.length();
		StringBuilder sb=new StringBuilder();
		int count=1;

		for(int i=1;i<len;i++)
		{
			if(line.charAt(i)==line.charAt(i-1))
				count++;
			else
			{
				if(count>1)
					sb.append(""+line.charAt(i-1)+count);
				else
					sb.append(line.charAt(i-1));
				count=1;
			}
				
		}
		
			if(count>1)
				sb.append(""+line.charAt(len-1)+count);
			else
				sb.append(line.charAt(len-1));
	

		return sb.toString();	
	}
	
	
	

}
