
public class MaxSubArray {
	public static int maxSubArray(int[] nums) {
        if(nums.length==0) return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        int currMax=nums[0];
        
        for(int i=1; i<nums.length;i++){
        	currMax = Math.max(nums[i], currMax+nums[i]);
        	System.out.println("curr: "+currMax);
        	max = Math.max(max, currMax);
        	System.out.println("max: "+max+"\n");
        }
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(i));
	}

}
