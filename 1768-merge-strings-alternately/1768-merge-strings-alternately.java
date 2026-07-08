class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int ind=0;
        while(ind<word1.length() || ind<word2.length()){
           if(ind<word1.length()){
            System.out.print(sb.append(word1.charAt(ind)));
           }
           if(ind<word2.length()){
            System.out.print(sb.append(word2.charAt(ind)));
           }
           ind++;

        }
        return sb.toString();
    }
}