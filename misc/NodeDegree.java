package misc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class NodeDegree {
	private static class Node{
		private final Set<Node> neighbours;
		Node(){
			neighbours = new HashSet<>();
		}
	};
	private static Map<Integer, Integer> calculateDegreeCount(Node node) {
		if(node == null){
			throw new IllegalArgumentException("Cannot be null");
		}
		HashMap<Node, Integer> hashMap = new HashMap<>();
		Queue<Node> queue = new java.util.LinkedList<>();
		queue.add(node);
		Node currentNode = null;
		while((currentNode=queue.poll())!=null){
			if(!hashMap.containsKey(currentNode)){
				hashMap.put(currentNode, currentNode.neighbours.size());
			}
			queue.addAll(currentNode.neighbours);
		}
		Node maxNode=null;
		int maxDegree = Integer.MIN_VALUE;
		for(Map.Entry<Node, Integer> e: hashMap.entrySet()){
			if(e.getValue()>maxDegree){
				maxNode = e.getKey();
				maxDegree = e.getValue();
			}
		}
		return null;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
