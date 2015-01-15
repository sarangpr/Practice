package misc;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = new int[]{
				1,5,10,25	
		};
		System.out.println(changeOfCoins(10, coins,coins.length-1));
	}
	public static int changeOfCoins(int total, int[]coins,int index){
		if(index==0){
			return 1;
		}
		int numOfPermutations=0;
		int n = total/coins[index];
		for(int j=0;j<=n;j++){
			int totalLeft = total-(j*coins[index]);
			if(totalLeft>=0)
				numOfPermutations +=(changeOfCoins(totalLeft, coins,index-1));
		}
		return numOfPermutations;
	}

public static int minChangeofCoins(int total, int[] coins){
	int[] counts = new int[total+1];
	counts[0]=0;
	for(int i=1;i<=total;i++){
		int count = Integer.MAX_VALUE;
		for(int j=0;j<coins.length;j++){
			//see if value of coin is less than or equal to the required total 
			if(i-coins[j]>=0&&count>counts[i-coins[j]]){
				count = counts[i-coins[j]];
			}
		}
		if(count<Integer.MAX_VALUE){
			counts[i]=count+1;
		}
		else{
			counts[i]=Integer.MAX_VALUE;
		}
	}
	return counts[total];
}
}
