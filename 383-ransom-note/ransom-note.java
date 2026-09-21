class Solution {
    public boolean canConstruct(String r, String m) {
        if( r.length() > m.length() ) return false;
        int[] freq = new int[26];

        for( char c : m.toCharArray())
            freq[c-'a']++;

        for( char c : r.toCharArray()){
            if(freq[c-'a']==0) return false;
            freq[c-'a']--;
        }
        return true;
    }
}