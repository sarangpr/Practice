package misc;

public class SieveOfEratosthenes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPrimes(100);
	}
	public static void printPrimes(int n){
		int num_arr[]=new int[n];
	    int i=0,j=0;
	    int temp = 0;
	    for(i = 1; i<=n; i++){
	        num_arr[i-1] = i; 
	    }
	    
	    for(i = 2; i<=Math.sqrt(n);i++){
	        temp=i;    
	        if(num_arr[temp-1]!=0){
	        temp+=i;
	            while(temp<=100){
	                num_arr[temp-1] = 0;
	                temp=temp+i;
	            }
	        }
	    }
	    System.out.println("Prime numbers from 1 to 100 are:");
	    for(i=1;i<100;i++){
	        if(num_arr[i]!=0)
	        System.out.print(num_arr[i]+"\t");
	    }
	}
}	
