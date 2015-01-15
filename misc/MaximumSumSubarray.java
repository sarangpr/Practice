package misc;
import java.util.Arrays;


public class MaximumSumSubarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i: maxSumArr(new int[]{-1,2,1,2,-1,-2,-4,6,7,2})){
			System.out.println(i);
		}
	}
	public static int[] maxSumArr(int[] array){
		int[] supp = new int[array.length];
		supp[0]=array[0];
		int i=0;
		while(++i<array.length){
			if(supp[i-1]>=0){
				supp[i]=supp[i-1]+array[i];
			}else{
				supp[i]=array[i];
			}
		}
		int start=0;
		int lastNeg=-1; int current=0;int max=supp[0];int maxIndex=0;
		while(++current<supp.length){
			if(supp[current]>=max){
				max = supp[current];
				maxIndex = current;
			}
			if(supp[current]<0){
				lastNeg= current;
			}
		}
		if((lastNeg!=-1)&&(lastNeg<maxIndex)){
			start= lastNeg+1;
		}
		System.out.println(start+" is the start index");
		return Arrays.copyOfRange(array, start, maxIndex+1);
	}
}
