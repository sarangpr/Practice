package trees;



public class Tree {
	private Node root;
	public Tree(){}
	public Tree(Tree tree){
		this(tree.root);
	}
	public Tree(Node root){
		this.root=root;
	}
	public void traverseInOrder(){
		traverseInOrderHelper(root);
	}
	private void traverseInOrderHelper(Node root){
		if(root==null){
			return;
		}
		traverseInOrderHelper(root.getLeftChild());
		System.out.println(root.getData());
		traverseInOrderHelper(root.getRightChild());
		
		return;
	}
	public boolean isBalanced(){
		if(getHeight(root)==-1){
			return false;
		}
		return true;
	}
	public int getHeight(Node root){
		if(root==null){
			return 0;
		}
		int leftHeight = getHeight(root.getLeftChild());
		if(leftHeight==-1){
			return -1;
		}
		int rightHeight = getHeight(root.getRightChild());
		if(rightHeight==-1){
			return -1;
		}
		int difference = Math.abs((leftHeight-rightHeight));
		if(difference>1){
			return -1;
		}else{
			return 1+Math.max(leftHeight,rightHeight);
		}
	}
	public boolean isBST(){
		int min =Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		if(root.getData()>max||root.getData()<min){
			return false;
		}
		return isBSTHelper(root.getLeftChild(),min,root.getData())&&isBSTHelper(root.getRightChild(), root.getData(), max);
	}
	private boolean isBSTHelper(Node root, int min, int max) {
		if(root==null){
			return true;
		}
		if(root.getData()>max||root.getData()<min){
			return false;
		}
		return isBSTHelper(root.getLeftChild(),min,root.getData())&&isBSTHelper(root.getRightChild(), root.getData(), max);
	}
	
	public Node inOrderSucc(Node node){
		if(node==null){
			return null;
		}
		if(node.getRightChild()!=null){
			return leftMostChild(node.getRightChild());
		}
		Node child = node;
		Node parent = node.getParent();
		while(parent!=null||parent.getLeftChild()!=child){
			child = parent;
			parent= parent.getParent();
		}
		return parent;
	}
	private Node leftMostChild(Node node) {
		if (node==null){
			return null;
		}
		Node x=node;
		while(node.getLeftChild()!=null){
			node = node.getLeftChild();
		}
		return node;
	}
	public Node findLCA(Node node){
		if(node ==null){
			return null;
		}
		Node left = findLCA(node.getLeftChild());
		Node right = findLCA(node.getRightChild());
		if(left!=null&&right!=null){
			return node;
		}
		return left!=null ? left : right;
	}
}


