package sorting;

public class SortRGB {
	public static void main(String[] args) {
		int[] a = new int[]{0,1,2};
		sortColors(a);
		for(int i:a){
			System.out.println(i);
		}
	}
	 public static void sortColors(int[] A) {
	        int zero=0;
	        int two = A.length-1;
	        for(int i=0;i<two;i++){
	        	if(two<=zero){
	        		break;
	        	}
	            if(A[i]==0){
	            	if(i==zero){
	            		zero++;
	            	}else{
	            		swap(A,zero++,i--);
	            	}
	            }
	            else if(A[i]==2){
	                swap(A,two--,i--);
	            }
	        }
	    }
	    static void swap(int[] a,int i,int j){
	        int temp = a[i];
	        a[i]=a[j];
	        a[j]=temp;
	    }
}
