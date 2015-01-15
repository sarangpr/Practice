package misc;

public class NextNumSameDigit {
	public static void main(String[] args) {
		System.out.println(nextNumber(34722641));
	}
	private static int nextNumber(int number){
		int tempNumber = number;
		int length =0;
		while(tempNumber!=0){
			tempNumber/=10;
			length++;
		}
		int[] numberArray = new int[length];
		int i=0;
		tempNumber = number;
		while(tempNumber!=0){
			numberArray[i++]=tempNumber%10;
			tempNumber/=10;
		}
		int currentIndex = 0;
		while (currentIndex <numberArray.length) {
			i = currentIndex+1;
			while (i < numberArray.length) {
				if (numberArray[i] == numberArray[currentIndex]) {
					currentIndex = i;
					i = currentIndex;
				} else if (numberArray[i] < numberArray[currentIndex]) {
					int temp = numberArray[i];
					numberArray[i] = numberArray[currentIndex];
					numberArray[currentIndex] = temp;
					return arrToInt(numberArray);
				}
				i++;
			}
			currentIndex++;
		}
		
		return number;
	}
	private static int arrToInt(int[] numberArray) {
		int result =0;
		int i=numberArray.length-1;
		while(i>=0){
			result*=10;
			result+=numberArray[i--];
		}
		return result;
	}
}
