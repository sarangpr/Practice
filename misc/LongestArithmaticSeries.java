package misc;

public class LongestArithmaticSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LongestArithmaticSeries().longestArithmaticSeries(new int[]{
				1,6,3,5,9,7
		}));

	}
	public int longestArithmaticSeries(int[] array){
		int maxLength = 0;
		int diff=0;
		for(int i=0;i<array.length-1;i++){
			int currentCount =1;
			diff = array[i+1]-array[i];
			for(int j = i+2;j<array.length;j++){
				if(diff==array[j]-array[i]){
					
					if(++currentCount>maxLength){
						maxLength = currentCount;
					}
				}
			}
		}
		return maxLength;
	}
}
