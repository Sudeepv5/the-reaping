
public class SLinkedList{

	SNode head;
	
	
	SLinkedList()
	{}
	SLinkedList(Object v)
	{
		head=new SNode(v);	
	}
	
	public SNode last()
	{
		SNode n=head;
		while(n.next!=null)
			n=n.next;
		return n;		
	}
	
	public void addHead(Object v)
	{
		SNode newHead = new SNode(v);
		if(head==null)
			head=newHead;
		else
		{
			newHead.next=head;
			head=newHead;
		}
	}
	
	public void addTail(Object v)
	{
		SLinkedList list=this;
		if(head==null)
			addHead(v);
		else
			list.last().next=new SNode(v);

	}
	
	public void printList()
	{
		SNode n=head;
		while(n.next!=null)
		{
			System.out.print(n.data+"->");
			n=n.next;
		}
		System.out.print(n.data);
		System.out.println();
	}
	
	
	public SLinkedList reverse()
	{
		SNode temp=head;
		SLinkedList reversed=new SLinkedList();
		while(temp!=null)
		{
			reversed.addHead(temp.data);
			temp=temp.next;
		}
		return reversed;
	}
	
	

}
