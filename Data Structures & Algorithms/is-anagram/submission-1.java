class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        char[] ch_s = s.toCharArray();
        int value = 1;
        for(int i = 0; i < ch_s.length; i++) {
            if (map.containsKey(ch_s[i])) {
                value = map.get(ch_s[i]);
                ++value;
                map.put(ch_s[i], value);
            } else {
                value = 1;
                map.put(ch_s[i], value);
            }
        }

        char[] ch_t = t.toCharArray();
        for(int i = 0; i < ch_t.length; i++) {
            if(!map.containsKey(ch_t[i])) {
                return false;
            }
            value = map.get(ch_t[i]);
            --value;
            if(value == 0) {
                map.remove(ch_t[i]);
            } else {
                map.put(ch_t[i], value);
            }
        }

        if(map.isEmpty()) return true;

        return false;
    }
}
