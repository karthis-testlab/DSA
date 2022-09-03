package day1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TwoSumWithOneTarget_CodingTemplate {
	
	/*
	 * Given the input int array, find the sum of any two distinct indices of the matching given the target.
	 * 
	 */
	
	@Test
	public void example1() {
		int[] nums = {2, 15, 11, 7};
		int target = 9;
		twoSumWithOneTarget_2Pointer(nums, target);
		// Output --> {0, 1}
	}
	
	//@Test
	public void example2() {
		int[] nums = {2, 2, 3, 1, 4, 0, 5};
		int target = 5;
		twoSumWithOneTarget_BruteForce(nums, target);
		// Output --> {{0, 2}, {1, 2}, {3, 4}, {5, 6}}
		
	}
	
	@Test
	public void example3() {
		int[] nums = {2, 2, 3, 1, 4, 0, 5};
		int target = 45;
		twoSumWithOneTarget_BruteForce(nums, target);
		// Output --> -1		
	}
	
	/*
	 * 1) Take the input array
	 * 2) Traverse every element using for loop
	 * 3) Add with the next element with the outer loop
	 * 4) Compare with the sum with the target
	 *     a) If it matches, store them in a list !!
	 *     b) If does not match, continue
	 * 5) Finally, return the list!!    
	 * 6) Use if condition to check the target element in found in the array or not
	 *     a) If found, then return the indices list
	 *     b) If not found, throw the run time exception 
	 * 
	 */
	
	public void twoSumWithOneTarget_BruteForce(int[] arr, int target) {	
		boolean toReturn = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				if(sum == target) {
					System.out.print("{"+i+","+j+"}");
					toReturn = true;
				}				
			}			
		}
		
		if(!toReturn) {
			throw new RuntimeException("In the given array, "+Arrays.toString(arr)+" the sum of any two distinct indices of the matching the given target "+target+" was not found");
		}
		System.out.println();
	}
	
	public void twoSumWithOneTarget_2Pointer(int[] arr, int target) {
		int left = 0, right = arr.length - 1;
		while(left < right) {
			if(arr[left] + arr[right] == target) {
				System.out.println("{ "+left+", "+right+" }");
				break;
			}
			
			if(arr[left] + arr[right] > target) {
				right--;
			} else {
				left++;
			}
			
		}
	}
	
	
	
	
	
	

}