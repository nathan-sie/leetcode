package array;

//704
//����Ϊ�������飬ͬʱ��Ŀ��ǿ�����������ظ�Ԫ�أ���Ϊһ�����ظ�Ԫ�أ�ʹ�ö��ֲ��ҷ����ص�Ԫ���±���ܲ���Ψһ��
//���ֲ��ҵ�Ҫ��Ӧ����������Ŀ��պ���ѭ����ʼ�ռ�ָ��ݲ�������Ķ��������߽紦������Ķ�����ǲ���������ô��ѭ���м�ָ��ݲ�������Ķ��������߽紦������ѭ������������
public class BinarySearch {
	
	class Solution { 
		//ȡ������ [left, right] 
	    public int search(int[] nums, int target) {
			int left = 0;
			int right = nums.length - 1;
	    	while(left<=right) {
	    		int middle = (left+right)/2; //��ôд�п��ܻ��������ȷд��Ӧ��Ϊ left + ((right - left) >> 1) ��λ�����
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
		//ȡ������ [left, right) 
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
