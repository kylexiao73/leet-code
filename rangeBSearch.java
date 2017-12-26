
public class rangeBSearch {
	public static int[] searchRange(int[] nums, int target) {
		int[] res = {-1,-1};
		if(nums.length==0) return res;
		
		int start = -1;
		int end = -1;
		int left =0;
		int right = nums.length -1;
		while(left+1<right) {
			int mid = left+(right-left)/2;
			if(nums[mid]>= target) right = mid;
			else left = mid;
		}
		//System.out.println(nums[right]);
		if(nums[left] == target) start = left;
		else if(nums[right] == target) start = right;
		if(start == -1) return res;
		
		
		left = 0;
		right = nums.length-1;
		while(left+1<right){
			int mid = left+(right-left)/2;
			if(nums[mid]<= target) left = mid;
			else right = mid;
		}
		
		if(nums[right] == target) end = right;
		else if(nums[left] == target) end = left;
		if(end == -1) return res;
		
		res[0] = start;
		res[1] = end;
		return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums ={2,2};
		int[] res = searchRange(nums,2);
		System.out.println(res[0]+"  "+res[1]);
		
	}

}
