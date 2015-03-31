
public class CommonAncestor {
	
	
	
	public static SBinSearchTreeNode commonAncestor(SBinSearchTreeNode tree,SBinSearchTreeNode p,SBinSearchTreeNode q)
	{
		if(tree==null)
			return null;
		if(p==tree||q==tree)
			return tree;
		
		boolean pOnLeft=isIn(tree.left,p);
		boolean qOnLeft=isIn(tree.left,q);
		
		if(pOnLeft==qOnLeft)
			if(pOnLeft)
				return commonAncestor(tree.left,p,q);
			else
				return commonAncestor(tree.right,p,q);
		else
			return tree;
	}
	
	public static boolean isIn(SBinSearchTreeNode tree,SBinSearchTreeNode p)
	{
		if(tree==null)
			return false;
		if(tree.data==p.data)
			return true;
		return isIn(tree.right,p) || isIn(tree.left,p);
	}

}
