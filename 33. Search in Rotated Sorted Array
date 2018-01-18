
public class rotatedBSearch {
	
	public static int search(int[] nums, int target) {
		if(nums.length==0) return -1;
		int left = 0;
		int right = nums.length-1;
		//防止 l =2， r=3，mid = 2的死循环
		while(left+1 < right) {
			int mid = left+(right-left)/2;//防止l+r overflow
			if(target == nums[mid]) return mid;
			if(nums[mid]>=nums[left]) {
				if(target>=nums[left]&&target<=nums[mid]) right = mid;
				else left = mid;
			}
			else if(nums[mid] <= nums[right]) {
				if(target>=nums[mid] && target <= nums[right]) left = mid;
				else right = mid;
			}
		}
		if(target == nums[right]) return right;
		if(target == nums[left]) return left;
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,5,6,7,0,1,2};
		System.out.println(search(nums,2));
	}

}
