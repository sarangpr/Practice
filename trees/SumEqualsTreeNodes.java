package trees;

import java.util.Stack;

public class SumEqualsTreeNodes {
	private static Stack<Node> smallStack = new Stack<>();
	private static Stack<Node> bigStack = new Stack<>();
	
	private static void exploreSmallest(Node root) {
		if(root==null){
			return;
		}
		smallStack.push(root);
		exploreSmallest(root.getLeftChild());
	}
	private static void exploreBiggest(Node root) {
		if(root==null){
			return;
		}
		smallStack.push(root);
		exploreSmallest(root.getRightChild());
	}
	public static boolean sumOfNodes(int sum,Node min, Node max){
		if(min.getData()+max.getData()==sum){
			return true;
		}
		if(min==max)
			return false;
		if(sum>min.getData()+max.getData()){
			Node temp = smallStack.pop();
			exploreSmallest(temp.getRightChild());
			return sumOfNodes(sum,temp,max);
		}
		if(sum<min.getData()+max.getData()){
			Node temp = smallStack.pop();
			exploreBiggest(temp.getLeftChild());
			return sumOfNodes(sum,min,temp);
		}
		return false;
	}
}
