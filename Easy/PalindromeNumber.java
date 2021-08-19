public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String str_x = String.valueOf(x);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = str_x.length() - 1; i >= 0; i--) {
            sb.append(Character.toString(str_x.charAt(i)));
        }
        
        if(sb.toString().equals(str_x)) {
            return true;
        } else {
            return false;
        }
    }
}
