package com.primary.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {

    public static int[] function1(int[] nums,int k) {
        int size = nums.length-1;
        int tmp = 0;
        for(int i=0;i<k;i++) {
         tmp = nums[i];
         nums[i] = nums[size-i];
         nums[size-i] = tmp;
        }
        for(int i=0;i<size+1;i++) {
            System.out.print(nums[i]+" ->");
        }
        return nums;
    }
    
    public static int[] function2(int[] nums,int k) {
//        [1,2,3,4,5,6,7]
//        [5,6,7,1,2,3,4]
        int size = nums.length-1;
        int tmp = 0;
        for(int i=0;i<size;i++) {
         tmp = nums[k];
         nums[i] = nums[size-i];
         nums[size-i] = tmp;
        }
        for(int i=0;i<size+1;i++) {
            System.out.print(nums[i]+" ->");
        }
        return nums;
    }
    
	public void RotateArray() {
		int[] array = {8,2,0,4,1,4,2,1,0,6,6,2,5,6,6,2,7,9,4,1};
		int k = 11939;
		int tmp1 = 0;
		int size = array.length;//���鳤��
		int len = array.length - 1;//��ȡ�±�
		for(int i=0;i<k;i++) {
			tmp1 = array[len];
			for(int j=len;j>0;j--) {
				array[j] = array[j-1];
			}
			array[0] = tmp1;
		}
		for(int i=0;i<size;i++) {
			System.out.print(array[i]+">");
		}
	}
	
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
	
	
	
}
