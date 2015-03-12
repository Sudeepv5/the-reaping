
public class Remove_Duplicate_From_LLT {
	
	public static void main(String[] args)
    {
        SLinkedList llt_in = new SLinkedList(2);
        llt_in.addTail(2);
        llt_in.addTail(3);
        llt_in.addTail(5);
        llt_in.addTail(6);
        llt_in.addTail(5);
        llt_in.addTail(2);
        Solution(llt_in.head);
        llt_in.printList();
    }

    public static void Solution(SNode head)
    {         
        SNode i, j;
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
