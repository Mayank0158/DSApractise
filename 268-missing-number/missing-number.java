class Solution {
    public int missingNumber(int[] nums) {
        // int sum = 0 ; 
        // int l = nums.length ;

        // int total = (l*(l+1))/2 ;  


        // for(int i =0 ; i<l; i++){
        //     sum = sum + nums[i];
        // }

       
        // return  total-sum ; 

      int set = 0 ; 
      int len = nums.length ;
      
      for(int i : nums){
        set = set ^ i ; 
      }

      for(int i = 0 ; i<len+1;i++){
        set = set^i;
      }

      return set ; 

      

        
    }
}