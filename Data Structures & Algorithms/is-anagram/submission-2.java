class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] ch_s = s.toCharArray();
        char[] ch_t = t.toCharArray();

        int len = ch_s.length;

        int[] arrS = new int[len];
        int[] arrT = new int[len];

        for(int i = 0; i < len; i++) {
            arrS[i] = ch_s[i] - 'a';
            arrT[i] = ch_t[i] - 'a';
        }

        Arrays.sort(arrS);
        Arrays.sort(arrT);

        for(int i = 0; i < len; i++) {
            if(arrS[i] != arrT[i]) return false;
        }

        return true;
    }
}
