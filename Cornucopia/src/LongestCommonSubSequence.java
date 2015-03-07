
public class LongestCommonSubSequence {
	
	
	public static void main(String[] args) {
		System.out.println(longestCommonSS("Sudeep","ukyfhjdfedep"));
	}
	
	public static int longestCommonSS(String str1,String str2)
	{
		int m=str1.length();
		int n=str2.length();
		
		int[][] LOC=new int[m+1][n+1];
		
		for(int i=1;i<=m;i++)
			for(int j=1;j<=n;j++)
			{
				if(str1.charAt(i-1)==str2.charAt(j-1))
					LOC[i][j]=1+LOC[i-1][j-1];
				else
					LOC[i][j]=Math.max(LOC[i][j-1], LOC[i-1][j]);
			}
		return LOC[m][n];
	}
	


}
