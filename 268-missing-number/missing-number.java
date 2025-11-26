class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0 ; 
        int l = nums.length ;

        int total = (l*(l+1))/2 ;  


        for(int i =0 ; i<l; i++){
            sum = sum + nums[i];
        }

       
        return  total-sum ; 

        
    }
}