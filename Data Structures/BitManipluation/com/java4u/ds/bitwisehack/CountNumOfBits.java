package com.java4u.ds.bitwisehack;

public class CountNumOfBits {
	public int countBits(int num) {
		int count = 0;
		while (num > 0) {
			if (num % 2 == 1) {
				count++;
			}
			num /= 2;
		}
		return count;
	}

	public static void main(String[] args) {
		CountNumOfBits solution = new CountNumOfBits();
		int result = solution.countBits(8);
		System.out.println("number of bits of given number" + result);
	}

}
