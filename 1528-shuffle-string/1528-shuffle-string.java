class Solution {
    public String restoreString(String s, int[] ind) {
        int n=s.length();
        char c[]=new char[n];
        for(int i=0;i<n;i++){
        c[ind[i]]=s.charAt(i);
        }
    return new String(c);
    }
}