class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int ch) {
        List<Boolean> list=new ArrayList<>();
        int max=Arrays.stream(candies).max().getAsInt();
        int n=candies.length; 
        for(int i=0;i<n;i++){
            if(candies[i]+ch>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}