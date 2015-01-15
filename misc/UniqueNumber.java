package misc;

public class UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniqueNumber(new int[] {1,1,1,2,2,2,3}));;
	}
	public static int uniqueNumber(int[] numbers){
		int[] bitSum = new int[32];
		for (int i = 0; i < numbers.length; i++) {
			int bitmask = 0b1;
			for(int j=31;j>=0;j--){
				int bit = numbers[i]&bitmask;
				if(bit!=0){
					bitSum[j]++;
				}
				bitmask=bitmask<<1;
			}
		}
		int result = 0b0;
		for(int i = 0 ; i<bitSum.length;i++){
			result = result<<1;
			result+=bitSum[i]%3;
		}
		return result;
	}
}
