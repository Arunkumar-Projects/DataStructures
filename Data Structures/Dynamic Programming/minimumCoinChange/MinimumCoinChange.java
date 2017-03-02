package minimumCoinChange;

import java.util.HashMap;
import java.util.Map;

public class MinimumCoinChange {

	public int minimumCoinChangeTopdown(int total, int coins[], Map<Integer, Integer> map) {
		if (total == 0) {
			return 0;
		}

		if (map.containsKey(total)) {
			return map.get(total);
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < coins.length; i++) {
			if (coins[i] > total) {
				continue;
			}
			int val = minimumCoinChangeTopdown(total - coins[i], coins, map);
			if (val < min) {
				min = val;
			}
		}
		min = (min == Integer.MAX_VALUE ? min : min + 1);

		map.put(total, min);
		return min;
	}

	public int minimumCoinChangeBottomUp(int total, int coins[]) {
		int T[] = new int[total + 1];
		int R[] = new int[total + 1];
		T[0] = 0;
		for (int i = 1; i <= total; i++) {
			T[i] = Integer.MAX_VALUE - 1;
			R[i] = -1;
		}

		for (int j = 0; j < coins.length; j++) {
			for (int i = 1; i <= total; i++) {
				if (i >= coins[j]) {
					if (T[i - coins[j]] + 1 < T[i]) {
						T[i] = 1 + T[i - coins[j]];
						R[i] = j;
					}
				}
			}
		}
		printCoinCombination(R, coins);
		return T[total];

	}

	private void printCoinCombination(int R[], int coins[]) {
		if (R[R.length - 1] == -1) {
			System.out.print("No solution is possible");
			return;
		}
		int start = R.length - 1;
		System.out.print("Coins used to form total ");
		while (start != 0) {
			int j = R[start];
			System.out.print(coins[j] + " ");
			start = start - coins[j];
		}
		System.out.print("\n");
	}

	public static void main(String[] args) {
		int total = 13;
		int coins[] = { 7, 3, 2, 6 };
		MinimumCoinChange cc = new MinimumCoinChange();
		Map<Integer, Integer> map = new HashMap<>();
		int topDownValue = cc.minimumCoinChangeTopdown(total, coins, map);
		System.out.println("Minimum Coin Change Required: " + topDownValue);
		int bottomUpValue = cc.minimumCoinChangeBottomUp(total, coins);
		System.out.println("Minimum Coin Change Required: " + bottomUpValue);

	}

}
