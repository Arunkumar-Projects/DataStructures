package com.java4u.ds.arrays.patterns;

public class FlyodTraingle {

	void printFlyodTraingle(int n){
		int value=1;
		for(int i=0;i<=n;i++){
			for(int j=0;j<=i;j++){
				System.out.print(value+" ");
				value++;
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		FlyodTraingle solution= new FlyodTraingle();
		solution.printFlyodTraingle(3);

	}

}
