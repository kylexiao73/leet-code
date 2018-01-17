import java.util.*;

public class ThreeSum {
	 public static List<List<Integer>> threeSum(int[] nums) {
		 	List<List<Integer>> list;
		 	list = new ArrayList<List<Integer>>();
	        if(nums.length==0) return list;
	        Arrays.sort(nums);
	        for(int left=0; left<nums.length && nums[left]<=0;left++) {
	            int mid = left+1;
	            int right = nums.length -1;
	            /*
	            System.out.println(left);
	            System.out.println(mid);
	            System.out.println(right);
	            System.out.println(list);
	            */
	            if(left > 0 && nums[left] == nums[left-1])
	            	continue;
	            while(mid<right) {
	            	
	            	//System.out.println(nums[mid]+nums[right]);
	            	//System.out.println(nums[left]*(-1));
	            	if(nums[mid]+nums[right]==nums[left]*(-1)) {
	            		list.add(Arrays.asList(nums[left], nums[mid], nums[right]));
	            		while(mid < right && nums[mid] == nums[++mid]);//延时函数 = for loop
	            		while(mid < right && nums[right] == nums[--right]);
	            		
	            	}
	            	else if (nums[mid]+nums[right]>nums[left]*(-1)) {
	            		right--;
	            	}
	            	else{
	            		mid ++;
	            	}
	            }
	        }
	        return list;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {-2,-2,-1,-1,0,1,1,2,2};
		int[] nums2 = {-1, 0, 1, 2, -1, -4};
		int[] nums3 = {-2,0,1,1,2};
		int[] nums4 = {-4,-1,-1,0,1,2};
		
		System.out.println(threeSum(nums3));
	}

}
