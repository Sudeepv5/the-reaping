

public class LevelOrder{
	
	public static void main(String[] args) {
		SBinSearchTreeNode tree=new SBinSearchTreeNode();
		tree.insert(3);
		tree.insert(5);
		tree.insert(2);
		tree.insert(7);
		tree.insert(1);
		tree.insert(4);
		//tree.printInOrder();
		//levelOrder(tree);
		zigZagOrder(tree);
		
	}

    public static void levelOrder(SBinSearchTreeNode tree)
    {
        SQueue<SBinSearchTreeNode> q=new SQueue<SBinSearchTreeNode>();
        q.enqueue(tree);
        
        while(!q.isEmpty())
        {
        	SBinSearchTreeNode tr=q.dequeue();
        	System.out.println(tr.data);
            //System.out.println(tr.left.data);
            //System.out.println(tr.right.data);
        	if(tr.left!=null)
        		q.enqueue(tr.left);
        	if(tr.right!=null)
        		q.enqueue(tr.right);
        }
    
    }
    
    public static void zigZagOrder(SBinSearchTreeNode tree)
    {
        SQueue<SBinSearchTreeNode> q=new SQueue<SBinSearchTreeNode>();
        q.enqueue(tree);
        boolean level=true;
        while(!q.isEmpty())
        {
        	SBinSearchTreeNode tr=q.dequeue();
        	System.out.println(tr.data);
            //System.out.println(tr.left.data);
            //System.out.println(tr.right.data);
        	
        	if(tr.left!=null || tr.right!=null)
        	{
        		
        		if(level)
        		{
        		if(tr.left!=null)
        			q.enqueue(tr.left);
        		if(tr.right!=null)
        			q.enqueue(tr.right);
        		}
        		else
        		{
              		if(tr.right!=null)
                		q.enqueue(tr.right);
            		if(tr.left!=null)
                		q.enqueue(tr.left);
        		}
        		level = !level;
        		
        	}
        }
    
    }

}