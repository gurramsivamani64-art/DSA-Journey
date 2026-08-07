class Solution {
    public int findGCD(int[] nums) {
       Arrays.sort(nums);
       int start=nums[0];
       int n=nums.length;
       int end=nums[n-1];
       while(end!=0){ 
       int temp=end;
        end=start%end;
        start=temp;
       }
        return start;

    }
}
