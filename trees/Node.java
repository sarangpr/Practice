package trees;

public class Node implements Cloneable{
		private Node leftChild;
		private Node rightChild;
		private int data;
		public Node(){}
		public Node(int data){
			this.setData(data);
		}
		public Node(Node node){
			this(node.getData(),node.leftChild,node.rightChild);
		}
		public Node(int data,Node leftChild, Node rightChild){
			this.setData(data);
			this.setLeftChild(leftChild) ;
			this.rightChild=rightChild;
		}
		
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getLeftChild() {
			return leftChild;
		}
		public void setLeftChild(Node leftChild) {
			this.leftChild = leftChild;
		}
		public Node getRightChild() {
			return rightChild;
		}
		public void setRightChild(Node RightChild) {
			this.leftChild= rightChild;
		}
		public Node getParent() {
			// TODO Auto-generated method stub
			return null;
		}
		
	};