package misc;
import trees.Node;


public class LeastCommonAncestor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static Node leaseCommonAncestor(Node root,Node a, Node b){
		if(root == null){
			return null;
		}
		if(root.getData()==a.getData()||root.getData()==b.getData()){
			return root;
		}
		while(!((a.getData()>root.getData()&&b.getData()<root.getData())||
				(a.getData()>root.getData()&&b.getData()<root.getData()))){
			if(a.getData()>root.getData()&&b.getData()>root.getData()){
				root=root.getRightChild();
			}else{
				root=root.getLeftChild();
			}
		}
		return root;
	}
}
