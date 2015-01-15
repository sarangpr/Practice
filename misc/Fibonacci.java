package misc;

public class Fibonacci {
	public static void main(String[] args) {
		int[] cache = new int[100];
		for (int i = 0; i < 10; i++) {
//			System.out.println(fibonacci(i));
		}
	}
	public static int fibonacci(int i,int[]cache){
		int num1,num2;
		if(i<0){
			throw new IllegalArgumentException("n must not be less than zero");
		}
		if(i==1){
			return 1;
		}else if(i==0){
			return 0;
		}
		if((num1=cache[i-1])!=-1){
			num1 = fibonacci(i-1,cache);
		}
		if((num2=cache[i-2])!=-1){
			num2 = fibonacci(i-2, cache);
		}
		return num1+num2;
	}
}
