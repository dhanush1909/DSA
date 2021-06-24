class Solution {

    // Using has map to store last known location/index of a character
    public int lengthOfLongestSubstring_solution1(String s) {
        int low = 0;
        int maxLen = 0;
        Map<Character, Integer> lastFound = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (lastFound.get(c) == null || lastFound.get(c) < low) {
                maxLen = Math.max(maxLen, i - low + 1);
            } else {
                low = lastFound.get(c) + 1;
            }
            lastFound.put(c, i);
        }
        return maxLen;
    }
}