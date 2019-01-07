package com.primary.array;

public class Array {

	public static void main(String[] args) {
//		int[] nums = {1,1,2,2,3,3,4,4,5,5,6,6,7};
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		
		Solution solution = new Solution();
		
		
//		solution.exsitRepetition(nums);
		int[] intersect = solution.intersect(nums1, nums2);
		for(int num : intersect) {
			System.out.print(num+">");
		}
		
	}
}
