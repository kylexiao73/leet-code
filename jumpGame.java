import java.util.Arrays;

public class jumpGame {
	 public static boolean canJump(int[] nums) {
		 if(nums.length==0)return false;
	        int reach = nums[0];
	        
	       for(int i=0; i<nums.length;i++){
	    	   if(i>reach) return false;
	    	   reach = Math.max(reach, i+nums[i]);
	        }
	        return true;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,1,1,4};
		System.out.println(canJump(nums));
	}

}
