import java.util.*;
public class phoneNumber {
	static String[] chars ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<String>();
		if(digits.length() ==0) return result;
		addnum(0,digits,result,"");
		return result;
		
		
	}
	private static void addnum(int at, String digits, List<String> res, String curr) {
		if(at>=digits.length()) {
			res.add(curr);
			System.out.println("res: "+res);
			return;
		}
		String l = chars[digits.charAt(at)-'0'];
		for(int i=0; i<l.length();i++) {
			addnum(at+1,digits,res,curr+l.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("petty" + "🙌🏾");
		
		
		System.out.println(letterCombinations("23"));
	}
}
