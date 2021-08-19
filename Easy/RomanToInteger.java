public class RomanToInteger {
    public int romanToInt(String s) {
        int num = 0;
        
        for(int i = s.length() - 1; i >= 0; i--) {
            char cur = s.charAt(i);
            
            switch(cur) {
                case 'I': 
                    if(i == s.length() - 1) {
                        num += 1;
                    } else {
                        if(s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X') {
                            num -= 1;
                        } else {
                            num += 1;
                        }
                    }
                    break;
                case 'V':
                    num += 5;
                    break;
                case 'X':
                    if(i == s.length() - 1) {
                        num += 10;
                    } else {
                        if(s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C') {
                            num -= 10;
                        } else {
                            num += 10;
                        }
                    }
                    break;
                case 'L':
                    num += 50;
                    break;
                case 'C':
                    if(i == s.length() - 1) {
                        num += 100;
                    } else {
                        if(s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M') {
                            num -= 100;
                        } else {
                            num += 100;
                        }
                    }
                    break;
                case 'D':
                    num += 500;
                    break;
                case 'M':
                    num += 1000;
                    break;
                    
            }
        }
        return num;
    }
}
