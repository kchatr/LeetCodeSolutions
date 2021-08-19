public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder("");
        int max_len = Integer.MAX_VALUE;
        
        for(String s : strs) {
            if(s.length() < max_len) {
                max_len = s.length();
            }
        }
        
        for(int i = 0; i < max_len; i++) {
            char cur = strs[0].charAt(i);
            int count = 0;
            for (String s : strs) {
                if(s.charAt(i) == cur) {
                    count++;
                }
            }
            
            if(count == strs.length) {
                sb.append(Character.toString(cur));
            } else {
                break;
            }
        }
        
        return sb.toString();
        
    }
}
