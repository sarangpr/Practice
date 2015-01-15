package sorting;

public class QuickSort {
	public static int[] array;
	public void quickSort(int low,int high){
		if(low<high){
			int pivot = low+((high-low)/2);
			int i=low;
			int j=high;
			while(i<j){
				while(array[i]<array[pivot]){
					if(i<=pivot)
						i++;
				}
				while(array[j]>array[pivot]){
					if(j>=pivot){
						j--;
					}
				}
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
			quickSort(low, pivot);
			quickSort(pivot+1, high);
		}
	}
	public static void main(String[] args) {
		array = new int[]{1,4,5,10,8,2,7};
		QuickSort quickSort = new QuickSort();
		quickSort.quickSort(0, array.length-1);
		for(int i: array){
			System.out.println(i);
		}
	}
}
