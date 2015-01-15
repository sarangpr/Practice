package misc;

public class DistanceToDoor {
	public static void main(String[] args) {
		char[][]matrix = {{' ','w','d',' ',' '},{' ','w',' ','w',' '},{' ','w',' ','w','d'},{' ',' ',' ','w',' '}};
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]+"|");
			}
			System.out.println();
		}
		System.out.println();
		fillDistanceToDoor(matrix);
	}

	public static void fillDistanceToDoor(char[][] matrix){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				char c= matrix[i][j];
				if(c!='w'&&c!='d'){
					matrix[i][j]='x';
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]+"|");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]!='d'){
					findDistance(i+1, j, matrix,1);
					findDistance(i, j+1, matrix,1);
					findDistance(i-1, j, matrix,1);
					findDistance(i, j-1, matrix,1);
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	private static void findDistance(int i,int j,char[][] matrix,int distance){
		if(i<0||i>=matrix.length||j<0||j>=matrix[0].length||matrix[i][j]=='w'||matrix[i][j]=='d'){
			return;
		}
		if(matrix[i][j]=='x'){
			matrix[i][j]=(char)('0'+distance);
		}else if(((int)(matrix[i][j]-'0'))>distance){
			matrix[i][j]=(char)('0'+distance);
		}else{
			return;
		}
		findDistance(i+1, j, matrix,(matrix[i][j]-'0')+1);
		findDistance(i, j+1, matrix,(matrix[i][j]-'0')+1);
		findDistance(i-1, j, matrix,(matrix[i][j]-'0')+1);
		findDistance(i, j-1, matrix,(matrix[i][j]-'0')+1);
	}
}
