package misc;

public class MaxPairDifference {
	static int[] array;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array = new int[]{
				2, 4, 1, 16, 7, 5, 11, 9
		};
		System.out.println(maxPairDifference());
	}
	public static int maxPairDifference(){
		if(array==null||array.length<2){
			return 0;
		}
		int max = array[0];
		int maxDifference = max - array[1];
		for(int i=2;i<array.length;i++){
			if(array[i-1]>max){
				max = array[i-1];
			}
			int currentDifference = max - array[i];
			if(currentDifference > maxDifference){
				maxDifference = currentDifference;
			}
			
		}
		
		return maxDifference;
	}
}
