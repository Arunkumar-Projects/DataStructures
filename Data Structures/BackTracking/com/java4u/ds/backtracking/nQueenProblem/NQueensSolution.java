package com.java4u.ds.backtracking.nQueenProblem;

public class NQueensSolution {
	private int[] nQueensArray;
	private int numberOfQueens;

	public NQueensSolution(int numberOfqueens) {
		nQueensArray = new int[numberOfqueens];
		this.numberOfQueens = nQueensArray.length;
	}

	public void solveNQueensSolution() {
		arrangeQueens(0);
	}

	private void arrangeQueens(int rowIndex) {
		for (int i = 0; i < numberOfQueens; i++) {
			if (isPlaceValid(rowIndex, i)) {
				nQueensArray[rowIndex] = i;
				if (rowIndex == numberOfQueens - 1) {
					printNQueens(nQueensArray);
				} else {
					arrangeQueens(rowIndex + 1);
				}
			}
		}
	}

	private boolean isPlaceValid(int rowIndex, int columnIndex) {
		for (int i = 0; i < rowIndex; i++) {
			if (nQueensArray[i] == columnIndex)
				return false; // same column
			if ((i - rowIndex) == (nQueensArray[i] - columnIndex))
				return false; // for ascending .. 
			if ((i - rowIndex) == (columnIndex - nQueensArray[i]))
				return false; // for descending...
		}
		return true;

	}

	private void printNQueens(int[] nQueenArray) {
		int numberOfQueens = nQueenArray.length;
		for (int i = 0; i < numberOfQueens; i++) {
			for (int j = 0; j < numberOfQueens; j++) {
				if (nQueensArray[i] == j) {
					System.out.print(" * ");
				} else {
					System.out.print(" - ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
