class Solution {
    public int digitFrequencyScore(int n) {
        int sum=0;
        String s=Integer.toString(n);
        int freq[]=new int[10];
        for(char c: s.toCharArray()){
            freq[c-'0']++;
        }
        for(int i=0;i<freq.length;i++){
                sum+=(i*freq[i]);
        }
        return sum;
    }
}