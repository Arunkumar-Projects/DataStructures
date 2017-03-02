package fibonacciseries;

public class FibonacciSeries {
	private static long[] fibArray = new long[100];
	int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static long fibonacciWithMemoization(int n) {
		long fibValue = 0;
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else if (fibArray[(int) n] != 0) {
			return fibArray[(int) n];
		} else {
			fibValue = fibonacciWithMemoization(n - 1) + fibonacciWithMemoization(n - 2);
			fibArray[(int) n] = fibValue;
			return fibValue;
		}
	}
	
	public static void main(String[] args) {
		int n=82;
		FibonacciSeries solution= new FibonacciSeries();
		//System.out.println(solution.fibonacci(n));
		System.out.println(fibonacciWithMemoization(n));
	}

}
