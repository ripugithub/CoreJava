package datastructures.tree.binarysearchTree;

public class Node {
	public Node leftChild;
	public Node rightChild;
	private int data;
	
		
	public Node()
	{
		leftChild=null;
		rightChild = null;
		data = 0;
	}
	
	public Node(int data)
	{
		leftChild = rightChild = null;
		this.data=data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	

}
