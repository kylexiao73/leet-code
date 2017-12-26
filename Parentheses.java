import java.util.*;

public class Parentheses {
	public static boolean isValid(String s) {
        if(s.length()==0) return true;
        if(s.length()%2!=0) return false;
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<s.length();i++){
        	if (s.charAt(i)=='(' ||s.charAt(i)=='['||s.charAt(i)=='{') st.push(s.charAt(i));
        	if (s.charAt(i)==')' ||s.charAt(i)==']'||s.charAt(i)=='}') {
        		if(st.isEmpty()) return false;
        		if(reflect(s.charAt(i),st.peek())) st.pop();
        	}
        }
        if(st.isEmpty()){
        	return true;
        }
        return false;
    }
	public static boolean reflect(char a, char b) {
		if(a==')' && b=='(') return true;
		if(a=='}' && b=='{') return true;
		if(a==']' && b=='[') return true;
		else return false;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isValid("){"));
	}

}
