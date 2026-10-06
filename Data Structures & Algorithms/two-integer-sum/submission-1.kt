class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
         val seen = mutableMapOf<Int, Int>()

        for ((i, num) in nums.withIndex()) {
            val missing = target - num

            if (missing in seen) {
                return intArrayOf(seen[missing]!!, i)
            }

            seen[num] = i
        }

        return intArrayOf()

    }
}
