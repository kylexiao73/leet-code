import java.util.LinkedList;

public class RemoveDuplicates {
	
	public static int removeDuplicates(int[] nums) {
		if(nums.length ==0) return 0;
        int count =1;
        for(int i =1; i<nums.length; i++) {
            if(nums[i]!=nums[i-1]) count++;
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,-1,0,2};
		System.out.println(removeDuplicates(nums));

	}

}
