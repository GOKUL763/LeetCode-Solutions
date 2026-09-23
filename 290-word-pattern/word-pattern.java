class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverse = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (!map.containsKey(ch) && !reverse.containsKey(word)) {
                map.put(ch, word);
                reverse.put(word, ch);
            } else if (map.containsKey(ch) && map.get(ch).equals(word) && reverse.get(word) == ch) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}