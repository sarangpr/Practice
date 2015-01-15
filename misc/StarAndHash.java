package misc;

import java.util.Arrays;
import java.util.HashMap;

public class StarAndHash {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a = longestSubarray(new char[]{
			'*','*','#','#','*'	
		});
		for(char i: a){
			System.out.println(i);
		}
	}
	public static char[] longestSubarray(char[] array){
		int[] count = new int[array.length];
		int i=1;
		while(i<array.length){
			if(array[i]=='*'){
				count[i]=count[i-1]-1;
			}else{
				count[i] = count[i-1+1];
			}
			i++;
		}
		int lastZeroPos = findLastOcc(count,0);
		if(lastZeroPos!=-1){
			return Arrays.copyOfRange(array, 0, lastZeroPos);
		}
		int min=Integer.MAX_VALUE;
		for(int temp: count){
			if(temp<min) min =temp;
		}
		return Arrays.copyOfRange(array, findFirstOcc(count, min)+1, findLastOcc(count, min)-1);
	}
	private static int findLastOcc(int[] array,int num){
		int pos=-1;
		int i=0;
		while(i<array.length){
			if(array[i]==num){
				pos =i;
			}
			i++;
		}
		return i;
	}
	private static int findFirstOcc(int[] array,int num){
		int pos=-1;
		int i=0;
		while(i<array.length){
			if(array[i]==num){
				pos =i;
				break;
			}
		}
		return i;
	}
}
