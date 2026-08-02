class Solution {
    public boolean doesAliceWin(String s) {
        String vowels="aeiouAEIOU";
        for(int i=0;i<s.length();i++){
          
             if(vowels.contains(s.charAt(i)+"")) return true;
        }
       return false;
    }
}