package misc;

import java.util.LinkedList;
import java.util.Queue;

public class SlidingWindowMax {
	private static int[] array;
	private static Queue<Integer> queue = new LinkedList<>();
	public static void main(String[] args) {
		array = new int[]{
				2,3,4,2,6,2,5,1
		};
		insert(0,0);
		insert(0,1);
		for(int i=0;i<array.length-2;i++){
			insert(i,i+2);
			System.out.println(array[queue.peek()]);
		}
	}
	public static void insert(int start, int end){
		while(queue.peek()!=null&&queue.peek()<start){
			queue.remove();
		}
		if(queue.peek()!=null){
			if(array[end]>array[queue.peek()]){
				queue.clear();			
			}else {
				int i=0;
				while(queue.peek()!=null&&array[end]<array[queue.peek()]&&i<queue.size()){
					queue.add(queue.poll());
					i++;
				}
				while(queue.peek()!=null&&array[end]>=array[queue.peek()]){
					queue.remove();
				}
			}
		}
		queue.add(end);

	}
}
