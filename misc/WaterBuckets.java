package misc;

public class WaterBuckets {
	static float[] buckets = null;
	public static void main(String[] args) {
		getWaterInBucket(10, 20);
		for(int i=1;i<buckets.length;i++){
			System.out.println(i+" -> "+buckets[i]);
		}
	}
	private static void getWaterInBucket(float x, int n){
		buckets = new float[n+1];
		helperFunction(0, x, 1);	
		
	}
	private static void helperFunction(int level, float x, int n){
		if(n>buckets.length-1){
			return;
		}
		float excess = (buckets[n]+x)-1.0>0.0?(buckets[n]+x)-1:0;
		buckets[n] = buckets[n]+x>1?1:buckets[n]+x;
		if(excess>0){
			helperFunction(level+1, excess/2, level+1+n);
			helperFunction(level+1, excess/2, level+2+n);
		}
	}
}
