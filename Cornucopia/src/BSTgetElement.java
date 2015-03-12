
public class BSTgetElement {
	
	public static void main(String[] args) {
		
		SBinSearchTreeNode tree=new SBinSearchTreeNode(5);
		
		tree.insert(6);
		tree.insert(2);
		tree.insert(8);
		
		tree.insert(11);
		tree.insert(-3);
		tree.insert(7);
		
		//tree.printInOrder();
		//tree.printPostOrder();
		//tree.printPreOrder();

		//System.out.println(search(tree,3,0));
		searchInOrder(tree,1);
		System.out.println(tree.search(5));
	}
	
	public static int search(SBinSearchTreeNode tree, int k,int count)
	{
		if(tree==null || k<=0)
			return -1;
		
		int rank=getCount(tree.left)+count+1;

		if(k==rank)
			return tree.data;
		else if(k>rank)
			return search(tree.right,k,rank);
		else
			return search(tree.left,k,count);
		
		
	}
	
	public static int getCount(SBinSearchTreeNode tree)
	{
		if(tree==null)
			return 0;
		return getCount(tree.left) + getCount(tree.right) +1;
	}
	
	
	static int count=0;
	public static void searchInOrder(SBinSearchTreeNode tree, int k)
	{
		if(tree!=null)
		{
			searchInOrder(tree.right,k);
			count++;
			if(k==count) {
				System.out.println(tree.data);
				
			}
			searchInOrder(tree.left,k);
		}
	}

}
