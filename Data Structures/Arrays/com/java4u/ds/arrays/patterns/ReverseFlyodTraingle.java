package com.java4u.ds.arrays.patterns;

public class ReverseFlyodTraingle {

	public static void main(String[] args) {
		ReverseFlyodTraingle solution= new ReverseFlyodTraingle();
		solution.printReverseFloydTraingle(4);

	}

	private void printReverseFloydTraingle(int n) {
		int value=1;
		for(int i=n;i>=1;i--){
			for(int j=i;j>=1;j--){
				System.out.print(value+" ");
				value++;
			}
			System.out.println();
		}
		
	}

}
