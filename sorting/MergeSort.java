package sorting;

public class MergeSort {
	static int tempArr[] ;
	static int array[];
	public static void main(String[] args) {
		array = new int[]{1,3,9,7,5,2,5,4,7,6};
		tempArr= new int[array.length];
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(array, 0, array.length-1);
		for(int i:array){
			System.out.println(i);
		}
	}
	public void mergeSort(int[] array,int low,int high){
		if(low<high){
			int mid = low + ((high-low)/2);
			mergeSort(array, low, mid);
			mergeSort(array, mid+1, high);
			merge(array,low,mid,high);
		}
		
	}
	private void merge(int[] array, int low, int mid, int high) {
		int i=low, j=mid+1;
		int k=low;
		for(int l=low;l<=high;l++){
			tempArr[l]=array[l];
		}
		while(i<=mid&&j<=high){
			if(tempArr[i]<tempArr[j]){
				array[k++]=tempArr[i++];
				
			}else{
				array[k++]=tempArr[j++];
			}
		}
		while(i<=mid){
			array[k++]=tempArr[i++];
		}
		while(j<=high){
			array[k++]=tempArr[j++];
		}
	}
	
}
