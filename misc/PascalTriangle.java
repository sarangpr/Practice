package misc;

public class PascalTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pascalAt(5,3));
	}
	public static int pascalAt(int x,int y){
		if(y>x||y<1){
			return 0;
		}
		if(y==1||y==x){
			return 1;
		}
		return pascalAt(x-1,y)+pascalAt(x-1,y-1);
	}
}
