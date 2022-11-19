class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sentence = s.split(" ");
        HashMap<Character, String> maps = new HashMap();
        if(pattern.length() != sentence.length) return false;
        for(int i=0; i<pattern.length(); i++){
            
            if(maps.containsKey(pattern.charAt(i))){
                if(!maps.get(pattern.charAt(i)).equals(sentence[i])){
                    return false;
                }
            }
            else{
                if(maps.containsValue(sentence[i])) return false;
                maps.put(pattern.charAt(i), sentence[i]);
            }
        }
        return true;
    }
}