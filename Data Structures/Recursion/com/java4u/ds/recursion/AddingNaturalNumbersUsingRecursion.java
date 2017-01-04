package com.java4u.ds.recursion;

public class AddingNaturalNumbersUsingRecursion {

	public static int recursiveSum(int n){
		if(n<=1){
			return 1;
		}else{
			return n+ recursiveSum(n-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(recursiveSum(10000));

	}

}
