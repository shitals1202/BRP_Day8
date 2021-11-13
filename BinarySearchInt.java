package classwork.Day8;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchInt {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] array) {
		System.out.println("Enter the number of Elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		binarySearch(n,arr);
	}

	private static void binarySearch(int n, int[] arr) {
		
		System.out.println("Enter number which u want to search: ");
		int key = sc.nextInt();

		int result = Arrays.binarySearch(arr, key);
		if (result < 0) {
			System.out.println("Element is not found");
		} else {
			System.out.println("Element is found at this index :" + result);
		}		
	}
}