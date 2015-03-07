
public class ChildStairCase {
	static int count1=0,count2=0;
	public static void main(String[] args)
    {
		ChildStairCase cs=new ChildStairCase();
		int[] result=new int[11];
       System.out.println("Ans: " + cs.Solution(10,result));
       System.out.println("Ans: " + cs.SolutionOne(10));
       System.out.println(count1+" "+count2);
       
       
    }
    public int Solution(int n,int[] result)
    {
    	count1++;
        
        if (n == 0 | n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (n == 3)
            return 4;
        if(result[n]!=0)
        	return result[n];
        result[n] = Solution(n - 1,result) + Solution(n - 2,result) + Solution(n - 3,result); 
        
        return result[n];
    }
    public int SolutionOne(int n)
    {
    	
        count2++;
        if (n == 0 | n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (n == 3)
            return 4;

       return SolutionOne(n - 1) + SolutionOne(n - 2) + SolutionOne(n - 3); 
        
       
    }

}
