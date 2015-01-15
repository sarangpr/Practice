package misc;

public class TrailingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trailingZeros(100));
	}

	private static int trailingZeros(int number) {
		int zeroCount = 0;
		for (int i = number; i > 0; i--) {
			if (i % 5 == 0) {
				int temp = i;
				while (temp % 5 == 0) {
					zeroCount++;
					temp /= 5;
				}
			}
		}
		return zeroCount;
	}

}
