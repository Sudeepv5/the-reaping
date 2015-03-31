public class LoopHeadLinked
{
	
	public static void main(String[] args) {
		SListNode<Integer> sn=new SListNode<Integer>(3);
		sn.add(2);
		sn.add(4);
		sn.add(5);
		sn.add(2);
		sn.add(7);
		sn.last().next=sn;
		SListNode<Integer> sn1=new SListNode<Integer>(11);
		sn1.add(12);
		sn1.add(13);
		sn1.add(14);
		sn1.add(15);
		sn1.last().next=sn;
		System.out.println(loopHead(sn1));
	}

public static int loopHead(SListNode<Integer> head)
{
	SListNode<Integer> fast=head,slow=head;

	while(fast!=null && fast.next!=null)
	{
		fast=fast.next.next;
		slow=slow.next;
		if(fast==slow)
			break;
	}

	fast=head;

	while(fast!=slow)
	{	
		fast=fast.next;
		slow=slow.next;
	}

	return fast.data;


}


}