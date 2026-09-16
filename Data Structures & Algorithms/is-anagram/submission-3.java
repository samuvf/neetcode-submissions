class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] ch_s = s.toCharArray();
        char[] ch_t = t.toCharArray();

        Arrays.sort(ch_s);
        Arrays.sort(ch_t);

        if(Arrays.equals(ch_s, ch_t)) return true;

        return false;
    }
}
