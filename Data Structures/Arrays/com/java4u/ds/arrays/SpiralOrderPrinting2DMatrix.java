package com.java4u.ds.arrays;

public class SpiralOrderPrinting2DMatrix {

	public void printSpiralOrder(int A[][], int m, int n) {
		int i, k = 0, l = 0;

		while (k < m && l < n) {
			for (i = l; i < n; ++i) {
				System.out.print(" " + A[k][i]);
			}
			k++;

			for (i = k; i < m; ++i) {
				System.out.print(" " + A[i][n - 1]);
			}
			n--;

			if (k < m) {
				for (i = n - 1; i >= l; --i) {
					System.out.print(" " + A[m - 1][i]);
				}
				m--;
			}

			if (l < n) {
				for (i = m - 1; i >= k; --i) {
					System.out.print(" " + A[i][l]);
				}
				l++;
			}
		}
	}

	void print2dMatrix(int A[][], int m, int n) {
		for (int i = 0; i <= m - 1; i++) {
			for (int j = 0; j <= n - 1; j++) {
				System.out.print(A[i][j] + " ");
			}
		}
	}

	public static void main(String[] args) {
		SpiralOrderPrinting2DMatrix solution = new SpiralOrderPrinting2DMatrix();
		int A[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		solution.print2dMatrix(A, 4, 4);
		System.out.println();

		solution.printSpiralOrder(A, 4, 4);

	}

}
