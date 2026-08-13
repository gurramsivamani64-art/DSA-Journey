class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
        int rep=-1;
            for(int j=i+1;j<n;j++){
                rep=Math.max(rep,arr[j]);
            }
                arr[i]=rep;
        }
        return arr;
    }
}
