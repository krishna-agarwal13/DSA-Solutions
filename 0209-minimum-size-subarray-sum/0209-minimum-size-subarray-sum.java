class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0, s=0;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            s+=nums[i];
            while(s >= target){
                min=Math.min(min, i-l+1);
                s -= nums[l];
                l++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}