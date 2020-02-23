//https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if ( s.isEmpty() )
                return 0 ; 
        int n = s.length(), head = 0 , ans = 1 , i = 0   ; 
        while ( i < n &&  s.charAt ( i ) == ' ' )
                i++ ; 
        int has [ ] = new int [ 10001 ] ; 
        for (  ; i < n ; i ++ )
        {
            has [ s.charAt ( i ) ] ++ ;
            while ( has [ s .charAt( i ) ] > 1 )
            {
                has [ s.charAt( head ) ] -- ; 
                head ++ ; 
            }
            
            ans =  Math.max( ans , i - head + 1 ) ; 
        }
        
        return ans ;    
    }
}
