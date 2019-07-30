package datastructures.tree.binarysearchTree;

public class BinarySearchTreeTraversal {
	
	
	public static void preOrderTraversal(Node node)
	{
		if(node==null) return;
		System.out.print(node.getData()+" ");
		preOrderTraversal(node.leftChild);
		preOrderTraversal(node.rightChild);
	}
	
	public static void  inOrderTraversal(Node node)
	{
		if(node==null) return;
		inOrderTraversal(node.leftChild);
		System.out.print(node.getData()+" ");
		inOrderTraversal(node.rightChild);
	}
	
	public static void postOrderTraversal(Node node)
	{
		if(node==null) return ;
		postOrderTraversal(node.leftChild);
		postOrderTraversal(node.rightChild);
		System.out.print(node.getData()+" ");
	}
	public static void main(String s[])
	{
		BST bst = new BST();
		bst.add(7);
		bst.add(5);
		bst.add(10);
		System.out.println("Number of leaves::"+bst.noOfLeavesInBinaryTree(bst.root));
		System.out.println("PreOrder Traversal");
		preOrderTraversal(bst.root);
		System.out.println();
		System.out.println("PostOrder Traversal");
		postOrderTraversal(bst.root);
		System.out.println();
		System.out.println("InOrder Traversal");
		inOrderTraversal(bst.root);
		//System.out.println(bst.search(11));
		System.out.println("\n"+bst.findLength(bst.root));
	}
	

}
