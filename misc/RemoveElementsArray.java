package misc;

public class RemoveElementsArray {
	static int[] array;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array = new int[]{
				2,2,2,3,3,4,5,2,7,8
		};
		removeElement(2);
		for(int i: array){
			System.out.println(i);
		}
	}
	public static void removeElement(int num){
		int j=0;	
		for(int i=0; i<array.length;i++){
			if(array[i]!=num){
				array[j++]=array[i];
			}
		}
		while(j<array.length){
			array[j++]=Integer.MIN_VALUE;
		}
	}
}
