
public class SListNode<T> {
	T data;
	SListNode<T> next;
	public SListNode()
	{}
	
	public SListNode(T v)
	{
		this.data=v;
		this.next=null;
	}
	
	public void add(T v)
	{
		SListNode<T> newNode=new SListNode<T>(v);
		SListNode<T> head=this; 
		
		if(head.data==null)
		{
			head=newNode;
		}
		else{
		while(head.next!=null)
		{
			head=head.next;
		}
		head.next=newNode;
		}
	}
	
	public SListNode<T> last()
	{
		SListNode<T> temp=this;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		return temp;
	}
	
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		SListNode<T> head=this;
		while(head.next!=null)
		{
			sb.append(head.data.toString());
			sb.append("->");
			head=head.next;
		}
		sb.append(head.data);
		return sb.toString();
	}
	
	public void print()
	{
		SListNode<T> head=this;
		System.out.println(head.toString());
	}
}
