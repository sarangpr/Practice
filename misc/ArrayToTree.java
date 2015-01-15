package misc;
import java.util.Arrays;

import trees.Node;


public class ArrayToTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static Node arrayToTree(int[] array){
		int end = array.length-1;
		int start=0;
		if(start==end){
			return new Node(array[start]);
		}
		int mid = (end+start)/2;
		Node root = new Node(array[mid]);
		if(start!=mid){
			root.setLeftChild(arrayToTree(Arrays.copyOfRange(array, start, mid-1)));
		}
		if(mid!=end){
			root.setRightChild(arrayToTree(Arrays.copyOfRange(array, mid+1, end)));
		}
		return root;
	}
}
