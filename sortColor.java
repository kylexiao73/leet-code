import java.util.Arrays;

public class sortColor {
	public static void sortColors(int[] nums) {
		if(nums.length==0) return;
		int zero = 0;
		int one =0;
		int two = 0;
		for(int i=0; i<nums.length;i++){
			if(nums[i]==0) zero++;
			if(nums[i]==1) one++;
			if(nums[i]==2) two++;
		}
		for(int i=0;i<zero;i++) nums[i] =0;
		for(int i=zero;i<one+zero;i++)nums[i] = 1;
		for(int i = one+zero; i<nums.length;i++) nums[i] = 2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,2,1,1,2,0,0,1,2};
		sortColors(nums);
		System.out.println(Arrays.toString(nums));
	}

}
