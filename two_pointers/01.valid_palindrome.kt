package two_pointers


/**
 * @author Houwen Lie (houwenlie98@gmail.com)
 * @version 01.valid_palindrome, v 0.1 Wed 7/3/2024 7:40 PM by Houwen Lie
 * @problem Valid Palindrome - https://leetcode.com/problems/valid-palindrome
 */
object ValidPalindrome {

    operator fun invoke(s: String): Boolean {
        if (s.isBlank()) return true

        var (left, right) = Pair(0, s.lastIndex)
        while (left <= right) {
            if (!s[left].isLetterOrDigit()) {
                left++
                continue
            }

            if (!s[right].isLetterOrDigit()) {
                right--
                continue
            }

            if (s[left].lowercase() != s[right].lowercase()) {
                return false
            }

            left++
            right--
        }

        return true
    }
}