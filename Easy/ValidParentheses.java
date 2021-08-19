import java.util.*;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();

        map.put('{', '}');
        map.put('[', ']'); 
        map.put('(', ')');

        for(int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);

            if(map.keySet().contains(cur)) {
                stack.add(cur);
            } else {
                
                if(stack.empty()) {
                    return false;
                }

                char pair = map.get(stack.peek());

                if(cur == pair) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        if(stack.empty()) {
            return true;
        } else {
            return false;
        }
    }
    
}
