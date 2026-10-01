class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> h1=new HashMap<>();
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++){
            if(!h1.containsKey(s.charAt(i))){
                if(!h1.containsValue(t.charAt(i))){
                    h1.put(s.charAt(i),t.charAt(i));

                }
                else{
                    return false;
                }

            }
            else{
               if(h1.get(s.charAt(i))!=t.charAt(i)){
                return false;

               }
            }
        }

        return true;
    }
}