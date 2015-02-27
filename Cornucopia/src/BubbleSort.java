
public class BubbleSort {
	
	public static void main(String[] args)
	{
		int a[]=new int[]{65,34,25,43,78,2,76,19,12,9};
		bubbleSort(a);
		int len=a.length;
		for(int i=0;i<len;i++)
			System.out.println(a[i]);
	}
	
	
	public static void bubbleSort(int[] arr)
	{
		int len = arr.length;
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
				if(arr[i]>arr[j])
				{
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
					//swap(arr[i],arr[j]);
					
		}
		//return arr;
	}

	public static void swap(int x, int y)
	{
		x=x+y;
		y=x-y;
		x=x-y;
		
	}
}
