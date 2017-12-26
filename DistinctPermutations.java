import java.util.*;

public class DistinctPermutations {
	public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums.length==0) return res;
        addper(res, new ArrayList<Integer>(),nums,new HashSet<Integer>());
        return res;
        
    }
	private static void addper(List<List<Integer>> res, ArrayList<Integer> l, int[] nums,
								HashSet<Integer> s){
		if(l.size()==nums.length) {
			res.add(new ArrayList<Integer>(l));
			
		}
		else{
			for(int i=0; i<nums.length;i++){
				if(!s.contains(nums[i])){
					//System.out.println("Ith run: "+i+" s before: "+s);
					l.add(nums[i]);
					int index = l.size()-1;
					s.add(nums[i]);
					addper(res,l,nums,s);
					//System.out.println("Ith run: "+i+" s after: "+s+"\n");
					s.remove(nums[i]);
					l.remove(index);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		
		System.out.println(permute(nums));
		
	}

}
