class Solution {
    public int findTheWinner(int n, int k) {
        int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=i+1;
      }
      ArrayList<Integer>list=new ArrayList<>();
      for(int i:arr){
        list.add(i);
      }int ind=0;
      while(list.size()>1){
        ind=(ind+k-1)%list.size();
        list.remove(ind);

      }
      System.out.println(list.get(0));
      return list.get(0);
    }
}