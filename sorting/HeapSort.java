package sorting;

public class HeapSort {
	public static int[] array;
	public int N;
	public static void main(String[] args) {
		array = new int[]{1,3,9,7,5,2,5,4,7,6};
		HeapSort heapSort = new HeapSort();
		heapSort.heapSort();
		for(int i:array){
			System.out.println(i);
		}
	}
	private void swap(int i, int j){
		int temp = array[i];
		array[i]=array[j];
		array[j]= temp;
	}
	private void maxHeap(int i){
		int left = 2*i+1;
		int right = 2*i+2;
		int max =i;
		if((left<=N)&&array[left]>array[max]){
			max = left;
		}
		if(right<=N&&array[right]>array[max]){
			max = right;
		}
		if(max!=i){
			swap(i,max);
			maxHeap(max);
		}
	}
	public void heapify(){
		N = array.length-1;
		for(int i =N/2;i>=0;i--){
			maxHeap(i);
		}
	}
	public void heapSort(){
		heapify();
		for(int i=N;i>0;i--){
			swap(0,i);
			N-=1;
			maxHeap(0);
		}
	}
}
