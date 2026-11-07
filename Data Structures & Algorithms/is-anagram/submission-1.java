class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character, Integer> hms = new HashMap<>();
        HashMap <Character, Integer> hmt = new HashMap<>();
        for(char c: s.toCharArray()){
            hms.put(c, hms.getOrDefault(c, 0) + 1);
        }
        for(char c: t.toCharArray()){
            hmt.put(c ,hmt.getOrDefault(c, 0) + 1);
        }
        if(hmt.equals(hms)) return true;
        return false;
    }
}
