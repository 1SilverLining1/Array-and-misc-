//https://leetcode.com/problems/get-equal-substrings-within-budget/

class Solution {
    public int equalSubstring(String s, String t, int Cost) {
        
        
        
        
        int head = 0, i = 0 , c = Cost , ans = 0 , n = t.length()  ; 
        while ( i < n )
        {
              
                    while (  c < Math.abs ( s.charAt ( i) - t.charAt( i ) ) )
                    {
                        if ( s.charAt ( head ) != t.charAt ( head ) )
                                c = c +  Math.abs ( s.charAt ( head ) - t.charAt( head ) ) ; 
                        head ++ ; 
                    }

                    c = c - Math.abs ( s.charAt ( i ) - t.charAt ( i ) ) ; 
                    ans = Math.max ( ans , i - head + 1 ) ; 
                    i ++ ; 
        }
        
        
        return ans ; 
        
    }
}
