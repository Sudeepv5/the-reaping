
public class Sorting {
	public static void main(String[] args) {
		int[] arr={57,32,21,-5,0,34,23,6,98,14};
		//insertionSort(arr);
		//selectionSort(arr);
		printArray(arr);
		//bubbleSort(arr);
		//mergeSort(arr);
		quickSort(arr);
		printArray(arr);
	}
	
	public static void insertionSort(int[] arr)
	{
		/*Worst Case Time: O(n^2) comparisons,swaps
		 *Best Case Time: O(n) comparisons,O(1)swaps
		 *Extra Space: O(1)*/
		int len=arr.length;
		for(int i=1;i<len;i++){
			for(int j=i;j>0&&arr[j]<arr[j-1];j--)
			{
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	public static void selectionSort(int[] arr)
	{
		/*Worst Case Time: O(n^2) comparisons,O(n)swaps
		 *Best Case Time: O(n^2) comparisons,O(1)swaps
		 *Extra Space: O(1)*/
		int len=arr.length;
		int mIndex;
		for(int i=0;i<len;i++){
			mIndex=i;
			for(int j=i+1;j<len;j++)
			{
				if(arr[mIndex]>arr[j])
					mIndex=j;
			}
			if(mIndex!=i)
			{
				int temp=arr[mIndex];
				arr[mIndex]=arr[i];
				arr[i]=temp;
			}
		}
	}
	
	public static void bubbleSort(int[] arr)
	{
		/*Worst Case Time: O(n^2) comparisons,swaps
		 *Best Case Time: O(n) comparisons,O(1)swaps
		 *Extra Space: O(1)*/
		int len=arr.length;
		boolean swapped=true;
		while(swapped){
			swapped=false;
			for(int j=1;j<len;j++){
				if(arr[j-1]>arr[j]){
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					swapped=true;
				}
			}
		}
	}
	
	public static void mergeSort(int[] arr)
	/*Worst Case Time: O(nlogn) comparisons,swaps
		 *Best Case Time: O(nlogn) comparisons,swaps
		 *Extra Space: O(n)*/
	{
		mergeSort(arr,0,arr.length-1);
	}
	
	private static void mergeSort(int[] arr,int start,int end) {
		
		int mid=(start+end)/2;
				
		if(start<end)
		{
			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);
			Merge(arr,start,mid,end);
		}

	}
	
	private static void Merge(int[] arr, int start, int mid, int end) {
			int[] temp=new int[end+1];
			for(int i=0;i<=end;i++)
				temp[i]=arr[i];
			
			int f=start,l=start;
			int m=mid+1;
			
			while(f<=mid && m<=end){
				if(temp[f]<=temp[m])
				{
					arr[l]=temp[f];
					f++;
				}
				else {
					arr[l]=temp[m];
							m++;
				}
				l++;
			}
			
			while(f<=mid)
			{
				arr[l]=temp[f];
				f++;
				l++;
			}
	}
	
	public static void quickSort(int[] arr)
		/*Worst Case Time: O(n^2) comparisons,swaps
		 *Best Case Time: O(nlogn) comparisons,swaps
		 *Extra Space: O(1)*/
	{
		quickSort(arr,0,arr.length-1);
	}
	
	private static void quickSort(int[] arr,int low,int high)
	{

		int p=pivot(arr,low,high);
		if(low<p-1)
		quickSort(arr,low,p-1);
		if(high>p)
		quickSort(arr,p,high);
		
	}
	
	private static int pivot(int[] arr,int low,int high)
	{
		int start=low;
		int end=high;
		
		int pivot=arr[start];
		while(start<=end)
		{
		while(arr[start]<pivot)
			start++;
		while(arr[end]>pivot)
			end--;
		if(start<=end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		}
		return start;
	}
	
	public static void heapSort(int[] arr)
	{
		
	}

	
	public static void printArray(int[] arr)
	{
		for(int n:arr)
		System.out.print(n+" ");
		System.out.println();
	}

}
