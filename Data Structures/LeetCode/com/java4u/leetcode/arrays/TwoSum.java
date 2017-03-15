package com.java4u.leetcode.arrays;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		int[] output = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					output[0] = i;
					output[1] = j;
					System.out.println("["+i+","+j+"]");
					return output;

				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int []arr= {2, 3,4,5};
		int target=6;
		twoSum(arr,target);
	}

}
