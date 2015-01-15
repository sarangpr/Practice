package misc;

public class TurningNumber {
	private static int[] numbers;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbers = new int[]{
				1,2,3,4,5,10,9,8
		};
		System.out.println(findTuringNumber(0, numbers.length-1));
	}
	public static int findTuringNumber(int low, int high){
		int mid = low+(high-low)/2;
		if(numbers[mid]>numbers[mid+1]&&numbers[mid]>numbers[mid-1])
			return numbers[mid];
		if(numbers[mid]>numbers[mid+1]&&numbers[mid]<numbers[mid-1]){
			return findTuringNumber(low, mid-1);
		}
		else{
			return findTuringNumber(mid+1, high);
		}
	}
}
