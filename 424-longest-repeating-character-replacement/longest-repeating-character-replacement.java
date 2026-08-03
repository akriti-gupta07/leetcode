class Solution {
    public int characterReplacement(String s, int k) {
        int l=0, maxf=0 ;
        int[] arr= new int[26];
        int windows=0;
        int result=0;
        for(int r=0;r<s.length();r++){
            arr[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,arr[s.charAt(r)-'A']);
            

            while( ((r-l+1)-maxf) >k){
                arr[s.charAt(l) -'A']--;
                l++;
            }
            
            result= Math.max(result,r-l+1);
        }
        return result;


        
        
    }
}