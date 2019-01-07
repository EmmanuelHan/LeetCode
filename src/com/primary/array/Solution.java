package com.primary.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {

   /**
    * 从排序数组中删除重复项
    */
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        } else {
            int number = 0;
            for(int i=0; i<nums.length;i++){
                if(nums[i]!=nums[number]){
                   number++;
                   nums[number] = nums[i];
                }
            }
            return ++number;
        }
    }
    
    /**
     * 购买股票的最佳时机II
     */
    public int maxProfit(int[] prices) {
        int price = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                price += prices[i] - prices[i-1];
            }
        }
        return price;
    }
    
    /**
     * 旋转数组
     */
    public void rotate(int[] nums, int k) {
        int tmp1 = 0;
        int len = nums.length - 1;//获取下标
        for(int i=0;i<k;i++) {
            tmp1 = nums[len];
            for(int j=len;j>0;j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = tmp1;
        }
    }
	
	/**
	 * 存在重复
	 */
	public boolean exsitRepetition(int[] nums) {
		boolean flag = false;
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
        	set.add(num);
        }
        if(set.size() != nums.length) {
        	flag = true;
        }
        return flag;
	}
	
	/**
	 * 只出现一次的数字
	 * @param nums
	 * @return
	 */
	public int singleNumber(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int singleNumber = 0;
        for(int num : nums) {
        	if(!map.containsKey(num)) {
        		map.put(num, null);
        	} else {
        		map.put(num, num);
        	}
        }
		if(map.containsValue(null)) {
			for(Map.Entry<Integer,Integer> mapEntry : map.entrySet()){
				if(mapEntry.getValue() == null){
					singleNumber = mapEntry.getKey();
					return singleNumber;
				  } 
				}
		}
		return singleNumber;
    }
	
	/**
	 * 两个数组的交集II
	 */
	public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        for(int num : nums1) {
        	list1.add(num);
        }
        List<Integer> list2 = new ArrayList<>();
        for(int num : nums2) {
        	list2.add(num);
        }
        List<Integer> list = new ArrayList<>();
        Iterator<Integer> iterator = list2.iterator();
        while(iterator.hasNext()) {
        	Integer next = iterator.next();
        	if(list1.contains(next)) {
        		list.add(next);
        		list1.remove(next);
        	}
        }
        int size = list.size();
        int[] result = new int[size];
        for(int i=0;i<size;i++) {
        	result[i] = list.get(i);
        }
        return result;
    }
	
	/**
	 * *加一，给定一个数组，数组表示该数字的每一位，在该数字基础上加1，并重新退回到数组状态
	 * @param digits
	 * @return
	 */
	public int[] plusOne(int[] digits) {
        int length = digits.length;
        Long num = 0L;
        for(int i=0;i<length;i++) {
            num += digits[i] * (int) Math.pow(10, length-1-i);
        }
        num++;
        String valueOf = String.valueOf(num);
        int length2 = valueOf.length();
        String[] nums = new String[length2];
        nums = valueOf.split("");
        int[] result = new int[length2];
        for(int i=0;i<length2;i++) {
            result[i] = Integer.valueOf(nums[i]);
        }
	    return result;
    }
	
}
