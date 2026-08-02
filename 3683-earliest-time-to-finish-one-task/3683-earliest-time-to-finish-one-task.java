class Solution {
    public int earliestTime(int[][] tasks) {
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<tasks.length;i++){
            int sum=0;
            for(int j=0;j<tasks[0].length;j++){
                sum+=tasks[i][j];
                System.out.print(sum+" ");
            }
            mini=Math.min(sum,mini);
        }
        return mini;
    }
}