package dataStructuresAndAlgorithms;

public class Arrays {

	// Single-Dimensional Array
	void singleDimensionalArray() {
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Array values at index " + i + " is " + arr[i]);
		}
	}

	// Multi-Dimensional Array
	void multiDimensionalArray() {
		int arr[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 4, 5, 6 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Array Element at position " + i + " is " + arr[i][j]);
			}
		}
	}

	// Single Dimensional Array with return
	int[] singleDimensionalArrayWithReturn() {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		return arr;
	}

	// Multi Dimensional Array with return
	int[][] multiDimensionalArrayWithReturn() {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
		return arr;
	}

	static void utilise1DArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("{Utilised} Array Element at index " + i + " is " + arr[i]);
		}
	}

	static void utiliseMultiDArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("{Utilised} Array Element at position " + i + " is " + arr[i][j]);
			}
		}
	}

	public static void main(String[] args) {
		Arrays arrayIteration = new Arrays();
		// arrayIteration.singleDimensionalArray();
		// arrayIteration.multiDimensionalArray();

		// Utilise the returned 1-D array in another method
		//utilise1DArray(arrayIteration.singleDimensionalArrayWithReturn());

		// Utilise the returned Multi-D array in another method
		utiliseMultiDArray(arrayIteration.multiDimensionalArrayWithReturn());
	}
}
