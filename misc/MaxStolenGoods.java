package misc;

import java.util.HashMap;

public class MaxStolenGoods {
	private static HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
	private static int[] values;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		values = new int[]{6,1,2,7,9};
		System.out.println(maxStolenGoods());
	}
	public static int maxStolenGoods(){
		return Math.max(maxStolenGoodsHelper(0),maxStolenGoodsHelper(1));
	}
	private static int maxStolenGoodsHelper(int i){
		if(i>=values.length){
			return Integer.MIN_VALUE;
		}
		if(i==values.length-1||i==values.length-2){
			hashMap.put(i, values[i]);
			return values[i];
		}
		int val1;
		if(hashMap.containsKey(i+2)){
			val1 = hashMap.get(i+2);
		}else{
			val1 = maxStolenGoodsHelper(i+2);
		}
		int val2;
		if(hashMap.containsKey(i+3)){
			val2 = hashMap.get(i+3);
		}else{
			val2 = maxStolenGoodsHelper(i+3);
		}
		hashMap.put(i, values[i]+Math.max(val1, val2));
		return values[i]+Math.max(val1,val2);
	}
}
