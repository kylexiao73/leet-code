import java.util.*;

public class GenerateParentheses {
	public static List<String> generateParenthesis(int n) {
		
        LinkedList<String> res = new LinkedList<String>();
        if(n==0) return res;
        addP("",0,0,n,res);
        return res;
    }
	public static void addP(String s, int left, int right, int n, LinkedList<String>res) {
		
		if(left==n&&right==n) {
			res.add(s);
			return;
		}
		if(left<n) {
			addP(s+'(',left+1,right,n,res);
			
		}
		if(right<left) {
			addP(s+')',left,right+1,n,res);
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generateParenthesis(3));
	}

}
