package array_and_hashing


/**
 * @author Houwen Lie (houwenlie98@gmail.com)
 * @version 02.valid_anagram, v 0.1 Tue 7/2/2024 8:58 PM by Houwen Lie
 * @problem Valid Anagram - https://leetcode.com/problems/valid-anagram/
 */
object ValidAnagram {
    operator fun invoke(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        return mapWord(s) == mapWord(t)
    }

    private fun mapWord(word: String): Map<Char, Int> {
        val dict = mutableMapOf<Char, Int>()

        for (letter in word) {
            dict[letter] = dict[letter]?.plus(1) ?: 1
        }

        return dict
    }
}

