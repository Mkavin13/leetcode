class Solution {
    public int countPartitions(int[] nums) {
        int leftsum=0;
        int count=0;
        int totsum = Arrays.stream(nums).sum();
       // System.out.print(totsum);
        for(int i=0;i<nums.length-1;i++){
            leftsum+=nums[i];
            int rightsum=totsum-leftsum;
            if((leftsum-rightsum)%2==0){
                count++;
            } 
        }
        return count;
    }
}