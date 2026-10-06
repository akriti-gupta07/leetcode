class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        // int result=triangle.get(0).get(0);
        // int i=0;
        int n=triangle.size();
        if(n==1){
            return triangle.get(0).get(0);
        }

        for(int j=n-2;j>=0;j--){
            
            for(int i=0;i<=j;i++){
                int x= Math.min(triangle.get(j).get(i)+triangle.get(j+1).get(i),triangle.get(j).get(i)+triangle.get(j+1).get(i+1));
                triangle.get(j).set(i,x);

            }
            
            

        }
        return triangle.get(0).get(0);
    }
}