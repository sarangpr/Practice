package misc;

public class WaterTrapped {

	public static void main(String[] args) {
		System.out.println(waterTrapped(new int[]{5,5,4,7,8,2,6,9,4,5}));
	}
	private static int waterTrapped(int[] A){
		int startIndex, lowIndex, endIndex;
		int water=0;
		startIndex = A.length-1;
		lowIndex = A.length-2;
		endIndex = A.length-3;
		while(endIndex>=0&&!(startIndex<2)){
			while(startIndex>0&&A[startIndex]<A[startIndex-1]){
				startIndex--;
			}
			if(startIndex<2){
				break;
			}
			lowIndex = startIndex-1;
			endIndex=lowIndex-1;
			int localMax=endIndex;
			while(A[endIndex]<=A[startIndex]&&endIndex>0){
				endIndex--;
				if(A[localMax]<A[endIndex])
					localMax = endIndex;
			}
			endIndex=localMax;
//			if(A[endIndex]<A[lowIndex]){
//			    break;
//			}
			while(lowIndex>endIndex){
				int add =Math.min(A[endIndex], A[startIndex])-A[lowIndex--];
			    if(add>0)
				    water +=add ;
			}
			startIndex=endIndex;
			
		}
		return water;
	}
}
