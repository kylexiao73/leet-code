import java.util.*;

public class ThreeSumCloest {
	 public static int threeSumClosest(int[] nums, int target) {
		 	int close = Integer.MAX_VALUE;
		 	int ans = 0;
	        if(nums.length==0) return 0;
	        Arrays.sort(nums);
	        for(int left =0; left<nums.length-2;left++) {
	        	int mid = left+1;
	        	int right = nums.length -1;
	        	while(mid<right) {
	        		int l,m,r;
	        		l = nums[left];
	        		m = nums[mid];
	        		r = nums[right];
	        		if(l+m+r == target) {
	        			return l+m+r;
	        		}
	        		else {
	        			if(Math.abs((l+m+r)-target)<close) {
	        				close = Math.abs((l+m+r)-target);
	        				ans = l+m+r;
	        			}
	        			if(r+m > target-l) {
	        				right--;
	        			}
	        			else {
	        				mid++;
	        			}
	        		}
	        	}
	        }
	     return ans;   
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums3 = {1,2,3,4,5,6,7,8};
		int[] nums4 = {-3,-2,-5,3,-4};
		int[] nums5 = {0,0,0};
		
		System.out.println(threeSumClosest(nums4,-1));
	}

}

