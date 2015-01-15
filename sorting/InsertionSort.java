package sorting;

public class InsertionSort {
	static int[] array;
	public static void main(String[] args) {
		array = new int[]{1,3,9,7,5,2,5,4,7,6};
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.insertionSort();
		for(int i: array){
			System.out.println(i);
		}
	}
	public void insertionSort(){
		int sortedIndex=0;
		int i=sortedIndex++;
		while(i<array.length){
			while(i>(0)&&array[i]<array[i-1]){
				int temp = array[i-1];
				array[i-1]=array[i];
				array[i]= temp;
				i--;
			}
			i = sortedIndex++;
		}
	}
	
}
