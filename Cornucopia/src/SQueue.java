
public class SQueue<T> {
	private Node<T> top;
	private Node<T> bottom;
	
	private class Node<E>
	{
		E data;
		Node<E> next;
		
		public Node(E d)
		{
			data=d;
			next=null;
		}
	}
	
	public void enqueue(T val)
	{
		Node<T> newNode=new Node<T>(val);
		if(this.isEmpty())
		{
			top=newNode;
			bottom=newNode;
		}
		else
		{
			bottom.next=newNode;
			bottom=newNode;
		}
		
	}
	
	public T dequeue()
	{
		Node<T> dequeued=top;
		if(!isEmpty())
		{
			top=top.next;
			if(top==null)
				bottom=null;
			return dequeued.data;
		}
		return null;
	}
	
	public boolean isEmpty()
	{
		return (top==null) && (bottom==null);
	}
	
	public void print()
	{
		Node<T> temp=top;
		while(temp!=null)
		{
			System.out.println("|__"+temp.data+"__|");
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		SQueue<Integer> qu=new SQueue<Integer>();
		qu.enqueue(10);
		qu.enqueue(12);
		qu.enqueue(14);
		qu.enqueue(16);
		qu.print();
		System.out.println(qu.dequeue());
		qu.print();
		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
		qu.enqueue(1);
		qu.print();
	}
	
	

}
