package com.java4u.ds.arrays.twodarray;

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

	public void printSpiralOrderUsingDirection(int A[][], int m, int n) {
		int columnStart = 0;
		int columnEnd = m - 1;
		int rowStart = 0;
		int rowEnd = n - 1;
		int dir = 0;
		while (columnStart <= columnEnd && rowStart <= rowEnd) {
			if (dir == 0) {
				for (int i = columnStart; i <= columnEnd; i++) {
					System.out.print(" " + A[rowStart][i]);
				}
				dir = 1;
				rowStart++;
			} else if (dir == 1) {
				for (int i = rowStart; i <= rowEnd; i++) {
					System.out.print(" " + A[i][columnEnd]);
				}
				dir = 2;
				columnEnd--;
			} else if (dir == 2) {
				for (int i = columnEnd; i >= columnStart; i--) {
					System.out.print(" " + A[rowEnd][i]);
				}
				dir = 3;
				rowEnd--;
			} else if (dir == 3) {
				for (int i = rowEnd; i >= rowStart; i--) {
					System.out.print(" " + A[i][columnStart]);
				}
				columnStart++;
				dir = 0;
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
		System.out.println();
		solution.printSpiralOrderUsingDirection(A, 4, 4);
	}

}
