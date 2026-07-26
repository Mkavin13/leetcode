class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int n: nums){
            String s=String.valueOf(n);
            for(char c: s.toCharArray()){
                list.add(c-'0');
            }
        }
         int[] arr = new int[list.size()];
         int i=0;
         for(int n: list){
            arr[i++]=n;
         }
         return arr ;
    }
}