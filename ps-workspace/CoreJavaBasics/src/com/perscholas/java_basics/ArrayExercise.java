package com.perscholas.java_basics;

import java.util.Arrays;

public class ArrayExercise {

	public static void main(String[] args) {
		part1();
		part2();
		part3();
		part4();
		part5();
		part6();
		part7();
		part8();
		part9();
		part10();
	}

	//    Write a program that creates an array of integers with a length of 3. Assign the values 1, 2, and 3 to the
	//    indexes. Print out each array element.
	private static void part1() {
		int[] arr = {1, 2, 3};
		for (int i : arr)
			System.out.println(i);
	}

	//	Write a program that returns the middle element in an array. Give the following values to the integer array:
	//	{13, 5, 7, 68, 2} and produce the following output: 7
	private static void part2() {
		System.out.println();
		int[] arr = {13, 5, 7, 68, 2};
		int mid = (arr.length - 1) / 2;
		System.out.println(arr[mid]);
	}

	//	Write a program that creates an array of String type and initializes it with the strings “red”, “green”,
	//	“blue” and “yellow”. Print out the array length. Make a copy using the clone( ) method. Use the Arrays
	//	.toString( ) method on the new array to verify that the original array was copied.
	private static void part3() {
		System.out.println();
		String[] arr = {"red", "green", "blue", "yellow"};
		System.out.println(arr.length);
		String[] arr2 = arr.clone();
		System.out.println(Arrays.toString(arr2));
	}

	//	Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any integers
	//	.  Print out the value at the first index and the last index using length - 1 as the index. Now try printing
	//	the value at index = length ( e.g., myArray[myArray.length ] ).  Notice the type of exception which is
	//	produced. Now try to assign a value to the array index 5. You should get the same type of exception.
	private static void part4() {
		int[] arr = {1, 2, 3, 4, 5};

		System.out.printf("\nFirst index: %d\n" +
						"Last index: %d\n\n",
				arr[0], arr[arr.length - 1]);
//		System.out.printf("First index: %d\n" +
//				"Last index: %d\n",
//				arr[0], arr[arr.length]);
//		arr[5] = 6;

	}

	//	Write a program where you create an integer array with a length of 5. Loop through the array and assign the
	//	value of the loop control variable (e.g., i) to the corresponding index in the array.
	private static void part5() {
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		System.out.println(Arrays.toString(arr) + "\n");
	}

	//	Write a program where you create an integer array of 5 numbers. Loop through the array and assign the value of
	//	the loop control variable multiplied by 2 to the corresponding index in the array.
	private static void part6() {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 2;
		}
		System.out.println(Arrays.toString(arr) + "\n");
	}

	//	Write a program where you create an array of 5 elements. Loop through the array and print the value of each
	//	element, except for the middle (index 2) element.
	private static void part7() {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
			if (i == (arr.length - 1) / 2) {
				continue;
			} else {
				System.out.print(arr[i] + " ");
			}
		}
	}

	//	Write a program that creates a String array of 5 elements and swaps the first element with the middle element
	//	without creating a new array.
	private static void part8() {
		int[] arr = {3, 2, 1, 4, 5};
		System.out.println("\n\n" + Arrays.toString(arr));

		// Swap
		int mid = (arr.length - 1) / 2;
		int temp = arr[0];
		arr[0] = arr[mid];
		arr[mid] = temp;

		System.out.println(Arrays.toString(arr) + "\n");
	}

	//	Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in
	//	ascending order, print the smallest and the largest element of the array. The output will look like the
	//	following:
	//	Array in ascending order: 0, 1, 2, 4, 9, 13
	//
	//	The smallest number is 0
	//
	//	The biggest number is 13
	private static void part9() {
		int[] arr = {4, 2, 9, 13, 1, 0};

		// Simple bubble sort instead of Arrays.sort(arr)
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++){
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr) + "\n");
	}

	//	Create an array that includes an integer, 3 strings, and 1 double. Print the array.
	private static void part10() {
		Object[] arr = {1, "red", "blue", "green", 2.5};

		for (Object o : arr) {
			System.out.println(o.toString());
		}

	}
}
