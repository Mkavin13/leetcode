class Solution {
    public int[] recoverOrder(int[] o, int[] f) {
        int res[]=new int[f.length];
        int a=0;
        for(int i=0;i<o.length;i++){
            for(int j=0;j<f.length;j++){
                if(o[i]==f[j]){
                    res[a++]=f[j];
                }
            }
        }
        return res;
    }
}