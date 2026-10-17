class Solution {
    public int minDistance(String word1, String word2) {
        int n1=word1.length();
        int n2 = word2.length();
        int[][] a= new int[n2+1][n1+1];
        
        for(int i=0;i<=n1;i++){
            a[0][i]=i;
        }
        for(int i=0;i<=n2;i++){
            a[i][0]=i;
        }
        for(int i=1;i<=n2;i++){
            for(int j=1;j<=n1;j++){
                if(word1.charAt(j-1)==word2.charAt(i-1)){
                    a[i][j]=a[i-1][j-1];
                }
                else{
                    a[i][j]=Math.min(a[i-1][j-1],Math.min(a[i-1][j],a[i][j-1]))+1;

                }
            }
        }
        return a[n2][n1];
        
    }
}