package misc;

public class MinHeap {
	static int currentSize=0;
	static int[] heap;
	public static void main(String[] args) {
		int [] numbers = new int[]{7,6,5,4,3,2,1};
		heapify(numbers);
		for(int i=0;i<heap.length;i++){
			System.out.println(getMin());
		}
	}
	public static int getLeftChildIndex(int current){
		return current*2+1;
	}
	public static int getRightChildIndex(int current){
		return current*2+2;
	}
	static boolean isLeaf(int current){
		if(current>=(currentSize-1)/2){
			return true;
		}
		return false;
	}
	private static void remove(int current){
		if(!isLeaf(current)){
			if(heap[current]>heap[getLeftChildIndex(current)] ||
					heap[current]>heap[getRightChildIndex(current)]){
				if(heap[getLeftChildIndex(current)]<heap[getRightChildIndex(current)]){
					swap(current,getLeftChildIndex(current));
					remove(getLeftChildIndex(current));
				}else{
					swap(current,getRightChildIndex(current));
					remove(getRightChildIndex(current));
				}
			}
		}
	}
	public static int getMin(){
		int ret = heap[0];
		heap[0]=heap[--currentSize];
		remove(0);
		return ret;
	}

	private static int parent(int current){
		if(current==0){
			return 0;
		}
		return (current-1)/2;
	}
	public static void heapify(int[] numbers){
		heap = numbers;
		for(int i=0;i<numbers.length;i++){
			insert();
		}
	}
	public static void insert(){
		int current = currentSize++;
		while(heap[current]<heap[parent(current)]){
			swap(current,parent(current));
			current=parent(current);
		}
	}
	private static void swap(int i, int j) {
		int temp = heap[i];
		heap[i]=heap[j];
		heap[j]=temp;
	}

}
