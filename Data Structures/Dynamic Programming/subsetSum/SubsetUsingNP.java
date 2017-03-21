package subsetSum;

public class SubsetUsingNP {

	public boolean isSubsetSum(int set[], int n, int sum) {
		if (sum == 0) {
			return true;
		}
		if (n == 0 && sum != 0) {
			return false;
		}
		if (set[n - 1] > sum) {
			return isSubsetSum(set, n - 1, sum);
		} else {
			return isSubsetSum(set, n - 1, sum) || isSubsetSum(set, n - 1, sum - set[n - 1]);
		}
	}

	public static void main(String[] args) {
		SubsetUsingNP solution = new SubsetUsingNP();
		int[] set = { 1, 3, 9, 2 };
		int sum = 5;
		int n = set.length;
		System.out.println(solution.isSubsetSum(set, n, sum));
		
		int[] set1 = { 1, 3, 9, 2 };
		int sum1 = 55;
		int n1 = set.length;
		System.out.println(solution.isSubsetSum(set1, n1, sum1));
	}

}
