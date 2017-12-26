import java.util.*;

public class PascalTriangle {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(numRows == 0) return res;
		ArrayList<Integer> one = new ArrayList<Integer>(Arrays.asList(1));
		res.add(one);
		helper(numRows,res,2,one);
		return res;
	}
	private static void helper(int numRows, List<List<Integer>> res, 
			int pointer, ArrayList<Integer> base ){
		if(pointer>numRows) return;
		
		ArrayList<Integer> curr =new ArrayList<Integer>(Arrays.asList(1));
		for(int i=1; i<base.size();i++){
			int m = base.get(i-1)+base.get(i);
			curr.add(m);
		}
		curr.add(1);
		res.add(curr);
		helper(numRows, res,pointer+1,curr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> res = generate(5);
		System.out.println(res);
		
	}

}
