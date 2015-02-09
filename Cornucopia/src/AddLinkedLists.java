
public class AddLinkedLists {
	
	public static void main(String[] args)
	{
		SLinkedListNode list1=new SLinkedListNode(7);
		list1.addTail(1);
		list1.addTail(6);
		list1.addTail(2);
		SLinkedListNode list2=new SLinkedListNode(5);
		list2.addTail(9);
		//list2.addTail(2);
		AddLinkedLists a=new AddLinkedLists();
		a.add(list1, list2).printList();
		//System.out.println(a.LinkedtoNum(list2));
		
	}
	
	public SLinkedListNode add(SLinkedListNode head1,SLinkedListNode head2)
	{

		return NumtoLinked(LinkedtoNum(head1)+LinkedtoNum(head2));
		
	}
	
	public int LinkedtoNum(SLinkedListNode head)
	{
		SLinkedListNode node=head;
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
	
	public SLinkedListNode NumtoLinked(int n)
	{
		SLinkedListNode list=null;
		while(n!=0)
		{
			if(list==null)
				list=new SLinkedListNode(n%10);
			else
				list.addTail(n%10);
			n/=10;
		}
		
		return list;
	}

}
