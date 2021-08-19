class ReverseInteger(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        
        rev = ""
        
        str_x = str(abs(x))
        
        for i in range(len(str_x)):
            cur = str_x[len(str_x) - i - 1]
            
            if(cur != 0):
                rev += cur 
        
        
        ans = int(rev) if rev != "" else 0
        
        if(x < 0):
            ans *= -1
        
        if -2**31 <= ans <= 2**31 - 1:
            return ans
        else:
            return 0
        