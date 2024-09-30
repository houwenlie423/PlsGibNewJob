package two_pointers


/**
 * @author Houwen Lie (houwenlie98@gmail.com)
 * @version 03_3_sum, v 0.1 Mon 9/30/2024 5:48 AM by Houwen Lie
 * @problem 3Sum - https://leetcode.com/problems/3sum/description/
 */

// This is a pretty challenging problem, but is also generally a good array + two pointer problem
object ThreeSum {

    operator fun invoke(nums: IntArray): List<List<Int>> {
        // Sort input in place so that we can kind of expect what we're getting next
        // See Two Sum II
        nums.sort()

        val result = mutableListOf<List<Int>>()

        // Loop from firstIndex until last 3 item (so that we don't get out of bound)
        for (idx in 0..<nums.lastIndex) {
            val currentNum = nums[idx]

            // To prevent duplicate, we skip same num in a row
            if (idx != 0 && currentNum == nums[idx - 1]) {
                continue
            }

            // From now on it's basically Two Sum II
            // For each num in array, we find a pair that sum up to it's complement
            // (Ex : if currentNum is -4, we want to find a pair that sum up to 4 so that in the end we get sum of 0)
            val target = 0 - currentNum
            var (left, right) = Pair(idx + 1, nums.lastIndex)
            while (left < right) {
                val sum = nums[left] + nums[right]
                if (sum == target) {
                    result.add(listOf(currentNum, nums[left], nums[right]))

                    // This is where it's slightly different with Two Sum II
                    // In Two Sum II, we know there is only 1 pair, so we'd just quick return once we find a match
                    // However here, there is no guarantee that each num only has 1 pair that sum up to it's complement
                    // That's why we need to keep going
                    // (Ex : input is [-1,0,1,2,-1,-4], and currentNum is -1, thus complement is 1. Both 0+1 and 2 + (-1) match)
                    // We also want to move the pointers until we find different numbers
                    while (left < right && nums[left] == nums[left + 1]) left++
                    while (left < right && nums[right] == nums[right - 1]) right--
                    left++
                    right--
                } else if (sum < target) {
                    left++
                } else {
                    right--
                }
            }
        }

        return result
    }

}