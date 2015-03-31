
public class CheckBST {
	
	public static void main(String[] args) {
		SBinSearchTreeNode tree=new SBinSearchTreeNode(6);
		tree.insert(5);
		tree.insert(8);
		tree.insert(2);
		tree.insert(3);
		tree.insert(9);
		tree.insert(1);
		tree.right=new SBinSearchTreeNode(1);
		tree.printInOrder();
		System.out.println(isBST(tree));
	}
	
	public static boolean isBST(SBinSearchTreeNode tree)
	{
		return isBST(tree,Integer.MIN_VALUE,Integer.MAX_VALUE);
		
	}
	
	public static boolean isBST(SBinSearchTreeNode tree,int min,int max)
	{
		if(tree==null)
			return true;
		if(tree.data<=min || tree.data>max)
			return false;
		if(!isBST(tree.left,min,tree.data) || !isBST(tree.right,tree.data,max))
			return false;
		return true;
	}

}
