class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result=new int[m+n];
        for(int i=0;i<m;i++){
            if(nums1[i]>=1 || nums1[i]<0)
                    result[i]=nums1[i];
                }
            for(int i=0;i<n;i++){
                if(nums2[i]>=1 || nums2[i]<0){
                    result[m+i]=nums2[i];
            }
        }
                Arrays.sort(result);
            for(int i=0;i<m+n;i++){
                 nums1[i]=result[i];
            }
        return ; 
    }
}
