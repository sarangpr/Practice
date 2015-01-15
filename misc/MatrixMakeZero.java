package misc;


public class MatrixMakeZero {

	public static void main(String[] args) {
		int[][] matrix = {{0,1,1,1},{1,1,0,1},{1,1,1,1}};
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		makeZero(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void makeZero(int[][] matrix){
		boolean firstZero=false;
		for(int i=0;i<matrix.length;i++){
			if(matrix[0][i]==0){
				firstZero=true;
				break;
			}
		}
		for(int i=1;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					matrix[0][j]=0;
					matrix[i][0]=0;
				}
			}
		}
		//
		for(int j=1;j<matrix.length;j++){
			if(matrix[j][0]==0){
				for(int k=1;k<matrix[0].length;k++){
					matrix[j][k]=0;
				}
			}
		}
		//
		for(int i=0;i<matrix[0].length;i++){
			if(matrix[0][i]==0){
				for(int k=1;k<matrix.length;k++){
					matrix[k][i]=0;
				}
			}
		}
		if(firstZero){
			for(int i=0;i<matrix[0].length;i++){
				matrix[0][i]=0;
			}
		}
	}
}

