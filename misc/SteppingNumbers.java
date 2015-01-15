package misc;

public class SteppingNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printStepping(1, 100);
	}
	public static void printStepping(int s,int e){
		for(int i=s;i<=e;i++){
			if(isStepping(i))	System.out.println(i);
		}
	}
	public static boolean isStepping(int n){
		int temp=n;
//		int noOfDigits=0;
		if((n/10)==0){
			return true;
		}
		int prevDigit=n%10;
		n/=10;
		int curDigit;
		while(n!=0){
			curDigit=n%10;
			n/=10;
			if(Math.abs(curDigit-prevDigit)!=1){
				return false;
			}
			prevDigit=curDigit;
		}
		return true;
	}
}
