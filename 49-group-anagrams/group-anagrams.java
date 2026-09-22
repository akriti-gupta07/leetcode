class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map= new HashMap<>();
        for( String str: strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String s= new String(ch);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>(Arrays.asList(str)));

            }
            else{
                map.get(s).add(str);
            }
        }
        return new ArrayList<>(map.values());
        
    }
}