package binary_search


/**
 * @author Houwen Lie (houwenlie98@gmail.com)
 * @version 01.binary_search, v 0.1 Wed 7/3/2024 8:31 PM by Houwen Lie
 * @problem Binary Search  - https://leetcode.com/problems/binary-search
 */
object BinarySearch {

    operator fun invoke(nums: IntArray, target: Int): Int {
        if (nums.isEmpty()) return -1

        var (left, right) = Pair(0, nums.lastIndex)
        while (left <= right) {
            // mid = (left + right) / 2 could cause overflow when left + right > max int value
            val mid = left + ((right - left) / 2)
            when {
                nums[mid] == target -> return mid
                nums[mid] > target -> right = mid - 1
                else -> left = mid + 1
            }
        }
        return -1
    }
}