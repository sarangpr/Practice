package misc;

public class GrayCode {
	public static void main(String[] args) {
		System.out.println(grayCodeNeighbors( 0,0));
	}
	private static boolean areGrayNeighbors(int a,int b){
		System.out.println(a+" "+ Integer.toBinaryString(a));
		System.out.println(-a+" "+Integer.toBinaryString(-a));
		System.out.println((a&-a)+ " "+ Integer.toBinaryString(a&-a));
		System.out.println(((a&-a)<<1)+ " "+ Integer.toBinaryString((a&-a)<<1));
		System.out.println((a^((a&-a)<<1))+ " "+ Integer.toBinaryString(a^((a&-a)<<1)));
		System.out.println((a^1)+" "+Integer.toBinaryString(a^1));
		return b==(a^1) || b == (a^((a&-a)<<1));
	}
	private static boolean grayCodeNeighbors(int a,int b){
		if(a==b){
			return false;
		}
//		System.out.println(Integer.toBinaryString(nextGray(a)));
//		System.out.println(Integer.toBinaryString(prevGray(a)));
		return (b==nextGray(a)||b==prevGray(a));
	}
	private static int prevGray(int a){
		return a & (a-1);
	}
	private static int nextGray(int a){
		return a | (a+1);
	}
		
	
}
