package graphs;
import java.util.ArrayList;


public class GraphNode {
	private ArrayList<GraphNode> neighbours;
	private int data;
	private boolean visited = false;
	public GraphNode(){}
	
	public GraphNode(GraphNode node){
		this(node.getData(),node.getNeighbours());
	}
	GraphNode(int data){
		this.data=data;
	}
	public GraphNode(int data, ArrayList<GraphNode> neighbours) {
		this.setData(data);
		this.setNeighbours(neighbours);
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public ArrayList<GraphNode> getNeighbours() {
		return neighbours;
	}
	public void setNeighbours(ArrayList<GraphNode> neighbours) {
		this.neighbours = neighbours;
	}

	public void addNeighbours(GraphNode end) {
		// TODO Auto-generated method stub
		neighbours.add(end);
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
}
