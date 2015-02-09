
public class SLinkedListNode{
	Object data;
	SLinkedListNode next;
	SLinkedListNode(Object v)
	{
		data=v;
		next=null;		
	}
	
	public SLinkedListNode last()
	{
		SLinkedListNode n=this;
		while(n.next!=null)
			n=n.next;
		return n;	
			
	}
	
	public void addTail(Object v)
	{
		SLinkedListNode tail=new SLinkedListNode(v);
		SLinkedListNode n=this;
		n=n.last();
		n.next=tail;
	}
	
	public void printList()
	{
		SLinkedListNode n=this;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	

}
