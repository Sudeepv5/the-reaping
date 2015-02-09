
public class Remove_Duplicate_From_LLT {
	
	public static void main(String[] args)
    {
        Remove_Duplicate_From_LLT rdfl = new Remove_Duplicate_From_LLT();

        SLinkedListNode llt_in = new SLinkedListNode(2);
        llt_in.addTail(2);
        llt_in.addTail(3);
        llt_in.addTail(5);
        llt_in.addTail(6);
        llt_in.addTail(5);
        llt_in.addTail(2);
        rdfl.Solution(llt_in);
        while(llt_in!=null)
        {
        	System.out.println(llt_in.data);
        	llt_in=llt_in.next;
        }

    }

    public void Solution(SLinkedListNode head)
    {         
        SLinkedListNode i, j;
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
