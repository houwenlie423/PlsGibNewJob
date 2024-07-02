package array_and_hashing


/**
 * @author Houwen Lie (houwenlie98@gmail.com)
 * @version 03.two_sum, v 0.1 Tue 7/2/2024 9:13 PM by Houwen Lie
 * @problem Two Sum - https://leetcode.com/problems/two-sum
 */
object TwoSum {
    operator fun invoke(nums: IntArray, target: Int): IntArray {
        // Complement to Index dictionary (necessary to keep track of indices)
        // eg: nums = [2,7,11,15], target = 9 -> dict would be { 7: 0, 2: 1, -2: 2,}
        val dict = mutableMapOf<Int, Int>()

        for ((idx, num) in nums.withIndex()) {
            if (dict.containsKey(num)) {
                return intArrayOf(idx, dict.getValue(num))
            }
            val complement = target - num
            dict[complement] = idx
        }

        return intArrayOf()
    }
}