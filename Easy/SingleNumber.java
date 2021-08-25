import java.util.*;

public class SingleNumber {
    // Using a HashMap (Still O(n), but requires two separate for loops)
    public int singleNumber(int[] nums) {
        int num = 0;
        HashMap<Integer, Integer> oc = new HashMap<>();
        
        for(int i : nums) {
            if(!oc.containsKey(i)) {
                oc.put(i, 1);
            } else {
                oc.put(i, oc.get(i) + 1);
            }
        }
        
        for(int i : oc.keySet()) {
            if(oc.get(i) == 1) {
                num = i;
            }
        }
        
        return num;
    }

    // Using XOR i.e. bitwise manipulation
    // We note that, for any integer N, N ^ N = 0
    // This is due to the fact that XOR returns 1 ONLY for 2 different numbers
    // Using this fact, as well as XOR is commutative, we can use bitwise manipulation for a more efficient solution
    public int singleNumber2(int[] nums) {
        int ans = 0;

        for(int i = 0; i < nums.length; i++) {
            ans ^= nums[i];
        }

        return ans;
    }
}
