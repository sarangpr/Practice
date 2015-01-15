package misc;

public class CounterClockwisePrinting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] a = new char[][]{{'c','i','p','e'},{'r','n','k','u'},{'u','o','w','o'},{'l','e','s','y'}};
		print(a);
	}
	public static void print(char[][] a){
		int k=0,m=a.length,l=a[0].length, n=0;
		// k=start row index
		// m = end row index
		// l = start column index
		// n = end column index
		int i=0;
		while(k < m && l > n)
	    {
	        for(i = l-1; i >= n; i--){
	            System.out.print(a[k][i]+" ");
	        }
	        k++;
	        for(i = k; i < l; i++){
	        	System.out.print(a[i][n]+" ");
	        }
	        n++;
	        
	        if(k < m)
	        {
	            for(i = n; i < l; i++){
	            	System.out.print(a[m-1][i]+" ");
	            }
	            m--;
	        }
	        if (l > n)
	        {
	            for (i = m-1; i >= k; --i)
	            {
	            	System.out.print(a[i][l-1]+" ");
	            }
	            l--;    
	        }        
	    }
		
	}
}
