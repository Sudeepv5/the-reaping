
public class MergeSort {
	
	public static void main(String[] args) {
		
		int[] nm={3,2,6,1,8,0,43,2,45};
		MergeSort ms=new MergeSort();
		ms.Sort(nm,0,nm.length-1);
		for(int i=0;i<nm.length;i++)
			System.out.println(nm[i]);
		
	}
	
	private void Sort(int[] arr,int start,int end) {
		
		int mid=(start+end)/2;
				
		if(start<end)
		{
			Sort(arr,start,mid);
			Sort(arr,mid+1,end);
			Merge(arr,start,mid,end);
		}

	}
	
	private void Merge(int[] arr, int start, int mid, int end) {
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



}
