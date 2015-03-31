import java.util.ArrayList;


public class LevelOrderLinkedList {
	
	public static void main(String[] args) {
		SBinSearchTreeNode tree=new SBinSearchTreeNode(3);
		
		tree.insert(5);
		tree.insert(2);
		tree.insert(7);
		tree.insert(1);
		tree.insert(4);
		ArrayList<SListNode<SBinSearchTreeNode>> result=levelLinked(tree);
		for(SListNode<SBinSearchTreeNode> s : result)
		{
			while(s!=null)
			{
				System.out.print(s.data.data+"->");
			}
			System.out.println();
		}
		
	}

	public static ArrayList<SListNode<SBinSearchTreeNode>> levelLinked(SBinSearchTreeNode tree)
	{
		ArrayList<SListNode<SBinSearchTreeNode>> result=new ArrayList<SListNode<SBinSearchTreeNode>>();
		SListNode<SBinSearchTreeNode> current=new SListNode<SBinSearchTreeNode>(tree);
		
		//current.add(tree);
		while(current!=null)
		{
			result.add(current);
			SListNode<SBinSearchTreeNode> parents=current;
			
			while(parents!=null)
			{
				if(parents.data.left!=null){
					if(current==null)
						current=new SListNode<SBinSearchTreeNode>(parents.data.left);
					else
						current.add(parents.data.left);
				}
				if(parents.data.right!=null){
					if(current==null)
						current=new SListNode<SBinSearchTreeNode>(parents.data.right);
					else
						current.add(parents.data.right);
				}
				
				parents=parents.next;
			}
		}
		
		return result;
	}
}
