package classwork.Day8;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n;
		System.out.println("Enter number of words: ");
		n = sc.nextInt();
		String words[] = new String[n];
		System.out.println("Enter the words: ");
		for (i = 0; i < words.length; i++) {
			System.out.print("Words " + (i + 1) + ":");
			words[i] = sc.next();
		}
		System.out.println("String is: ");
		for (i = 0; i < words.length; i++) {
			System.out.print(words[i]);
		}
		System.out.println();
		System.out.println("Enter the words which u want to search");
		String search = sc.next();

		Arrays.sort(words);
		int index = Arrays.binarySearch(words, search);
		System.out.println(search + " = " + index);
	}
}