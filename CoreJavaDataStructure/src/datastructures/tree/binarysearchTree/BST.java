package datastructures.tree.binarysearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
	public Node root;
	
	public BST()
	{
		root=null;
	}
	public int visit()
	{
		return root.getData();
	}
	public boolean isEmpty()
	{
		return root==null;
	}
	public void add(int value)
	{
		root = add(root, value);
	}
	
	public Node add(Node root, int data)
	{
		
		if(root==null)
		{
			root = new Node(data);
		}else if(root.getData()>data)
		{
			root.leftChild = add(root.leftChild,data);
		}
		else if(root.getData()<data)
		{
			root.rightChild = add(root.rightChild,data);
		}
		
		return root;
		
	}
	
	public boolean search(int x)
	{
		return search(root,x);
	}

	private boolean search(Node node, int x) {
		boolean found = false;
		
		while((node!=null) && !found)
		{
			if(node.getData()>x)
			{
				node = node.leftChild;
			}else if(node.getData()< x)
			{
				node = node.rightChild;
			}
			else
			{
				found=true;
				break;
			}
			found = search(node,x);
			
	
		}
		return found;
	}
	//find the length of the tree
	public int findLength(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		if(node.leftChild==null && node.rightChild==null)
		{
			return 1;
		}
		int leftDepth = findLength(node.leftChild);
		int rightDepth = findLength(node.rightChild);
		
		return (leftDepth>rightDepth)? leftDepth+1:rightDepth +1;
		
	}
	//find the deepest node of the tree
	private Node findDeepestNode(Node node)
	{
		Node temp=null;
		if(node==null)
		return null;
		
		Queue<Node> q = new LinkedList<Node>();
		q.offer(node);
		
		while(!q.isEmpty())
		{
			 temp = q.poll();
			if(temp.leftChild!=null)
				q.offer(temp.leftChild);
			if(temp.rightChild!=null)
				q.offer(temp.rightChild);
		}
		
		return temp;
		
	}
	
	private int noOfLeavesInBinaryTree(Node node)
	{
		Node temp = null;
		int count=0;
		if(node==null)
		{
			return 0;			
		}
		
		Queue<Node> q = new LinkedList<Node>();
		
		q.offer(node);
		
		while(!q.isEmpty())
		{
			temp = q.poll();
			
			if(temp.leftChild==null&&temp.rightChild==null)
			{
				count++;
			}
			if(temp.leftChild!=null)
				q.offer(temp.leftChild);
			if(temp.rightChild!=null)
			{
				q.offer(temp.rightChild);
			}
			
		}
		
		return count;
	}
	
	public int getNumberOfNodesAtLevel(Node node, int depth)
	{
		if(node==null)
		{
			return 0;
		}
		if(depth==0)
		{
			return 1;
		}
		else return  getNumberOfNodesAtLevel(node.leftChild, depth-1)+getNumberOfNodesAtLevel(node.rightChild,depth-1);
	}
	
	public Node mirrorBinaryTree(Node node)
	{
		Node temp;
		if(node!=null)
		{
			mirrorBinaryTree(node.leftChild);
			mirrorBinaryTree(node.rightChild);
			
			temp = node.leftChild;
			node.leftChild = node.rightChild;
			node.rightChild = temp;
		}
		return node;
	}
	

}
