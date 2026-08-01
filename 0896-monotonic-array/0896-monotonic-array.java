class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean b=true;
        boolean c=true;
        for( int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
                b=false;
            if(nums[i]<nums[i+1])
                c=false;
        }
        return b||c;
    }
}