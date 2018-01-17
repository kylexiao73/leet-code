import java.util.*;

public class findSubSetBFS {
	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(nums.length==0) return res ; 
		Arrays.sort(nums);
		boolean taken = true;
		bfs(taken, nums,res,new ArrayList<Integer>(),0);
		return res;
    }
	private static void bfs(boolean taken, int[] nums, List<List<Integer>> res, 
			ArrayList<Integer> l,int curr){
		if(curr == nums.length){
			res.add(new ArrayList<Integer>(l));
			return;
		}
		else{
				bfs(false, nums,res,l,curr+1);
				l.add(nums[curr]);
				if(taken || nums[curr]!=nums[curr-1]){
					bfs(true, nums,res,l,curr+1);
					l.remove(l.size()-1);
				}	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,4,4};
		System.out.println(subsets(nums));
	}

}
