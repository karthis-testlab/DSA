package day1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class FindSquares {

	/*
	 * Given sorted integer array in non-decreasing order, return the array of the
	 * squares of each number sorted in non-decreasing order
	 * 
	 */
	
	/*
	 * 1) Take an input array
	 * 2) Create one variable int temp to swap the integer to sort the array in non-decreasing order 
	 * 3) Use if condition to check whether the arr is empty or not
	 *    A) If array is empty just return the empty array
	 * 4) Traverse the each element in the array from 0th to nth element and use
	 *    this formula to find squares arr[i] = arr[i] * arr[i]
	 * 5) Use nested for loop to confirm the above create square newArr is in sorted in non-decreasing order
	 * 6) Use if condition to identify the outer element is greater than or not with inner loop element
	 *    A) if yes, move the inner element to the right side in the array
	 *    B) if no, keep it as it is   
	 * 7) Finally return the array with the square of numbers and sorted in non-decreasing order
	 * 
	 */

	@Test //Positive Case
	public void example1() {
		int[] nums = { 2, 3, 4, 4, 5 };
		// Output --> {4, 9, 16, 16, 25};
		Assert.assertTrue(Arrays.equals(findSquares_BruteForce(nums), new int[] {4, 9, 16, 16, 25}));
	}

	@Test //Edge Case
	public void example2() {
		int[] nums = { -7, -5, 1, 4, 7 };
		// Output --> {1, 16, 25, 49, 49};
		Assert.assertTrue(Arrays.equals(findSquares_BruteForce(nums), new int[] {1, 16, 25, 49, 49}));
	}
	
	@Test //Negative Case
	public void example3() {
		int[] nums = {};
		Assert.assertTrue(Arrays.equals(findSquares_BruteForce(nums), new int[] {}));;
	}

	public int[] findSquares_BruteForce(int[] arr) {
		int temp;
		if (arr.length != 0) {			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = arr[i] * arr[i];
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] > arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			
		} 
		return arr;

	}

}