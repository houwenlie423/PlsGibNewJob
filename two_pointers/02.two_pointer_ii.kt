package two_pointers


/**
 * @author Houwen Lie (houwenlie98@gmail.com)
 * @version 02_two_sum_ii v 0.1 Mon 9/30/2024 5:35 AM by Houwen Lie
 * @problem Two Sum II - Input Array Is Sorted  - https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
 */
object TwoSumII {

    operator fun invoke(numbers: IntArray, target: Int): IntArray {
        if (numbers.isEmpty()) return intArrayOf()

        var (left, right) = Pair(0, numbers.lastIndex)

        while (left <= right) {
            val sum = numbers[left] + numbers[right]

            if (sum == target) {
                return intArrayOf(left+1, right+1)
            } else if (sum < target) {
                left++
            } else {
                right--
            }
        }
        return intArrayOf()
    }
}