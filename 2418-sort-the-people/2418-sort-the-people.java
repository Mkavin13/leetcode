class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        String res[]=new String[names.length];
        int ind=0;
        for(String a:map.values()){
            res[ind++]=a;
        }
        return res;
    }
}