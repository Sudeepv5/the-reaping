
public class MirrorTree {
	
	public static void main(String[] args) {
		SBinSearchTreeNode tree= new SBinSearchTreeNode(10);
		tree.insert(7);
		tree.insert(13);
		tree.insert(3);
		tree.insert(4);
		tree.insert(9);
		tree.insert(12);
		tree.insert(16);
		tree.insert(15);
		tree.printInOrder();
		mirrorTree(tree).printPreOrder();
	}

	
	public static SBinSearchTreeNode mirrorTree(SBinSearchTreeNode tree)
	{
		
		if(tree==null)
			return null;
		SBinSearchTreeNode mirror;
		mirror=new SBinSearchTreeNode(tree.data);
		mirror.left=mirrorTree(tree.right);
		mirror.right=mirrorTree(tree.left);
		return mirror;
		
	}

	
	
	
	
	public static void mirrorTreeInPlace(SBinSearchTreeNode tree)
	{
		
		if(tree!=null)
		{
			SBinSearchTreeNode temp=tree.right;
			tree.right=tree.left;
			tree.left=temp;
			mirrorTreeInPlace(tree.right);
			mirrorTreeInPlace(tree.left);
		}
	}

}
