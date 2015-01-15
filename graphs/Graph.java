package graphs;
import java.util.HashSet;
import java.util.Queue;


public class Graph {
	HashSet<GraphNode> nodeSet = new HashSet<>();
	public Graph(){};
	public Graph(GraphNode node){
		this();
		nodeSet.add(node);
	}
	public Graph(HashSet<GraphNode> nodeSet){
		this.nodeSet=nodeSet;
	}
	public boolean isPathExist(GraphNode start, GraphNode end){
		Queue<GraphNode> queue = new java.util.LinkedList<>();
		queue.add(start);
		GraphNode currentNode;
		while((currentNode =queue.poll())!=null){
			if(!currentNode.isVisited()){
			if(currentNode.getData() == end.getData()){
				return true;
			}
			queue.addAll(currentNode.getNeighbours());
			currentNode.setVisited(true);
			}
		}
		return false;
	}
}
