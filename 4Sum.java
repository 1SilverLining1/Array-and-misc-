//https://leetcode.com/problems/4sum/

class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        
        
        
        System.out.println ( target ) ; 
        int n = arr.length ;
        List < List< Integer> > ans = new ArrayList < List < Integer > > () ; 
        Map < List < Integer > , Integer > mp = new HashMap <List < Integer > , Integer> () ; 
        Arrays.sort ( arr ) ; 
        for ( int i = 0 ; i < n ; i ++ )
        {
            for ( int j = i + 1 ; j < n ; j ++ )
            {
                int x = arr [ i ] ; 
                int y = arr [ j ] ; 
                int left = j + 1 ; 
                int right = n - 1 ; 
                
                while ( left < right )
                {
                     
                    //cout << << endl ; 
                    if ( ( x + y + arr [ right ] + arr [ left ])  == target )
                    {
                       
                       //System.out.println ( target ) ; 
                       //System.out.println ( "cool" ) ; 
                       //System.out.println ( x + y + arr [ right ] + arr [ left ]  );
                       //System.out.println (  arr [ i ] + " " + arr [ j ] +  " " + arr [ left ] + ' ' + arr[ right] ) ;
                        List < Integer > temp = new ArrayList < Integer >() ;
                        temp.add ( x ) ; 
                        temp.add ( y ) ; 
                        temp.add ( arr [ left ] ) ; 
                        temp.add ( arr [ right] ) ; 
                        Collections.sort ( temp) ; 
                        if ( mp .get ( temp) == null)
                        {
                            mp. put ( temp , 1 ) ; 
                            ans.add ( temp ) ; 
                        }
                        left++ ; 
                        right --; 
                    }
                    else if ( x + y + arr [ right ] + arr [ left ] > target )
                            right -- ; 
                    else 
                            left ++;  
                }
            }
        
        }
        
        return ans ; 
        
        
    }
}
