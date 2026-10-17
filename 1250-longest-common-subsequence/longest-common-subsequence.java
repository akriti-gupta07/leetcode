class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1=text1.length();
        int n2=text2.length();
        int[][] a= new int[n2+1][n1+1];
        a[0][0]=0;
        for(int i=1;i<=n2;i++){
            for(int j=1;j<=n1;j++){
                if(text2.charAt(i-1)==text1.charAt(j-1)){
                    a[i][j]=a[i-1][j-1] + 1;

                }
                else{
                    a[i][j] = Math.max(a[i-1][j],a[i][j-1]);
                }


            }
        }
        return a[n2][n1];


        
    }
}