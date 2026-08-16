class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int index=0;
        int[] temp=new int[n];
      for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
           temp[index]=nums[i];
           index++;
        }
      }  
       for(int i=0;i<n;i++){
        nums[i]=temp[i];
       }
      return ;
    }
}
