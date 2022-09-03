package day2;

import org.junit.Assert;
import org.junit.Test;

public class FindMinValueInArray {

	@Test
	public void example1() {
		int[] nums = {2, 4, 1, 5};		
		Assert.assertEquals(1, findMinValue_BruteForce(nums));
	}

	@Test
	public void example2() {
		int[] nums = {2, 4, 1, 5, 0, -1};		
		Assert.assertEquals(-1, findMinValue_Max_Value(nums));		
	}	

	public int findMinValue_BruteForce(int[] arr) {
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					min = arr[i];					
				} else {
					min = arr[j];
				}				
			}			
		}
		return min;

	}
	
	public int findMinValue_Max_Value(int[] arr) {
		int min = Integer.MAX_VALUE;		
		for (int i = 0; i < arr.length; i++) {
			min = (arr[i] < min) ? arr[i] : min;
		}
		return min;
		
	}

}