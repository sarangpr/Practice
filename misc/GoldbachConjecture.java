package misc;
import java.util.HashSet;


public class GoldbachConjecture {

	/**
	 * @param args
	 */
	HashSet<Integer> primeMap = new HashSet<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(10);
	}
	public static void solution(int number){
		if((number<=2)||(number%2!=0)){
			System.out.println("error");
			return;
		}
		for(int i=0;i<number/2;i++){
			if(isPrime(i)){
				if(isPrime(number-i)){
					System.out.println(i+" + "+(number-i));
				}
			}
		}
	}
	private static void primeGen(int num){
		
	}
	private static boolean isPrime(int number){
		
		for(int i=2;i<Math.sqrt(number);i++){
			if(number%i==0) return false;
		}
		return true;
	}
}
