class Solution {
    public int[] concatWithReverse(int[] nums) {
        int rev[]=new int[nums.length];
        int result[]=new int[nums.length+nums.length];
        int ind=0;
        for(int i=nums.length-1;i>=0;i--){
            rev[ind]=nums[i];
            ind++;
        }
        ind=0;
        for(int i : nums){
            result[ind++]=i;
        }
        for(int i : rev){
            result[ind++]=i;
        }
        return result;
    }
}