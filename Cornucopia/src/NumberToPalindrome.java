
public class NumberToPalindrome {
	
	static int count1=0,count2=0;
	public static void main(String[] args) {
		String s="abcdekjhgjh";
		System.out.println(numberToPalin(s,0,s.length()-1));
		int[][] DP=new int[s.length()][s.length()];

		System.out.println(numberToPalinDP(s,DP,0,s.length()-1));
		
		System.out.println(count1 + " "+ count2);
		
		
		/*for(int i=0;i<DP.length;i++){
			for(int j=0;j<DP[0].length;j++){
				System.out.print(DP[i][j]+" ");
			}
				System.out.println();
		}*/
	}
	
	public static int numberToPalin(String str,int start,int end)
	{
		count1++;
		if(start>=end)
			return 0;
		if(str.charAt(start)==str.charAt(end))
			return numberToPalin(str,start+1,end-1);
		else
			return 1+Math.min(numberToPalin(str,start+1,end),numberToPalin(str,start,end-1));
	}

	public static int numberToPalinDP(String str,int[][] DP,int start,int end)
	{
		count2++;
		if(start>=end)
			return 0;
		if(DP[start][end]!=0)
			return DP[start][end];
		if(str.charAt(start)==str.charAt(end))
			DP[start][end]= numberToPalinDP(str,DP,start+1,end-1);
		else
			DP[start][end] =1+Math.min(numberToPalinDP(str,DP,start+1,end),numberToPalinDP(str,DP,start,end-1));

		return DP[start][end];
	}
	/*
	public static int numberToPalinDPTwo(String str,int start,int end)
	{
		
		if(start>=end)
			return 0;
		if(DP[start][end]!=0)
			return DP[start][end];
		if(str.charAt(start)==str.charAt(end))
			DP[start][end]= numberToPalinDP(str,DP,start+1,end-1);
		else
			DP[start][end] =1+Math.min(numberToPalinDP(str,DP,start+1,end),numberToPalinDP(str,DP,start,end-1));

		return DP[start][end];
	}*/
}
