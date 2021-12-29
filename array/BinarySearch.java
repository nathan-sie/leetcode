package array;

//704
//数组为有序数组，同时题目还强调数组中无重复元素，因为一旦有重复元素，使用二分查找法返回的元素下标可能不是唯一的
//二分查找的要点应该在于区间的开闭和在循环中始终坚持根据查找区间的定义来做边界处理。区间的定义就是不变量，那么在循环中坚持根据查找区间的定义来做边界处理，就是循环不变量规则。
public class BinarySearch {
	
	class Solution { 
		//取闭区间 [left, right] 
	    public int search(int[] nums, int target) {
			int left = 0;
			int right = nums.length - 1;
	    	while(left<=right) {
	    		int middle = (left+right)/2; //这么写有可能会溢出，正确写法应该为 left + ((right - left) >> 1) 移位运算符
	    		if(nums[middle]>target) {
	    			right = middle - 1;	    			
	    		}else if(nums[middle] < target) {
	    			left = middle + 1;
	    		}else {
	    			return middle;
	    		}
	    			  		
	    		
	    	}
	    	return -1;	  
	    }
	}
	
	class Solution2 {
		//取开区间 [left, right) 
	    public int search(int[] nums, int target) {
	    	int left = 0;
	    	int right = nums.length - 1;
	    	while(left<right) {
	    		int middle = (left+right)/2;
	    		if(nums[middle]>target) {
	    			right = middle;
	    		}else if(nums[middle]<target) {
	    			left = middle + 1;
	    		}else {
	    			return middle;
	    		}
	    	}
	    	return -1;
	    }
	}
}
