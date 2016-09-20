package com.java4u.ds.arrays.patterns;

public class FloydTraingleStars {

	public static void main(String[] args) {
		FloydTraingleStars solution= new FloydTraingleStars();
		solution.printFloydTraingle(3);

	}

	private void printFloydTraingle(int n) {
		int value=1;
		for(int i=0;i<=n;i++){
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
