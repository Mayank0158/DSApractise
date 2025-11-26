class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        
        for(int i = 0 ; i<n ; i++){
            arr[i]= start + 2*i;
        }

        int help = 0 ; 

        for(int i : arr){
            help = help^i ;

        }

        return help ; 


        
    }
}