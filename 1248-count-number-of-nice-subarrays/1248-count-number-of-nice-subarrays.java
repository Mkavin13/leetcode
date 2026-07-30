class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int[] count = new int[nums.length + 1];
        count[0] = 1;
        int sum = 0;
        int ans = 0;
        for (int num : nums) {
            if(num % 2 != 0) sum +=1;
            else sum+=0;
            if (sum >= k) {
                ans += count[sum - k];
            }
            count[sum]++;
        }
        return ans;
    }
}