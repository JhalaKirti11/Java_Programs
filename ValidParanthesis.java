import java.util.*;

public class ValidParanthesis {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> bracket = new HashMap<>();
            bracket.put(')','(');
            bracket.put('}','{');
            bracket.put(']','[');
            for(char ch :s.toCharArray()){
                if(bracket.containsKey(ch)){
                    char elem = stack.isEmpty() ? '#' : stack.pop();
                    if(elem != bracket.get(ch)){
                        return false;
                    }
                }else{
                    stack.push(ch);
                }
            }
            return stack.isEmpty();
    }
    public static void main(String[] args) {
        ValidParanthesis vp = new ValidParanthesis();
        String s = "{([])}";
        boolean result = vp.isValid(s);
        System.out.println(result);
    }
}
