
public class StreamOfIntegers {
	
	public static void main(String[] args)
	{
		StreamOfIntegers soi=new StreamOfIntegers();
		SBinSearchTreeNode tree=new SBinSearchTreeNode(7);
		soi.track(tree, 5);
		soi.track(tree, 2);
		soi.track(tree, 6);
		soi.track(tree, 9);
		soi.track(tree, 8);
		soi.track(tree, 1);
		soi.print(tree);
		System.out.println("Rank:"+soi.getRank(tree,10));
	}
	
	public void track(SBinSearchTreeNode bst,int x)
	{	
		SBinSearchTreeNode node=bst;
		if(x <= node.data)
		{	node.leftCount++;
			if(node.left==null)
				node.left=new SBinSearchTreeNode(x);
			else
				track(node.left,x);
		}
		else if(x > node.data)
			if(node.right==null)
				node.right=new SBinSearchTreeNode(x);
			else
				track(node.right,x);
	}
	
	public void print(SBinSearchTreeNode bst)
	{
		if(bst!=null)
		{
			print(bst.left);
			System.out.println(bst.data+","+bst.leftCount);
			
			
			print(bst.right);
		}
		
	}
	public int getRank(SBinSearchTreeNode bst,int x)
	{
		int rank=0;
		SBinSearchTreeNode node=bst;

		if(x < node.data)
		{	
			if(node.left==null)
				return rank;
			else
				return rank+getRank(node.left,x);
		}
		else if(x > node.data)
		{
			rank+=node.leftCount+1;
			if(node.right==null)
				return rank;
			else
				return rank+getRank(node.right,x);
		}
		else
			return node.leftCount;
		
		
	}
}
