package misc;

public class ReverseBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		reverseBit(0b1111000011101011);
	}
	public static int reverseBit(int number){
		System.out.println(Integer.toBinaryString(number));
		for(int i=31;i>=16;i--){
			int j=31-i;
			number=swapBits(number, i, j);
		}
		System.out.println(Integer.toBinaryString(number));
		return number;
	}
	public static int swapBits(int number,int i, int j){
		int lo  = number & (1<<i);
		int hi = number & (1<<j);
		
		/*System.out.println(Integer.toBinaryString(1<<i));
		System.out.println(Integer.toBinaryString(1<<j));
		System.out.println(Integer.toBinaryString((1<<i) | (1<<j)));*/
		
		if((lo^hi)!=0){
			number ^= ((1<<i) | (1<<j));
		}
		return number;
	}
}
