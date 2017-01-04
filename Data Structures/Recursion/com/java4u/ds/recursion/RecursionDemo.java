package com.java4u.ds.recursion;

public class RecursionDemo {

	public int add(int N) {
		if (N < 0) {
			return 0;
		} else if (N == 1) {
			return 1;
		} else
			return N + add(N - 1);
	}

	public static void main(String[] args) {
		RecursionDemo solution = new RecursionDemo();
		long operationStartMilliSeconds = System.currentTimeMillis();
		System.out.println(solution.add(7000));
		long operationEndMilliSeconds = System.currentTimeMillis();
		System.out.println(" Total Milliseconds consumed ::" + (operationEndMilliSeconds - operationStartMilliSeconds));

	}

}
