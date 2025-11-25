class Solution {
    public int hammingWeight(int n) {
        int help = 1 ; 
        int count = 0 ; 
        String str = Integer.toBinaryString(n);
        int l = str.length();
        for(int i = 0 ; i<l ; i++){
            if((n&help)!=0){
                count++ ; 

            }
            help = help<<1 ; 
        }

        return count ; 

        
    }
}