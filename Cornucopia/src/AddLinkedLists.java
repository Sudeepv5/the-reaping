
public class AddLinkedLists {
	
	public static void main(String[] args)
	{
		SListNode<Integer> list1=new SListNode<Integer>(5);
		list1.add(1);
		list1.add(6);
		list1.add(2);
		list1.print();
		SListNode<Integer> list2=new SListNode<Integer>(6);
		list2.add(9);
		list2.add(2);
		
		list2.print();
		add(list1, list2).print();
		
	}
	
	public static SListNode<Integer> add(SListNode<Integer> head1,SListNode<Integer> head2)
	{

		return NumtoLinked(LinkedtoNum(head1)+LinkedtoNum(head2));
		
	}
	
	public static int LinkedtoNum(SListNode<Integer> head)
	{
		SListNode<Integer> node=head;
		int num=0,i=0;
		while(node!=null)
		{
			if(i==0)
				num+=(int)node.data;
			else
				num+=Math.pow(10, i)*(int)node.data;
			i++;
			node=node.next;
		}
		return num;
	}
	
	public static SListNode<Integer> NumtoLinked(int n)
	{
		SListNode<Integer> list=null;
		while(n!=0)
		{
			if(list==null)
				list=new SListNode<Integer>(n%10);
			else
				list.add(n%10);
			n/=10;
		}
		
		return list;
	}

}
