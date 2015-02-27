
public class RotateString {
	
	public static void main(String[] args) {
		System.out.println(rotate("abcdef",-10));
	}

	
	public static String rotate(String str,int n)
	{
		
		if(str=="")
			return "";
		int len=str.length();
		if(n>0)
			n= n>len?n-len:n;
		else
			n=Math.abs(n)>len?n+2*len:n+len;
		str+=str;
		return str.substring(len-n, 2*len-n);
		
	}
}
