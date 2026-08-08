class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();;
       for(int i=left;i<=right;i++){
        int n=i;
        boolean isvalid=true;
        while(n>0){
        int digit=n%10;
       if(digit==0||i%digit!=0 ){
       isvalid=false;
       break;
       }
       n=n/10;
       } 
       if(isvalid){
        ans.add(i);
       }
       }
       return ans;
    }
    }
