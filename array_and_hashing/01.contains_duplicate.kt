package array_and_hashing


/**
 * @author Houwen Lie (houwenlie98@gmail.com)
 * @version 01.contains_duplicate, v 0.1 Tue 7/2/2024 8:48 PM by Houwen Lie
 * https://leetcode.com/problems/contains-duplicate/
 */


fun containsDuplicate(nums: IntArray): Boolean {
    if (nums.isEmpty()) return false

    val unique = mutableSetOf<Int>()
    nums.forEach { num ->
        if (unique.contains(num)) return true
        unique.add(num)
    }

    return false
}
