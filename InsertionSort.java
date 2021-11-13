package classwork.Day8;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Before Sorting: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		insertionSort(n, arr);
		System.out.println("After Sorting: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

	private static void insertionSort(int n, int[] arr) {
		for(int j=0;j<n;j++) {
			int key=arr[j];
			int i=j-1;
			while((i>-1)&&(arr[i]>key)) {
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1]=key;
		}
	}
}