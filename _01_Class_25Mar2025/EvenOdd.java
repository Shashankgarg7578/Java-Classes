package _01_Class_25Mar2025;

public class EvenOdd {

	public static void main(String[] args) {
//		System.out.println("Shashank is a Good boy\tdata");

		// premitive Data types
		int a = 10;
		double d = 10.78;
		char ch = 'a';
		long l = 568546;
		String str = "Shashank Garg";
		System.out.println("String length " + str.length());

		// 1d Array :- always it starts from 0 index
		
		int[] array = { 2, 4, 6, 6, 7 };
		//System.out.println(array[8]); // indexOutOfBound Exception
		
		
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		System.out.println(arr[0]);

		System.out.println(arr.length);
		
		
		
		
		
		

		// 2d array
//		int[][] arr2 = new int[row][col];
		int[][] arrMatrix = new int[4][3]; // int ki by default value is 0.
		arrMatrix[2][1] = 30;
		arrMatrix[2][0] = 340;
		System.out.println(arrMatrix[2][0]);
		System.out.println("Row length" + arrMatrix.length); // row length
		System.out.println("Column length" + arrMatrix[0].length); // Column length


		
//		int a = 10; premitive
//		Employee emp = new Employe(); :- Reference
		

	}

}
