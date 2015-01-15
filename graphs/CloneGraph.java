package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;


public class CloneGraph {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<GraphNode> rn = new ArrayList<>();
		rn.add(new GraphNode(2));
		rn.add(new GraphNode(3));
		GraphNode root = new GraphNode(1,rn);
		GraphNode end = new GraphNode(4);
		for(GraphNode node: root.getNeighbours()){
			node.addNeighbours(end);
			node.addNeighbours(root);
			end.addNeighbours(node);
		}
		
	}
	public static GraphNode cloneGraph(GraphNode root){
		HashMap<GraphNode, GraphNode> nodeMap = new HashMap<>();
		Queue<GraphNode> queue = new java.util.LinkedList<GraphNode>();
		GraphNode temp;
		GraphNode rootClone = new GraphNode(root.getData());
		queue.add(root);
		nodeMap.put(root, rootClone);
		while((temp =queue.poll()) != null){
			GraphNode tempClone = null;
			if(!nodeMap.containsKey(temp)){
				tempClone = new GraphNode(temp.getData());
				nodeMap.put(temp, tempClone);
			}else{
				tempClone = nodeMap.get(temp);
			}
			for(GraphNode tempNeighbor: temp.getNeighbours()){
				GraphNode tempNeighborClone;
				if(!nodeMap.containsKey(tempNeighbor)){
					tempNeighborClone = new GraphNode(tempNeighbor.getData());
				}else{
					tempNeighborClone = nodeMap.get(tempNeighbor);
				}
				tempClone.getNeighbours().add(tempNeighborClone);
			}
			queue.addAll(temp.getNeighbours());
			
		}
		return rootClone; 
	}

}
