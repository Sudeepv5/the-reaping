
public class LinkedListPartition {
	
	public static void main(String[] args)
	{
        SLinkedList llt_in = new SLinkedList(2);
        llt_in.addTail(6);
        llt_in.addTail(43);
        llt_in.addTail(5);
        llt_in.addTail(17);
        llt_in.addTail(32);
        llt_in.addTail(9);
        llt_in.printList();
		partition(llt_in.head, 11).printList();
		
	}
	
	public static SLinkedList partition(SNode head, int x)
	{
		SLinkedList bef=null;
		SLinkedList aft=null;
		
		SNode node = head;
		
		while(node!=null)
		{			
			if((int)node.data > x)
			{
				if(aft==null)
					aft=new SLinkedList(node.data);
				else
					aft.addTail(node.data);		
			}
			else
			{
				if(bef==null)
					bef=new SLinkedList(node.data);
				else
					bef.addTail(node.data);
				
			}
			node=node.next;
		}
		bef.last().next=aft.head;
		return bef;
	}

}
