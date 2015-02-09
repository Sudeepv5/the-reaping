
public class LinkedListPartition {
	
	public static void main(String[] args)
	{
		LinkedListPartition lp=new LinkedListPartition();
        SLinkedListNode llt_in = new SLinkedListNode(2);
        llt_in.addTail(6);
        llt_in.addTail(43);
        llt_in.addTail(5);
        llt_in.addTail(17);
        llt_in.addTail(32);
        llt_in.addTail(9);
        llt_in.printList();
		lp.partition(llt_in, 11).printList();
		
	}
	
	public SLinkedListNode partition(SLinkedListNode head, int x)
	{
		SLinkedListNode bef=null;
		SLinkedListNode aft=null;
		
		SLinkedListNode node = head;
		
		while(node.next!=null)
		{			
			if((int)node.data > x)
			{
				if(aft==null)
					aft=new SLinkedListNode(node.data);
				else
					aft.addTail(node.data);
						
			}
			else
			{
				if(bef==null)
					bef=new SLinkedListNode(node.data);
				else
					bef.addTail(node.data);
				
			}
			node=node.next;
		}
		//while(bef.next!=null)
		//	bef=bef.next;
		
		//bef.next=aft;
		return bef;
	}

}
