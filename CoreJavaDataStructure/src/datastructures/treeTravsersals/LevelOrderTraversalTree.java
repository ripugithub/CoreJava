package datastructures.treeTravsersals;


class Node{
	
	private int data;
	Node left,right;
	
	public Node(int data)
	{
		this.data = data;
		left=right=null;
	}
}
public class LevelOrderTraversalTree {
	
	
	Node root;
	
	public LevelOrderTraversalTree()
	{
		root=null;
	}
	
	
	public int height(Node root)
	{
		
		if(root==null)
		{
			return 0;
		}
		
		if(root.left>root.right) {
			
			lheight = height(root.left);
		}
	}

}
