package coinChange;

public class CoinChangeProblem {

	public int coin(int[] S, int m , int n) {
		if (n == 0)
	        return 1;
	     
	    if (n < 0)
	        return 0;
	 
	    if (m <=0 && n >= 1)
	        return 0;
	 
	    return coin( S, m - 1, n ) + coin( S, m, n-S[m-1] );
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		int m = arr.length;
		int n = 4;
		CoinChangeProblem solution = new CoinChangeProblem();
		System.out.println(solution.coin(arr, m, n));
	}

}
