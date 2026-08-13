class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
            int mincapacity=Integer.MAX_VALUE;
            int index=-1;
        for(int i=0;i<capacity.length;i++){   
        if(capacity[i]>=itemSize && capacity[i]<mincapacity){
          mincapacity=capacity[i];
            index=i;
        }
        }
        return index;
    }
}
