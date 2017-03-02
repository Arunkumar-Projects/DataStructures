package fibonacciseries;

public class FibonacciSeries {

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

	public static void main(String[] args) {
		int n=82;
		FibonacciSeries solution= new FibonacciSeries();
		System.out.println(solution.fibonacci(n));
	}

}
