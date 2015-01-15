package misc;

public class FindIslands {
	static int[][] matrix ;
	static boolean[][]	visited;
	public static void main(String[] args) {
		matrix = new int[][]{{1,0,0,1},{0,1,0,0},{1,0,0,1}};
		visited = new boolean[matrix.length][matrix[0].length];
		System.out.println(numOfIslands());
	}
	public static int numOfIslands(){
		int islandCount=0;
		int i=0;
		int j =0;
		while(i<matrix.length){
			while(j<matrix[0].length){
				if(!visited[i][j]&&matrix[i][j]==1){
					islandCount++;
					islandTraveler(i, j);
				}
				j++;
			}
			i++;
			j=0;
		}
		return islandCount;
	}
	private static void islandTraveler(int x,int y){
		visited[x][y]=true;
		if(x-1>=0&&(!visited[x-1][y]&&matrix[x-1][y]==1))
			islandTraveler(x-1, y);
		if((x+1<matrix.length)&&(!visited[x+1][y]&&matrix[x+1][y]==1))
			islandTraveler(x+1, y);
		if((y-1>=0)&&(!visited[x][y-1]&&matrix[x][y-1]==1))
			islandTraveler(x, y-1);
		if((y+1<matrix[0].length)&&(!visited[x][y+1]&&matrix[x][y+1]==1))
			islandTraveler(x, y+1);
	}
}

