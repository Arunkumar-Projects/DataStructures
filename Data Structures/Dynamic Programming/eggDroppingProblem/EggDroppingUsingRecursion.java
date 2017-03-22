package eggDroppingProblem;

public class EggDroppingUsingRecursion {

	public int calculate(int eggs, int floors) {
		if (eggs == 1) {
			return floors;
		}
		if (floors == 0) {
			return 0;
		}
		int min = 1000;

		for (int i = 1; i <= floors; i++) {
			int val = 1 + Math.max(calculate(eggs - 1, i - 1), calculate(eggs, floors - i));
			if (val< min) {
				min = val;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		EggDroppingUsingRecursion ed = new EggDroppingUsingRecursion();
		int r = ed.calculate(2, 10);
		System.out.println(r);

	}

}
