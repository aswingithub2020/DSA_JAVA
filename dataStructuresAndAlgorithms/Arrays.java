package dataStructuresAndAlgorithms;

public class Arrays {

	// Single-Dimensional Array
	void singleDimensionalArray() {
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Array values at index " + i + " is " + arr[i]);
		}
	}
	
	//Multi-Dimensional Array
	void multiDimensionalArray() {
		int arr[][]= {{1,2,3},{2,3,4},{4,5,6}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Array Element at position "+i+" is "+arr[i][j]);
			}
		}
		
	}

	public static void main(String[] args) {
		Arrays arrayIteration = new Arrays();
		//arrayIteration.singleDimensionalArray();
		arrayIteration.multiDimensionalArray();
	}
}
