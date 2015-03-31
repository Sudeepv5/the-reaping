
public class SLinkedList{

	private Node head;
	
	public Node getHead()
	{
		return head;
	}
	
	public void setHead(Node newHead)
	{
		head=newHead;
	}

	public SLinkedList()
	{
		head=null;	
	}
	
	public Node last()
	{
		Node n=head;
		while(n.next!=null)
			n=n.next;
		return n;		
	}
	
	public void addHead(Object v)
	{
		addHead(new Node(v));
	}
	
	public void addHead(Node newHead)
	{
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
		Node newTail=new Node(v);
		if(head==null)
			head=newTail;
		else
		{
			Node temp=head;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=newTail;
		}
		

	}
	
	public void delete(Object v)
	{
		Node temp=head;
		if(head.data==v)
			head= head.next;
		else{
		while(temp.next!=null)
		{
			if(temp.next.data==v)
				{
					temp.next=temp.next.next;
					break;
				}
			temp=temp.next;		
		}
		}
	}
	
	public void printList()
	{
		Node n=head;
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
		Node temp=head;
		SLinkedList reversed=new SLinkedList();
		while(temp!=null)
		{
			reversed.addHead(temp.data);
			temp=temp.next;
		}
		return reversed;
	}
	
	public Node reverseTwo()
	{
		Node next=null,rev=null;
		Node root=head;
		while(root!=null)
		{
			next=root.next;
			root.next=rev;
			rev=root;
			root=next;
		}
		return rev;
		
	}
	
	public boolean isEqualTo(SLinkedList check)
	{
		Node first=this.head;
		Node second=check.head;
		while(first!=null && second!=null)
		{
			if(first.data!=second.data)
				return false;
			first=first.next;
			second=second.next;
		}
		if(first==null && second==null)
			return true;
		else
			return false;
		
	}
	

	public class Node {
		
		private Object data;
		private Node next;
	
		Node()
		{}
	
		Node(Object v)
		{
			this.data=v;
			this.next=null;
		}
		
		public Object getData()
		{
			return data;
		}
		
		public void setData(Object data)
		{
			this.data=data;
		}
		
		public Node getNext()
		{
			return next;
		}
		
		public void setNext(Node next)
		{
			this.next=next;
		}
		
	}
	
	public static void main(String[] args) {
		SLinkedList sl=new SLinkedList();
		sl.addTail(1);
		sl.addTail(2);
		sl.addTail(3);
		sl.addTail(3);
		sl.addTail(2);
		sl.addTail(1);
		sl.printList();
		SLinkedList sl1=new SLinkedList();
		sl1.addTail(1);
		sl1.addTail(2);
		sl1.addTail(3);
		sl1.addTail(4);
		sl1.addTail(2);
		sl1.addTail(1);
		sl1.printList();
		
		System.out.println(sl1.isEqualTo(sl));
		System.out.println(sl1.isPalindrome());
		System.out.println(sl.isPalindrome());
	}
	
	public boolean isPalindrome()
	{
		return (this.isEqualTo(this.reverse()));
	}
	
	

}
