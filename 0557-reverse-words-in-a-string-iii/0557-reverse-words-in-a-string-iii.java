class Solution {
    public String reverseWords(String s) {
        
        String str[]=s.split(" ");
        String res="";
        for(int i=0;i<str.length;i++){
            StringBuilder sb=new StringBuilder();
            sb.append(str[i]);
            sb.reverse();
            res+=sb.toString();
            res=res+" ";
        }
        return res.trim();
    }
}