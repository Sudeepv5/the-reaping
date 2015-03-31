
public class KthElementFromLast {
	
	public static void main(String[] args) {
		SListNode<Integer> node=new SListNode<Integer>(5);
		node.add(4);
		node.add(1);
		node.add(9);
		node.add(10);
		node.add(11);
		node.add(12);
		node.add(13);
		System.out.println(kthFromLast(node,2));
		
	}
	

	    public static Integer kthFromLast(SListNode<Integer> head,int k)
	    {
	    SListNode<Integer> p1=head,p2=head;
	    for(int i=0;i<k-1;i++)
	    {
	    if(p2==null)
	    return -1;
	    p2=p2.next;
	    }
	   System.out.println(p2.data);
	    
	    while(p2.next!=null)
	    {
	    p2=p2.next;
	    p1=p1.next;
	    } 
	    
	    return p1.data;   
	    }
	}


