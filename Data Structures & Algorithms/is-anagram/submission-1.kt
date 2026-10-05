class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val freq1 = mutableMapOf<Char, Int>()
        val freq2 = mutableMapOf<Char, Int>()

        if (s.length != t.length) {
            return false
        }

        for (ch in s) {
            freq1[ch] = freq1.getOrDefault(ch, 0) + 1
        }

        for (ch in t) {
            freq2[ch] = freq2.getOrDefault(ch, 0) + 1
        }

        return freq1 == freq2
    }
}