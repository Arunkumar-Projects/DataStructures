package subsetSum;

public class SubsetSumUsingDP {

	private boolean isSubsetSum(int[] set, int n, int sum) {
		boolean subset[][] = new boolean[sum + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			subset[0][i] = true;
		}
		for (int j = 0; j <= sum; j++) {
			subset[j][0] = false;
		}

		for (int i = 1; i <= sum; i++) {
			for (int j = 1; j <= n; j++) {
				subset[i][j] = subset[i][j - 1];
				if (i >= set[j - 1]) {
					subset[i][j] = subset[i][j] || subset[i - set[j - 1]][j - 1];
				}
			}
		}
		return subset[sum][n];
	}

	private static void checkSubset(SubsetSumUsingDP solution, int[] set, int sum, int n) {
		if (solution.isSubsetSum(set, n, sum) == true)
			System.out.println("Found a subset with given sum");
		else
			System.out.println("No subset with given sum");
	}

	public static void main(String[] args) {
		SubsetSumUsingDP solution = new SubsetSumUsingDP();
		int[] set = { 1, 3, 9, 2 };
		int sum = 5;
		int n = set.length;
		checkSubset(solution, set, sum, n);
		sum=55;
		checkSubset(solution, set, sum, n);

	}


}
