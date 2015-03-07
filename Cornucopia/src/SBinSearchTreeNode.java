
public class SBinSearchTreeNode {
	int data;
	int leftCount;
	SBinSearchTreeNode left;
	SBinSearchTreeNode right;
	SBinSearchTreeNode(int v)
	{
		this.data=v;
		this.leftCount=0;
		this.left=null;
		this.right=null;
	}
	
	public void insert(int v)
	{
		insert(this,v);
	}
	
	private void insert(SBinSearchTreeNode root, int v)
	{
		//SBinSearchTreeNode node=new SBinSearchTreeNode(v);
		if(root==null)
			root=new SBinSearchTreeNode(v);
		
		else if(root.left==null && v<root.data)
		{
			root.leftCount++;
			root.left=new SBinSearchTreeNode(v);			
		}
		else if(root.right==null && v>root.data)
			root.right=new SBinSearchTreeNode(v);	
		else
		{
			if(v<root.data)
			{
				root.leftCount++;
				insert(root.left,v);
			}
			else
				insert(root.right,v);
		}		
	}
	
	public void printInOrder()
	{
		printInOrder(this);
	}
	
	private void printInOrder(SBinSearchTreeNode root)
	{
		if(root!=null)
		{
			printInOrder(root.left);
			System.out.println(root.data);
			printInOrder(root.right);
		}
	}
	
	public void printPreOrder()
	{
		printPreOrder(this);
	}
	
	private void printPreOrder(SBinSearchTreeNode root)
	{
		if(root!=null)
		{
			System.out.println(root.data);
			printPreOrder(root.left);
			printPreOrder(root.right);
		}
	}
	
	public void printPostOrder()
	{
		printPostOrder(this);
	}
	
	private void printPostOrder(SBinSearchTreeNode root)
	{
		if(root!=null)
		{
			printPreOrder(root.left);
			printPreOrder(root.right);
			System.out.println(root.data);
		}
	}
	
	public int children()
	{
		return children(this);
	}
	
	private int children(SBinSearchTreeNode root)
	{
		if(root==null)
			return 0;
		return children(root.left) + children(root.right) +1;
	}
	
	public boolean search(int v)
	{
		return search(this,v);
	}
	
	private boolean search(SBinSearchTreeNode root,int v)
	{
		if(root==null)
			return false;
		else {
			if(v==root.data)
				return true;
			else if(v>root.data)
				return search(root.right,v);
			else
				return search(root.left,v);
			}

	}
	
	
}
