package misc;

public class Steps {
	public static void main(String[] args) {
		System.out.println(numOfSteps(3));
	}
	private static int numOfSteps(int n){
		int[] helper = new int[n+1];
		helper[0]=1;
		for(int i=0;i<helper.length-1;i++){
			helper[i+1]=helper[i]+1;
			if(i+2<helper.length)
				helper[i+2]=helper[i]+1;
			if(i+3<helper.length)
				helper[i+3]=helper[i]+1;
		}
		return helper[n];
	}
}
