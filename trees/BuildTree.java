package trees;

public class BuildTree {
	int[] inOrder;
	int[] preOrder;
	int i=0;
	public Node buildTree(){
		return buildTreeHelper(0, preOrder.length);
	}
	private Node buildTreeHelper(int low, int high){
		if(low==high){
			i++;
			return new Node(inOrder[low]);
		}
		int rootIndex = binarySearch(preOrder[i++], low, high);
		Node root = new Node(inOrder[rootIndex]);
		root.setLeftChild(buildTreeHelper(low, rootIndex-1));
		root.setRightChild(buildTreeHelper(rootIndex+1,high));
		return root;
	}
	private int binarySearch(int i,int low,int high){
		int mid = low+(low-high)/2;
		if(i==inOrder[mid]) 
			return mid;
		if(i<inOrder[mid])
			return binarySearch(i, low, mid-1);
		else
			return binarySearch(i, mid+1,high);
		
	}
}
