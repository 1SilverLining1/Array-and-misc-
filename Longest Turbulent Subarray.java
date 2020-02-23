//https://leetcode.com/problems/longest-turbulent-subarray/

class Solution {
    public int maxTurbulenceSize(int[] arr ) {
        
        
        int n = arr.length , ans = 0 ; 
        if ( n == 1 )
                return 1 ; 
        else 
        {
            for ( int i = 0 ; i < n ; i ++ )
            {
                if ( i - 1 >=0 && arr [ i ] != arr [ i - 1 ] )
                {
                    ans = 2 ; 
                    break ; 
                }
            }
        }
        for ( int i = 0 ; i < n ; )
        {
            //System.out.print ( i + " " ) ; 
             int len = 0 ; 
             while  (i + 1 <  n && i - 1 >= 0 && arr [ i ] > arr [ i - 1 ]  && arr [ i ] > arr [ i + 1] )
             {
                    i += 2; 
                    len ++ ; 
             } 
             len = 2 * len + 1 ;
             if ( i != n &&  i - 1 >= 0  && arr [ i ] > arr [ i - 1 ] )
             {
                   len ++ ; 
             }
             ans = Math.max ( ans , len  ) ; 
            i++ ;
        }
        
       //System.out.println ( ans ) ; 
        
         for ( int i = 0 ; i < n ; )
        {
            
             int len = 0 ; 
             while  (  i + 1 < n && i - 1 >= 0 && arr [ i ] < arr [ i - 1 ] && arr [ i ]  < arr [ i + 1 ] )
             {
                    i += 2; 
                    len ++ ; 
             }
             len = 2 * len + 1 ;    

             if ( i != n && i - 1 >= 0  &&  arr [ i ] < arr [ i - 1 ] )
             {
                                len ++ ; 
             }
             
                 
                
             ans =Math.max ( ans , len  ) ;
             i++ ; 
        }
        return ans ; 
    }
}
