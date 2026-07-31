class Solution {
    public int maxSubArray(int[] nums) {
        int cur= 0;
        int max=Integer.MIN_VALUE;
         for(int i=0;i<nums.length;i++){
            int temp = cur+nums[i];
            if(temp<nums[i])
            {
                cur=nums[i];

            }
            else{
                cur=temp;
            }
         
         if(max<cur){
           max=cur;
         }
    }
         return max;
        
    }
}