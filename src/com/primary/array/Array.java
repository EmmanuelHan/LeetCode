package com.primary.array;

import com.primary.string.StringSolution;


public class Array {

	public static void main(String[] args) {
//	    Solution solution = new Solution();
//		int[] nums = {1,1,2,2,3,3,4,4,5,5,6,6,7};
//		int[] nums1 = {4,9,5};
//		int[] nums2 = {9,4,9,8,4};
		
//		solution.exsitRepetition(nums);
//		int[] intersect = solution.intersect(nums1, nums2);
//		for(int num : intersect) {
//			System.out.print(num+">");
//		}
		
		//加一
//		int[] digits = {3,7,6,8,6,8,6,8,9,5,7,8,9,2,3,4,7,2,5,8,9,7,3,7,9,7,4,8,1,2,3,8,6,5,6,9,2,6,6,9};
//		System.out.println(solution.plusOne(digits));
//		int[] plusOne = solution.plusOne(digits);
//		for(int i=0;i<plusOne.length;i++) {
//		    System.out.print(plusOne[i]);
//		}
		
		//两数之和
//		int[] nums = {3,3};
//		int target = 6;
//		int[] twoSum = solution.twoSum(nums, target);
//		for(int i=0;i<twoSum.length;i++) {
//		    System.out.print(twoSum[i]+"/");
//		}
		
		//寻找两个有序数组的中位数
//		int[] nums1 = {3};
//		int[] nums2 = {-2,-1};
//		double findMedianSortedArrays = solution.findMedianSortedArrays(nums1, nums2);
//		System.out.println(findMedianSortedArrays);
	    
	    //水仙花数
//	    System.out.println("开始执行查询水仙花数。。。。。。");
//	    long starTime = new Date().getTime();
//	    Intger intger = new Intger();
//	    for(int i=0;i<1000;i++) {
//	        if(intger.narcissisticNumber(i)) {
//	            System.out.println(i);
//	        }
//	    }
//	    long endTime = new Date().getTime();
//	    System.out.println("本次执行花了" + (endTime - starTime) + "毫秒");
//	    System.out.println("判断水仙花数函数执行完毕！");

	    //反转字符串
	    StringSolution stringSolution = new StringSolution();
	    String string = "baibianwodeyang@outlook.com shjkahjfha1534a54f5q35345243Q@#$1";
	    stringSolution.reverseString(string);
	
	}
}
