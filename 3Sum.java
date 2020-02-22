/https://leetcode.com/problems/3sum/

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        
        
        
      List < List < Integer > > ans = new ArrayList < List<Integer>>() ; 
        Map < List< Integer> ,Integer > mp = new HashMap < List< Integer> ,Integer > () ; 
        int n = arr.length ; 
        Arrays.sort ( arr ) ; 
      for ( int i = 0 ; i < n ; i ++ )
      {
          int left = i + 1  ; 
          int right = n - 1  ; 
          int x = arr [ i ] ; 
          while ( left < right )
          {
              if ( x + arr [ left ]+ arr [ right ] == 0 )
              {
                  List < Integer > temp = new ArrayList < Integer> () ; 
                  temp.add ( x ) ; 
                  temp.add ( arr [left ] ) ; 
                  temp.add ( arr [ right ] ) ;
                  if ( mp .get ( temp ) == null )
                  {  
                      ans.add ( temp ) ; 
                      mp.put ( temp , 1 ) ; 
                  }
                  left ++; 
                  right -- ; 
              }
              else if ( x + arr [ left ]+ arr [ right ] > 0 )
                  right -- ; 
              else 
                    left ++ ; 
          }
      }
        
        return ans ; 
    }
}
