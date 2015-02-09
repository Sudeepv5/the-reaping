using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Plough
{
    class Remove_Duplicate_From_LinkedList
    {
        static void Main(string[] args)
        {
            Remove_Duplicate_From_LinkedList rdfl = new Remove_Duplicate_From_LinkedList();

            LinkedList<int> llt_in = new LinkedList<int>();
            llt_in.AddFirst(new LinkedListNode<int>(1));
            llt_in.AddLast(new LinkedListNode<int>(1));
            llt_in.AddLast(new LinkedListNode<int>(3));
            llt_in.AddLast(new LinkedListNode<int>(3));
            llt_in.AddLast(new LinkedListNode<int>(1));
            llt_in.AddLast(new LinkedListNode<int>(5));
            llt_in.AddLast(new LinkedListNode<int>(2));
            llt_in.AddLast(new LinkedListNode<int>(5));
            llt_in.AddLast(new LinkedListNode<int>(4));

            var i = rdfl.Solution(llt_in).First;
            while(i!=null)
            {
            Console.Out.WriteLine(i.Value);
            i = i.Next;
            }
            Console.Read();
        }

        public LinkedList<int> Solution(LinkedList<int> llt)
        {         
            LinkedListNode<int> i, j;
            i = llt.First;
            while (i != null)
            {
                j = i.Next;
                while (j != null)
                {
                    if (i.Value == j.Value)
                    {
                        var t = j.Next;
                        llt.Remove(j);
                        j = t;
                    }
                    else
                        j = j.Next;
                }
                i = i.Next;
            }

            return llt;
        }
    }
}
