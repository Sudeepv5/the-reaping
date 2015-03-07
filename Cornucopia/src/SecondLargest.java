
public class SecondLargest {
	
	public static void main(String[] args) {
		int[] arr={34,5,2,24,7,67,24,67,3};
		System.out.println(secondLargest(arr));
	}
	
	public static int secondLargest(int[] arr)
	{
		int largest=arr[0];
		int secondLargest=arr[1];
		int temp=0;
		int len=arr.length;
		if(largest<secondLargest)
		{
			temp=largest;
			largest=secondLargest;
			secondLargest=temp;
		}
		
		for(int i=2;i<len;i++)
		{
			if(arr[i]>largest)
			{
				secondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secondLargest && arr[i]<largest)
				secondLargest=arr[i];
		}
		
		
		return secondLargest;
		
	}

}
