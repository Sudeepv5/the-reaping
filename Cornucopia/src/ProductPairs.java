import java.util.HashMap;


public class ProductPairs{
	
	public static void main(String[] args) {
		int[] arr={2,3,0,4,1,6,9,2,12,-8,-1,-6};
		//printPairs(arr,4);
		printSumPairs(arr,4);
	}
    
    public static void printPairs(int[] arr, int k)
    {
        HashMap<Integer,Integer> pairs=new HashMap<Integer,Integer>();
        
        for(int i=0;i<arr.length;i++)
        {
        if(arr[i]!=0 && k%arr[i]==0){
        int p=k/arr[i];
        if(pairs.containsKey(p))
        	System.out.println(p+", "+arr[i]);
        else
        	pairs.put(arr[i],p);
        }
        }
    
    }
    
    public static void printSumPairs(int[] arr, int k)
    {
        HashMap<Integer,Integer> pairs=new HashMap<Integer,Integer>();
        
        for(int i=0;i<arr.length;i++)
        {
        
        int p=k-arr[i];
        if(pairs.containsKey(p))
        	System.out.println(p+", "+arr[i]);
        else
        	pairs.put(arr[i],p);
        
        }
    
    }
}