
public class Remove_Duplicate_From_LLT {
	
	public static void main(String[] args)
    {
		SListNode<Integer> llt_in = new SListNode<Integer>(2);
        llt_in.add(2);
        llt_in.add(3);
        llt_in.add(5);
        llt_in.add(6);
        llt_in.add(5);
        llt_in.add(2);
        Solution(llt_in);
        llt_in.print();
        
    }

    public static void Solution(SListNode<Integer> head)
    {         
    	SListNode<Integer> i, j;
        i = head;
        while (i != null)
        {
            j = i;
            while (j.next != null)
            {
                if (i.data == j.next.data)
                	j.next=j.next.next;
                else
                    j = j.next;
            }
            i = i.next;
        }
    }
}
