package misc;

public class PairVal {
	private int parent;
	private int child;
	public PairVal(){}
	public PairVal(int a, int b){
		this.parent=a;
		this.child=b;
	}
	public int getParent(){
		return this.parent;
	}
	public int getChild(){
		return this.child;
	}
}
