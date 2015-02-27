
public class ChildStairCase {
	
	public static void main(String[] args)
    {
        
       System.out.println("Ans: " + Solution(10));
        
    }
    public static int Solution(int n)
    {
        int result[] = new int[n+1];
        if (n == 0 | n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (n == 3)
            return 4;
        if(result[n]!=0)
        	return result[n];
        result[n] = Solution(n - 1) + Solution(n - 2) + Solution(n - 3); 
        
        return result[n];
    }

}
