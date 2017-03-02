package optimalrodcutting;

public class OptimalRodCuttingUsingMemoization {

	private int optitmalRodCutting(int[] price, int n) {
		int val[] = new int[n + 1];
		val[0] = 0;
		for (int i = 1; i <= n; i++) {
			int max_val = Integer.MIN_VALUE;
			for (int j = 0; j < i; j++) {
				max_val = Math.max(max_val, price[j] + val[i - j - 1]);
			}
			val[i] = max_val;
		}
		return val[n];
	}

	public static void main(String[] args) {
		int a[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
		OptimalRodCuttingUsingMemoization solution = new OptimalRodCuttingUsingMemoization();
		int result = solution.optitmalRodCutting(a, a.length);
		System.out.println("The Rod can be cut into optimal way: " + result);
	}

}
