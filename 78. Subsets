import java.util.*;

public class FindSubset {
	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(nums.length==0) return res ; 
		dfs(nums,res,new ArrayList<Integer>(),0);
		return res;
    }
	private static void dfs(int[] nums, List<List<Integer>> res, 
			ArrayList<Integer> l,int curr ){
		//函数入口直接将新元素加到res
		res.add(new ArrayList<Integer>(l));
		for(int i=curr; i<nums.length;i++){
			l.add(nums[i]);
			dfs(nums,res,l,i+1);
			l.remove(l.size()-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		System.out.println(subsets(nums));

	}

}
