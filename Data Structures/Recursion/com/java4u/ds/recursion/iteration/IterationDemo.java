package com.java4u.ds.recursion.iteration;

public class IterationDemo {

	public int add(int N) {
		int result = 0;
		for (int i = 0; i <= N; i++) {
			result += i;
		}
		return result;
	}

	public static void main(String[] args) {
		IterationDemo solution = new IterationDemo();
		long operationStartMilliSeconds = System.currentTimeMillis();
		System.out.println(solution.add(7000));
		long operationEndMilliSeconds = System.currentTimeMillis();
		System.out.println(" Total Milliseconds consumed ::" + (operationEndMilliSeconds - operationStartMilliSeconds));
	}

}
