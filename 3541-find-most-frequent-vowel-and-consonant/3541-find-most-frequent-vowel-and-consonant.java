class Solution {
    public int maxFreqSum(String s) {
        int vowel[]= new int[26];
        int con[]= new int[26];

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel[ch-'a']++;
            }else{
                con[ch-'a']++;
            }
        }

        int maxV=0;
        int maxC=0;

        for(int i=0;i<26;i++){
            if(maxV<vowel[i]){
                maxV=vowel[i];
            }
        }
        for(int i=0;i<26;i++){
            if(maxC<con[i]){
                maxC=con[i];
            }
        }

        return maxV+maxC;
    }
}