
public class SStack<T> {
	
	private Node<T> top;
	
	
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

	public Node<T> getTop()
	{
		return top;
	}
	
	public void push(T val)
	{
		Node<T> newNode=new Node<T>(val);
			newNode.next=top;
			top=newNode;
	}
	public T peek()
	{
		return top.data;
	}
	
	public T pop()
	{
		Node<T> popped=top;
		if(!this.isEmpty()){
			top=top.next;
			return popped.data;
		}
		return null;
	}
	
	public boolean isEmpty(){
		return (top==null);
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
		SStack<Integer> st=new SStack<Integer>();
		st.push(10);
		st.push(12);
		st.push(14);
		st.push(16);
		st.print();
		System.out.println(st.pop());
		st.print();
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		st.push(1);
		st.print();
	}
}
