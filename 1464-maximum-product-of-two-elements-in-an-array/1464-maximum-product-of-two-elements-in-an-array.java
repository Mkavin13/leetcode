class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        int max=nums[n]-1;
        int smax=nums[n-1]-1;
        int sum=max*smax;
        return sum;
    }
}