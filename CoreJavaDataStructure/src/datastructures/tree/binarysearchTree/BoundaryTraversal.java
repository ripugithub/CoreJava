package datastructures.tree.binarysearchTree;

public class BoundaryTraversal {
public Node root;
	
	public BoundaryTraversal()
	{
		root = null;
	}
	
	public boolean isEmpty()
	{
		return root==null;
	}
	public void add(int data)
	{
		root = add(root,data);
	}
	
	public Node add(Node root, int data)
	{
		if(root==null)
		{
			root = new Node(data);
		}
		else if(root.getData()>data)
		{
			root.leftChild = add(root.leftChild,data);
		}
		else if(root.getData()<data)
		{
			root.rightChild = add(root.rightChild,data);
		}
		
		return root;
	}
	
	static void printLeaves(Node node)
	{
		if(node!=null)
		{
			printLeaves(node.leftChild);
			//check if the leaf nodes are null then  nodes are boundary leaf nodes hence print
			if(node.leftChild==null && node.rightChild==null)
			{
				System.out.print(node.getData()+"  ");
			}
			printLeaves(node.rightChild);
		}
	}
	
	static void printLeftBoundary(Node node)
	{
		if(node!=null)
		{
			if(node.leftChild!=null)
			{
				System.out.print(node.getData()+"  ");
				printLeftBoundary(node.leftChild);
			}
			/*else if(node.rightChild!=null)
			{
				System.out.print(node.getData()+"  ");
				printLeftBoundary(node.rightChild);
			}*/
		}
	}
	static void printRightBoundary(Node node)
	 {
		 if(node!=null)
		 {
			 if(node.rightChild!=null)
			 {
				 System.out.print(node.getData()+"  ");
				 printRightBoundary(node.rightChild);
			 }
			 
			 /*else if(node.leftChild!=null)
			 {
				 System.out.print(node.getData()+"  ");
				 printRightBoundary(node.leftChild);
			 }*/
			 
		 }
	 }
	 
	 static void  printBoundary(Node node)
	 {
		 if(node!=null)
		 {
			 System.out.print(node.getData()+" ");
			 
			 printLeftBoundary(node.leftChild);
			 printLeaves(node.leftChild);
			 printLeaves(node.rightChild);
			 
			 printRightBoundary(node.rightChild);
		 }
	 }
	 
	 
	 public static void main(String s[])
	 {
		 
		 //20 8 4 10 12,14 25 22
		 BST bst = new BST();
		 bst.add(20);
		 bst.add(8);
		 bst.add(4);
		 bst.add(12);
		 bst.add(10);
		 bst.add(14);
		 bst.add(22);
		 bst.add(25);
		 
		 
		 printBoundary(bst.root);
		 
	 }
}
