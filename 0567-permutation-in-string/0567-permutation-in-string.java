class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (char ch : s1.toCharArray()) {
            freq1[ch - 'a']++;
        }

        int k = s1.length();

        for (int i = 0; i < k; i++) {
            freq2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(freq1, freq2)) return true;

        for (int i = k; i < s2.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;

            freq2[s2.charAt(i - k) - 'a']--;

            if (Arrays.equals(freq1, freq2)) {
                return true;
            }
        }
        return false;
    }
}