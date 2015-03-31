
public class ClosestNodeInBST {
	
	
	public static void main(String[] args) {
		SBinSearchTreeNode tree= new SBinSearchTreeNode(3);
		tree.insert(15);
		tree.insert(10);
		tree.insert(7);
		tree.insert(20);
		tree.insert(22);
		tree.insert(17);
		tree.insert(28);
		tree.insert(8);
		tree.printInOrder();
		closestNode(tree,44);
	}
	
	public static void closestNode(SBinSearchTreeNode root,int k)
	{
		int minDiff=Integer.MAX_VALUE;
		SBinSearchTreeNode closest=root;
		
		while(root!=null)
		{
			int diff=Math.abs(root.data-k);
			if(minDiff>diff)
			{
				minDiff=diff;
				closest=root;
			}
			if(k>root.data)
				root=root.right;
			else if(k<root.data)
				root=root.left;
			else if(k==root.data)
				break;
		}
		
		System.out.println("Closest Node: "+closest.data);
	}

}
