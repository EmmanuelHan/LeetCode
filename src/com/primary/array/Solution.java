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
	 * *该代码不是经过自己的思考得知，需要加强练习
	 * @param digits
	 * @return
	 */
	public int[] plusOne(int[] digits) {
        int length = digits.length;
        for(int i=length-1;i>=0;i--) {
            if(digits[i] < 9) {
            	digits[i]++;
            	return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[length + 1];
        result[0] = 1;
    	return result;
    }
	
	/**
	 * moveZeroes移动0
	 */
	public void moveZeroes(int[] nums) {
        
    }
	
	/**
	 * twoSum 两数之和
	 */
	public int[] twoSum(int[] nums, int target) {
        int[] result = {0,0};
        int length = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int num : nums) {
            list.add(num);
        }
        for(int i=0;i<length;i++) {
	       int num1 = target - nums[i];
	       if(list.contains(num1)) {
	           list.remove(i);
	           for(int j=i+1;j<length;j++) {
	               if(nums[j] == num1) {
	                   result[0] = i;
	                   result[1] = j;
	                   return result;
	               }
	           }
	       }
	    }
	    return result;
    }
	
	/**
	 * findMedianSortedArrays 寻找两个有序数组的中位数,
	 * #难易程度  难
	 */
    public double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        if (m > n) { // to ensure m<=n
            int[] temp = A;A = B;B = temp;
            int tmp = m;m = n;n = tmp;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && B[j - 1] > A[i]) {
                iMin = i + 1; // i is too small
            } else if (i > iMin && A[i - 1] > B[j]) {
                iMax = i - 1; // i is too big
            } else { // i is perfect
                int maxLeft = 0;
                if (i == 0) {
                    maxLeft = B[j - 1];
                } else if (j == 0) {
                    maxLeft = A[i - 1];
                } else {
                    maxLeft = Math.max(A[i - 1], B[j - 1]);
                }
                if ((m + n) % 2 == 1) {
                    return maxLeft;
                }

                int minRight = 0;
                if (i == m) {
                    minRight = B[j];
                } else if (j == n) {
                    minRight = A[i];
                } else {
                    minRight = Math.min(B[j], A[i]);
                }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }
    
    
    
}
