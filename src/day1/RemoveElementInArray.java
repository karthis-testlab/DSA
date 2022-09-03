package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class RemoveElementInArray {

	/*
	 * Given the integer array and the target, remove the matching target from the
	 * array
	 * 
	 * Static Array and Dynamic Array !!
	 * 
	 * Static Array --> Fixed Length --> number of elements is declared at the
	 * beginning you cannot resize them --> if we want to resize?? --> create
	 * another array (Arrays.copyOf)
	 * 
	 * Dynamic Array --> Not Fixed Length --> Array size that can change (grow or
	 * shrink) List/ Set / Map
	 * 
	 */

	@Test
	public void example1() {
		int[] nums = { 5, 3, 2, 1, 2, 3 };
		int target = 3;
		Assert.assertTrue(Arrays.equals(removeElement_BruteForce(nums, target), new int[] { 5, 2, 1, 2 }));
	}

	@Test
	public void example2() {
		int[] nums = { 5, 3, 2, 1, 2, 3 };
		int target = 4;
		Assert.assertTrue(Arrays.equals(removeElement_BruteForce(nums, target), nums));
	}

	@Test
	public void example3() {
		int[] nums = { 4, 4, 4, 4, 4, 3 };
		int target = 4;
		Assert.assertTrue(Arrays.equals(removeElement_BruteForce(nums, target), new int[] { 3 }));
	}

	@Test
	public void example4() {
		int[] nums = { 4, 4, 4, 4, 4, 4 };
		int target = 4;
		Assert.assertTrue(Arrays.equals(removeElement_BruteForce(nums, target), new int[] {}));
	}

	@Test
	public void example5() {
		int[] nums = {};
		int target = 4;
		Assert.assertTrue(Arrays.equals(removeElement_BruteForce(nums, target), new int[] {}));
	}
	
	/*
	 * 
	 * 1) Traverse the given array until nth element
	 * 2) Use if, condition to check the each element is equal to or not with the target value
	 *    a) If equal to target, then skip the element
	 *    b) If not equal with target, then add to list 
	 * 3) Traverse the list and add the each element into the new array
	 * 4) Finally return the new array
	 * 
	 */

	public int[] removeElement_BruteForce(int[] arr, int target) {
		if (arr.length != 0) {
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != target) {
					list.add(arr[i]);
				}
			}
			int[] newArr;
			if (!list.isEmpty()) {
				newArr = new int[list.size()];
				for (int i = 0; i < list.size(); i++) {
					newArr[i] = list.get(i);
				}
				return newArr;
			} else {
				return new int[] {};
			}

		} else {
			return arr;
		}
	}

}