package misc;

public class MaximumProductSubarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[]{1,2,-5,6,0,7,0,8,-9};
		System.out.println("the max product is "+maxProduct(array));
	}
	public static int maxProduct(int[] array){
		int current_max=1;
		int current_min=1;
		int max_sofar=1;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>0){
				current_max*=array[i];
				current_min=Math.min(1, current_min*array[i]);
			}else if(array[i]==0){
				current_max=current_min=1;
			}else{/*array[i]<0*/
				int temp = current_max;
				current_max=Math.max(current_min*array[i], 1);
				current_min=Math.min(temp*array[i], 1);
			}
			if(current_max>max_sofar){
				max_sofar=current_max;
			}
		}
		return max_sofar;
	}
	public static int findMaxProduct(int[] array, int begin, int end) {
		int noNegs = 0; // count of negative numbers in the array
		int zeroIndex = -1; // index where a '0' is present
		for ( int i = begin; i < end; ++i) {
			if (array[i] < 0) {
				++noNegs;
			}
			if (array[i] == 0) {
				zeroIndex = i;
			}
		}
		
		if (zeroIndex > 0) {
			int l = findMaxProduct(array, begin, zeroIndex);
			int r = findMaxProduct(array, zeroIndex+1, end);
			return Math.max(l, r);
		}
		
		if (noNegs % 2 == 0) {
			int product = 1;
			for (int i = begin; i < end; ++i) {
				product *= array[i];
			}
			return product;
		}
		
		int fi, bi; // forward and backward indices
		int fp = 1, bp = 1; // forward and backward products
		for (fi = begin; fi < end; ++fi) {
			fp *= array[fi];
			if (array[fi] < 0) {
				break;
			}
		}
		for(bi = end-1; bi >= begin; --bi) {
			bp *= array[bi];
			if (array[bi] < 0) {
				break;
			}
		}
		
		int product = 1;
		int pbegin = (fp>bp) ? fi+1 : begin;
		int pend = (fp>bp) ? end : bi;
		
		for (int i = pbegin; i < pend; ++i) {
			product *= array[i];
		}
		return product;
	}
}
