public class LinkedListPartition {
	
	
	public static void main(String[] args)
	{
        SListNode<Integer> link = new SListNode<Integer>(4);
        link.add(6);
        link.add(43);
        link.add(5);
        link.add(17);
        link.add(32);
        link.add(9);
        link.toString();
        System.out.println(link.toString());
		System.out.println(partition(link, 11).toString());	
	}
	
	public static SListNode<Integer> partition(SListNode<Integer> head, int x)
	{
		SListNode<Integer> bef=null;
		SListNode<Integer> aft=null;
		
		SListNode<Integer> node = head;
		
		while(node!=null)
		{			
			if(node.data > x)
			{
				if(aft==null)
					aft=new SListNode<Integer>(node.data);
				else
					aft.add(node.data);		
			}
			else
			{
				if(bef==null)
					bef=new SListNode<Integer>(node.data);
				else
					bef.add(node.data);
				
			}
			node=node.next;
		}
		SListNode<Integer> fin=bef;
		while(fin.next!=null)
		fin.next=aft;
		return bef;
	}

}
