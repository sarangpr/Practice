package misc;

public class SquareRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sqrt(65));
	}
	public static float sqrt(int x){
		float high=x;
		float low =0;
		float mid = (high +low)/2;
		while(!(Math.abs((mid*mid)-x)<=0.0001)){
			if(mid*mid>x){
				high=mid;
			}else{
				low =mid;
			}
			mid = (high+low)/2;
		}
		
		return mid;
		
	}
}
