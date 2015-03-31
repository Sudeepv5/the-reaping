
public class StackWithMin{
	SStack<Integer> minStack;
	SStack<Integer> st;
	
	public StackWithMin()
	{
		minStack=new SStack<Integer>();
		st=new SStack<Integer>();
	}
	
	public void push(int val)
	{
		
		if(val<=getMin())
			minStack.push(val);
		st.push(val);
		
	}
	
	public Integer pop()
	{
		int ret=st.pop();
		if(ret==minStack.peek())
			minStack.pop();
		return ret;
	}
	
	public Integer getMin()
	{
		if(!minStack.isEmpty())
		return minStack.peek();
		else
			return Integer.MAX_VALUE;
	}
	
	
	public static void main(String[] args) {
		StackWithMin minSt=new StackWithMin();
		minSt.push(2);
		minSt.push(10);
		minSt.push(3);
		minSt.push(2);
		minSt.push(1);
		System.out.println(minSt.getMin());
		System.out.println(minSt.pop());
		System.out.println(minSt.getMin());
		System.out.println(minSt.pop());
		System.out.println(minSt.getMin());
	}
	
	
	
	
}
