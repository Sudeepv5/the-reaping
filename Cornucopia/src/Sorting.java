
public class Sorting {
	public static void main(String[] args) {
		int[] arr={57,32,21,-5,0,34,23,6,98,14};
		insertionSort(arr);
		printArray(arr);
	}
	
	public static void insertionSort(int[] arr)
	{
		int len=arr.length;
		for(int i=1;i<len;i++){
			for(int j=i;j>0&&arr[j]<arr[j-1];j--)
			{
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				//System.out.print(i+"-> ");
				//printArray(arr);
			}
		}
		
	}
	
	public static void printArray(int[] arr)
	{
		for(int n:arr)
		System.out.print(n+" ");
		System.out.println();
	}

}
