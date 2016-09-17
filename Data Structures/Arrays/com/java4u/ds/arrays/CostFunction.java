package com.java4u.ds.arrays;

import java.util.Arrays;

public class CostFunction {

	public int costFunction(int arr[]) {
		Arrays.sort(arr);
		
		int min=Integer.MAX_VALUE;
		int difference=0;
		for (int i = 0; i < arr.length - 1; i++) {
			difference=Math.abs(Math.abs(arr[i+1])-Math.abs(arr[i]));
			if(difference<min){
				min=difference;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		CostFunction result=new CostFunction();
		int []arr= {12,44,7,9,34,55};//7,8,
		System.out.println(result.costFunction(arr));
		
	}

}
