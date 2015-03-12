
public class AddLinkedLists {
	
	public static void main(String[] args)
	{
		SLinkedList list1=new SLinkedList(7);
		list1.addTail(1);
		list1.addTail(6);
		list1.addTail(2);
		list1.printList();
		SLinkedList list2=new SLinkedList(5);
		list2.addTail(9);
		list2.addTail(2);
		
		list2.printList();
		add(list1.head, list2.head).printList();
		//System.out.println(a.LinkedtoNum(list2));
		
	}
	
	public static SLinkedList add(SNode head1,SNode head2)
	{

		return NumtoLinked(LinkedtoNum(head1)+LinkedtoNum(head2));
		
	}
	
	public static int LinkedtoNum(SNode head)
	{
		SNode node=head;
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
	
	public static SLinkedList NumtoLinked(int n)
	{
		SLinkedList list=null;
		while(n!=0)
		{
			if(list==null)
				list=new SLinkedList(n%10);
			else
				list.addTail(n%10);
			n/=10;
		}
		
		return list;
	}

}
