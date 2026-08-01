class Solution {
    public int mirrorDistance(int n) {
        int n2=n;
    int sum=0;
        while(n!=0){
            int mod=n%10;
            sum=(sum*10)+mod;
            n=n/10;
        }
     return Math.abs(n2-sum);
    }
}