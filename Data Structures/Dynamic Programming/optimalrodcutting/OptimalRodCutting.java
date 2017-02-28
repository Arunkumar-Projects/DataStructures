package optimalrodcutting;

public class OptimalRodCutting {
	
	int optitmalRodCutting(int[] price, int n) {
		int maxValue = Integer.MIN_VALUE;
		if (n <= 0) {
			return 0;
		} else {
			for (int i = 0; i < n; i++) {
				maxValue = Math.max(maxValue, price[i] + optitmalRodCutting(price, n - i - 1));
			}
		}
		return maxValue;
	}

	public static void main(String[] args) {
		int a[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
		OptimalRodCutting solution = new OptimalRodCutting();
		int result = solution.optitmalRodCutting(a, a.length);
		System.out.println("The Rod can be cut into optimal way: " + result);
	}

}
