package New2026.Questions;

public class SlidingWindow {
    public static int lognestSubString(String s, int k) {

        int freq[] = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            freq[ch - 'A']++;

            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

            int windowLength = right - left + 1;

            int replacements = windowLength - maxFreq;

            if (replacements > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;

    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(lognestSubString(s,k));
    }
}
